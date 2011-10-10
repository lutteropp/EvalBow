package evalBow.test;
import java.io.*;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

public class SimplePDF {
	
  private final String TEST_MESSAGE = "Hallo Welt.";

  public static void main(String[] args) {
    try {
      SimplePDF pdf = new SimplePDF();
      Document document = new Document(PageSize.A4);
      PdfWriter.getInstance(document,new FileOutputStream("SimplePdf.pdf"));
      document.open();
      
      PdfPTable table = new PdfPTable(2); // Code 1

		// Code 2
		table.addCell("1");
		table.addCell("2");
		
		// Code 3
		table.addCell("3");
		table.addCell("4");
		
		// Code 4
		table.addCell("5");
		table.addCell("6");
		
		// Code 5
		document.add(table);		
		
      document.add(new Paragraph(pdf.getLines()));
      document.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
 }

  /////////////////////////////////////////////////////

private String getLines() throws IOException {
    return TEST_MESSAGE;
  }
}