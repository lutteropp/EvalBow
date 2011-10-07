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