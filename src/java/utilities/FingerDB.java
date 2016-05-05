package utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FingerDB {

    private static final String tableName = "agent";
    private static final String userColumn = "agent_id";
    private static final String print1Column = "fingerprint";
    private static final String print2Column = "print2";

    private String URL = "jdbc:mysql://localhost:3306/";
    private String host;
    private String database;
    private String userName;
    private String pwd;
    private java.sql.Connection connection = null;
    private String preppedStmtInsert = null;
    private String preppedStmtUpdate = null;
    private String preppedStmtUpdateafterverification = null;

    public class Record {

        int userID;
        byte[] fmdBinary;
        String agentSurname;
        String agentOthernames;

        Record(int ID, byte[] fmd,String AS, String AO) {
            userID = ID;
            fmdBinary = fmd;
            agentSurname=AS;
            agentOthernames=AO;
        }
    }

    public FingerDB(String _host, String db, String user, String password) {
        database = db;
        userName = user;
        pwd = password;
        host = _host;

        URL = "jdbc:mysql://" + host + ":3306/";
        preppedStmtInsert = "INSERT INTO " + tableName + "(" + userColumn + "," + print1Column + ") VALUES(?,?)";
        preppedStmtUpdate = "UPDATE " + tableName + " SET " + print1Column + "=?, status='Enrolled',currentaction='view' WHERE " + userColumn + "=?";
        preppedStmtUpdateafterverification = "UPDATE " + tableName + " SET currentaction='view' WHERE " + userColumn + "=?";
    }

    public void finalize() {
        try {
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void Open() throws SQLException {
        connection = DriverManager.getConnection(URL + database, userName, pwd);
    }

    public void Close() throws SQLException {
        connection.close();
    }

    public boolean UserExists(String userID) throws SQLException {
        String sqlStmt = "Select " + userColumn + " from " + tableName + " WHERE " + userColumn + "='" + userID + "'";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sqlStmt);
        return rs.next();
    }
    public boolean CurrentAction(int userID) throws SQLException {
        String sqlStmt = "Select " + userColumn + " from " + tableName + " WHERE " + userColumn + "=" + userID + " AND currentaction<>'view'";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sqlStmt);
        return rs.next();
    }

    public void Insert(String userID, byte[] print1) throws SQLException {
        java.sql.PreparedStatement pst = connection.prepareStatement(preppedStmtInsert);
        pst.setString(1, userID);
        pst.setBytes(2, print1);
        pst.execute();
    }

    public void UpdateAgentFingerPrint(int agent_id, byte[] fingerprint) throws SQLException {
        java.sql.PreparedStatement pst = connection.prepareStatement(preppedStmtUpdate);
        pst.setBytes(1, fingerprint);
        pst.setInt(2, agent_id);
        pst.execute();
    }
    public void UpdateAgentFingerPrint(int agent_id) throws SQLException {
        java.sql.PreparedStatement pst = connection.prepareStatement(preppedStmtUpdateafterverification);
        pst.setInt(1, agent_id);
        pst.execute();
    }

    public List<Record> GetAllFPData() throws SQLException {
        List<Record> listUsers = new ArrayList<Record>();
        String sqlStmt = "Select * from " + tableName;
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sqlStmt);
        while (rs.next()) {
            if (rs.getBytes(print1Column) != null) {
                listUsers.add(new Record(rs.getInt(userColumn), rs.getBytes(print1Column), rs.getString("agent_surname"), rs.getString("agent_other_names")));
            }
        }
        return listUsers;
    }

    public String GetConnectionString() {
        return URL + " User: " + this.userName;
    }

    public String GetExpectedTableSchema() {
        return "Table: " + tableName + " PK(VARCHAR(32)): " + userColumn + "VARBINARY(4000): " + print1Column;
    }
}
