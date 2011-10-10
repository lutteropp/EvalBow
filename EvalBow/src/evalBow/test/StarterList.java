package evalBow.test;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import evalBow.model.Archer;
import evalBow.model.Category;

public class StarterList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		      SimplePDF pdf = new SimplePDF();
		      Document document = new Document(PageSize.A4);
		      PdfWriter.getInstance(document,new FileOutputStream("StarterList.pdf"));
		      document.open();
		      
		      PdfPTable table = new PdfPTable(4); // Code 1

		      List<Archer> archers = new ArrayList<Archer>();
		      Category enteriche = new Category("Enteriche Recurve");
		      archers.add(new Archer("Donald Duck","1. BSC Entenhausen",0,enteriche));
		      archers.add(new Archer("Gustav Gans","1. BSC Entenhausen",0,enteriche));
		      
		      table.addCell("Name");
		      table.addCell("Verein");
		      table.addCell("Kategorie");
		      table.addCell("foo");
		      
		      for (Archer archer: archers) {
		    	  table.addCell(archer.getName());
		    	  table.addCell(archer.getClub());
		    	  table.addCell(archer.getCategory().getName());
		    	  table.addCell("Hello World");
		      }				
		      
		      document.add(table);		
				
		      document.add(new Paragraph("this is a test."));
		      document.close();
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
	}

}
