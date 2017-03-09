package MovieAggregator;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.util.*;


public class PdfWrite extends writer {
	public void write(Map<Integer,List<String>> data, String fileName){
		String FileName = "OutputInPdf.pdf";
        try {
            OutputStream out = new FileOutputStream(new File(FileName));
            Document doc = new Document();
            
            PdfWriter.getInstance(doc, out);
            doc.open();
            
            doc.add(new Paragraph("Movie Details"));
            
            
            for(Integer i : data.keySet()) {
            	doc.add(new Paragraph(">>.."));
            	doc.add(new Paragraph((i+1) +" : "+ data.get(i)));
            }            
            doc.close();
            out.flush();
            out.close();
            
            System.out.println("generated file location::"+ FileName);
        } catch (Exception e) {
            e.printStackTrace();;
        }
    }

}
