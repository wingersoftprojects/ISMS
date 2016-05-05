/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import entityclasses.Task_document;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
public class TestEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PersistentException {
        String from = "newtonajuna@wingersoft.co.ug";
        String to = "bajuna@ura.go.ug";
        String subject = "Test";
        String message = "Test";
        SendMail sendMail = new SendMail(from, to, subject, message, Task_document.queryTask_document("task_id=99", null));
        sendMail.send();
    }

}
