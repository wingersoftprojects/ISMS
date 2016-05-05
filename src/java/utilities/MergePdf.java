/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfImportedPage;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.pdfbox.util.PDFMergerUtility;

/**
 *
 * @author bajuna
 */
public class MergePdf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<InputStream> list = new ArrayList<>();
        try {
            // Source pdfs
            list.add(new FileInputStream(new File("d:\\Docs\\Doc2PdfSave Out.pdf")));
            list.add(new FileInputStream(new File("d:\\Docs\\Doc2PdfSave Out2.pdf")));
            list.add(new FileInputStream(new File("d:\\Docs\\TestJpg Out.pdf")));

            // Resulting pdf
            OutputStream out = new FileOutputStream(new File("D:\\Docs\\result.pdf"));

            doMerge(list, out);

            PDFMergerUtility ut = new PDFMergerUtility();
            ut.addSource(new File("d:\\Docs\\Doc2PdfSave Out.pdf"));
            ut.addSource(new File("d:\\Docs\\Doc2PdfSave Out2.pdf"));
            ut.addSource(new File("d:\\Docs\\TestJpg Out.pdf"));
            ut.setDestinationFileName("D:\\Docs\\result2.pdf");
            ut.mergeDocuments();
        } catch (Exception ex) {

        }
    }

    /**
     * Merge multiple pdf into one pdf
     *
     * @param list of pdf input stream
     * @param outputStream output file output stream
     * @throws DocumentException
     * @throws IOException
     */
    public static void doMerge(List<InputStream> list, OutputStream outputStream) throws IOException, DocumentException {
        Document document = new Document();
        document.setPageSize(PageSize.A4);
        PdfWriter writer = PdfWriter.getInstance(document, outputStream);
        document.open();
        PdfContentByte cb = writer.getDirectContent();

        for (InputStream in : list) {
            PdfReader reader = new PdfReader(in);
            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                document.newPage();
                //import the page from source pdf
                PdfImportedPage page = writer.getImportedPage(reader, i);
                //add the page to the destination pdf
                cb.addTemplate(page, 0, 0);
            }
        }

        outputStream.flush();
        document.close();
        outputStream.close();
    }

}
