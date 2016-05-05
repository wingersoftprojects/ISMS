/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bajuna
 */
public class ImageToPDF {

    public static void main(String[] args) {
        try {
            //Create Document Object
            //Document convertJpgToPdf = new Document();
            Document convertJpgToPdf = new Document(PageSize.A4); 
            int indentation = 0;
            //Create PdfWriter for Document to hold physical file
            PdfWriter.getInstance(convertJpgToPdf, new FileOutputStream("d:\\CUSTOMS.pdf"));
            convertJpgToPdf.open();
            //Get the input image to Convert to PDF
            Image convertJpg = Image.getInstance("d:\\CUSTOMS.jpg");
            //Add image to Document
            float scaler = ((convertJpgToPdf.getPageSize().getWidth() - convertJpgToPdf.leftMargin()
                    - convertJpgToPdf.rightMargin() - indentation) / convertJpg.getWidth()) * 100;

            convertJpg.scalePercent(scaler);
            convertJpgToPdf.add(convertJpg);
            convertJpgToPdf.add(convertJpg);

//            File file = new File("D:\\Memo on Burundi Top Up.doc");
//            convertJpgToPdf.add(new Paragraph(org.apache.commons.io.FileUtils.readFileToString(file)));

            //Close Document
            convertJpgToPdf.close();
            System.out.println("Successfully Converted JPG to PDF in iText");
        } catch (DocumentException ex) {
            Logger.getLogger(ImageToPDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImageToPDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImageToPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
