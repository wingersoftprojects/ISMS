/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;
import com.aspose.words.BreakType;
import com.aspose.words.ConvertUtil;
import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;
import com.aspose.words.PageSetup;
import com.aspose.words.RelativeHorizontalPosition;
import com.aspose.words.RelativeVerticalPosition;
import com.aspose.words.WrapType;
import entityclasses.Current_staff_documents;
import entityclasses.Document_type;
import entityclasses.Task_document;
import entityclasses.ISMSPersistentManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.ConnectException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.util.PDFMergerUtility;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.UploadedFile;
import utilities.GeneralUtilities;
import utilities.GlobalSettingsBean;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class Task_documentBean implements Serializable {

    private Task_document task_document;
    private String formstate;
    private UploadedFile file;
    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    @ManagedProperty("#{listBean}")
    private ListBean listBean;
    @ManagedProperty("#{staffBean}")
    private StaffBean staffBean;

    public StaffBean getStaffBean() {
        return staffBean;
    }

    private List<Task_document> task_documentList;

    public List<Task_document> getTask_documentList() {
        try {
            task_documentList = null;
            task_documentList = Task_document.queryTask_document(null, "task_document_id desc");
        } catch (PersistentException ex) {
            Logger.getLogger(Task_documentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("List", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
        return task_documentList;
    }

    public void setTask_documentList(List<Task_document> task_documentList) {
        this.task_documentList = task_documentList;
    }

    public void setStaffBean(StaffBean staffBean) {
        this.staffBean = staffBean;
    }

    public ListBean getListBean() {
        return listBean;
    }

    public void setListBean(ListBean listBean) {
        this.listBean = listBean;
    }

    public Task_documentBean() {
        formstate = "view";
        task_document = new Task_document();
    }

    public String getFormstate() {
        return formstate;
    }

    public void setFormstate(String formstate) {
        this.formstate = formstate;
    }

    public Task_document getTask_document() {
        return task_document;
    }

    public void setTask_document(Task_document task_document) {
        this.task_document = task_document;
    }

    public void cancel() {
        if (task_document != null) {
            try {
                ISMSPersistentManager.instance().getSession().evict(task_document);
            } catch (PersistentException ex) {
                Logger.getLogger(Task_documentBean.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("Cancel", new FacesMessage(ex.getMessage()));
                GeneralUtilities.clearsession();
            }
        }
        this.task_document = null;
        formstate = "view";
    }

    public void view(Task_document object) {
        this.task_document = object;
        formstate = "view";
    }

    public void delete(Task_document object) {
        this.task_document = object;
    }

    public void add() {
        task_document = new Task_document();
        formstate = "add";
    }

    public void add(Document_type document_type) {
        task_document = new Task_document();
        task_document.setDocument_type(document_type);
        formstate = "add";
    }

    public void edit(Task_document object) {
        this.task_document = object;
        formstate = "edit";
    }

    public void save() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            if (task_document.getTask_document_id() > 0) {
                ISMSPersistentManager.instance().getSession().merge(task_document);
            } else {
                task_document.save();
            }
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(task_document);
            task_document = null;
            //listBean.refreshlists("Task_document");
        } catch (PersistentException ex) {
            Logger.getLogger(Task_documentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Save", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    public void delete() {
        try {
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();

            Object findAAgain = ISMSPersistentManager.instance().getSession().merge(task_document);
            ISMSPersistentManager.instance().getSession().delete(findAAgain);
            t.commit();
            formstate = "view";
            ISMSPersistentManager.instance().getSession().evict(task_document);
            this.task_document = null;
            //listBean.refreshlists("Task_document");
        } catch (PersistentException ex) {
            Logger.getLogger(Task_documentBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("Delete", new FacesMessage(ex.getMessage()));
            GeneralUtilities.clearsession();
        }
    }

    /**
     * @return the file
     */
    public UploadedFile getFile() {
        return file;
    }

    public void handleFileUpload(FileUploadEvent event) {

        try {
            String filename = GeneralUtilities.simpleDateFormat().format(new Date()) + "_" + event.getFile().getFileName();
            InputStream inputStream = event.getFile().getInputstream();
            OutputStream out = new FileOutputStream(new File(GlobalSettingsBean.getDOCROOT(), filename));
            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = inputStream.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            task_document.setDocument_url(filename);
            task_document.setAdd_date(new Timestamp(new Date().getTime()));
            task_document.setAdd_user(loginBean.getUser_detail());
            inputStream.close();
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private DefaultStreamedContent download;

    public void setDownload(DefaultStreamedContent download) {
        this.download = download;
    }

    public DefaultStreamedContent getDownload() throws Exception {
        return download;
    }

    public void prepDownload(String filename) {
        InputStream input = null;
        try {
            File f = new File(GlobalSettingsBean.getDOCROOT(), filename);
            input = new FileInputStream(f);
            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            setDownload(new DefaultStreamedContent(input, externalContext.getMimeType(f.getName()), f.getName()));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeneralUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void printalldocuments(List<Current_staff_documents> current_staff_documents) {
        if (current_staff_documents.isEmpty()) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please select atleast one document!");
            FacesContext.getCurrentInstance().addMessage("Validation", message);
            return;
        }
//GeneralUtilities.simpleDateFormat().format(new Date())
        List<String> fileStrings = new ArrayList<>();
        String dataDirIn = GlobalSettingsBean.getDOCROOT();
        String dataDirOut = GlobalSettingsBean.getDOCROOT_CONVERT();
        String filename = GeneralUtilities.simpleDateFormat().format(new Date());
        int x = 1;
        for (Current_staff_documents c : current_staff_documents) {
            filename = filename + x;
            if (checkdoctype(c.getTask_document().getDocument_url()).equals("image")) {
                try {
                    convertImageToPdf(dataDirIn + "\\" + c.getTask_document().getDocument_url(), dataDirOut + "\\" + filename + ".pdf");
                    fileStrings.add(dataDirOut + "\\" + filename + ".pdf");
                } catch (Exception ex) {
                    Logger.getLogger(Task_documentBean.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (checkdoctype(c.getTask_document().getDocument_url()).equals("word")) {
                try {
                    File inputFile = new File(dataDirIn + "\\" + c.getTask_document().getDocument_url());
                    File outputFile = new File(dataDirOut + "\\" + filename + ".pdf");

// connect to an OpenOffice.org instance running on port 8100
                    OpenOfficeConnection connection = new SocketOpenOfficeConnection(8100);
                    connection.connect();

// convert
                    DocumentConverter converter = new OpenOfficeDocumentConverter(connection);
                    converter.convert(inputFile, outputFile);

// close the connection
                    connection.disconnect();
                    fileStrings.add(dataDirOut + "\\" + filename + ".pdf");
                } catch (ConnectException ex) {
                    Logger.getLogger(Task_documentBean.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (checkdoctype(c.getTask_document().getDocument_url()).equals("pdf")) {
                fileStrings.add(dataDirIn + "\\" + c.getTask_document().getDocument_url());
            }
            x++;
        }
        try {
            PDFMergerUtility ut = new PDFMergerUtility();
            for (String s : fileStrings) {
                ut.addSource(new File(s));
                ut.setDestinationFileName(dataDirOut + "\\" + filename + x + ".pdf");
            }
            ut.mergeDocuments();

            /**
             * Set download
             */
            InputStream input = null;
            File f = new File(dataDirOut + "\\" + filename + x + ".pdf");
            input = new FileInputStream(f);
            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            setDownload(new DefaultStreamedContent(input, externalContext.getMimeType(f.getName()), f.getName()));
            /**
             * End set download
             */
        } catch (IOException ex) {
            Logger.getLogger(Task_documentBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (COSVisitorException ex) {
            Logger.getLogger(Task_documentBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String checkdoctype(String docurl) {
        if (docurl.toLowerCase().contains(".jpg") || docurl.toLowerCase().contains(".png") || docurl.toLowerCase().contains(".jpeg") || docurl.toLowerCase().contains(".gif")) {
            return "image";
        } else if (docurl.toLowerCase().contains(".pdf") || docurl.toLowerCase().contains(".PDF")) {
            return "pdf";
        } else if (docurl.toLowerCase().contains(".doc") || docurl.toLowerCase().contains(".docx")) {
            return "word";
        } else if (docurl.toLowerCase().contains(".xls") || docurl.toLowerCase().contains(".xlsx")) {
            return "excel";
        } else {
            return "";
        }
    }

    public static void convertImageToPdf(String inputFileName, String outputFileName) throws Exception {
        // Create Aspose.Words.Document and DocumentBuilder.
        // The builder makes it simple to add content to the document.
        Document doc = new Document();
        DocumentBuilder builder = new DocumentBuilder(doc);

        // Load images from the disk using the approriate reader.
        // The file formats that can be loaded depends on the image readers available on the machine.
        ImageInputStream iis = ImageIO.createImageInputStream(new File(inputFileName));
        ImageReader reader = ImageIO.getImageReaders(iis).next();
        reader.setInput(iis, false);

        try {
            // Get the number of frames in the image.
            int framesCount = reader.getNumImages(true);

            // Loop through all frames.
            for (int frameIdx = 0; frameIdx < framesCount; frameIdx++) {
                // Insert a section break before each new page, in case of a multi-frame image.
                if (frameIdx != 0) {
                    builder.insertBreak(BreakType.SECTION_BREAK_NEW_PAGE);
                }

                // Select active frame.
                BufferedImage image = reader.read(frameIdx);

                // We want the size of the page to be the same as the size of the image.
                // Convert pixels to points to size the page to the actual image size.
                PageSetup ps = builder.getPageSetup();

                ps.setPageWidth(ConvertUtil.pixelToPoint(image.getWidth()));
                ps.setPageHeight(ConvertUtil.pixelToPoint(image.getHeight()));

                // Insert the image into the document and position it at the top left corner of the page.
                builder.insertImage(
                        image,
                        RelativeHorizontalPosition.PAGE,
                        0,
                        RelativeVerticalPosition.PAGE,
                        0,
                        ps.getPageWidth(),
                        ps.getPageHeight(),
                        WrapType.NONE);
            }
        } finally {
            if (iis != null) {
                iis.close();
                reader.dispose();
            }
        }

        // Save the document to PDF.
        doc.save(outputFileName);
    }

    public void sendEmail() {

    }

    public void prepopulatepassportinfo() {
        boolean exists = false;
        try {
            if (task_document.getDocument_type().getDoc_type_name().equals("PASSPORT")) {
                if (staffBean.getFormstate().equals("edit")) {
                    for (Current_staff_documents c : new ArrayList<Current_staff_documents>(staffBean.getStaff().getCurrent_staff_documents())) {
                        if (c.getDocument_type().getDoc_type_name().equals("PASSPORT")) {
                            exists = true;
                            break;
                        }
                    }
                }
                if (!exists) {
                    task_document.setExpiry_date(staffBean.getStaff().getPp_date_of_expiry());
                    task_document.setDocument_ref_no(staffBean.getStaff().getPp_passport_no());
                }
            } else {
                task_document.setExpiry_date(null);
                task_document.setDocument_ref_no("");
            }
        } catch (NullPointerException npe) {

        }
    }
    
    public void calldialog() {
        Map<String, Object> options = new HashMap<>();
//        options.put("height", 400);
//        options.put("width", 700);
        options.put("modal", true);
        org.primefaces.context.RequestContext.getCurrentInstance().openDialog("task_documentdialog", options, null);
    }

    public void closeDialog(Task_document task_document) {
        if (task_document.getDocument_type() == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please Set the document type!");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            return;
        }
        if (task_document.getDocument_type().getIs_renewable().equals("Yes") && task_document.getExpiry_date() == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "This document type requires an Expiry Date!");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            return;
        }
        if (task_document.getDocument_url() == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please Upload a document!");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            return;
        }
        if (task_document.getDirection() == null || task_document.getDirection().length() == 0) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation", "Please set the document Direction!");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            return;
        }
        try {
            task_document.save();
            PersistentTransaction t = ISMSPersistentManager.instance().getSession().beginTransaction();
            t.commit();
        } catch (PersistentException ex) {
            Logger.getLogger(Task_documentBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestContext.getCurrentInstance().closeDialog(task_document);
    }

    /**
     * @param file the file to set
     */
    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public void uploadM() {
        if (this.getFile() != null) {
            System.out.println(this.getFile().getFileName());
        }
    }
}
