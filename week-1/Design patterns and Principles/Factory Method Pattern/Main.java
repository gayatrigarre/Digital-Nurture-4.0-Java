package factorymethodpatternexample;

public class Main {
	 public static void main(String[] args) {
	        Documentfactory wordFactory = new Worddocumentfactory();
	        Document wordDoc = wordFactory.createDocument();
	        wordDoc.open();

	        Documentfactory pdfFactory = new Pdfdocumentfactory();
	        Document pdfDoc = pdfFactory.createDocument();
	        pdfDoc.open();

	        Documentfactory excelFactory = new Exceldocumentfactory();
	        Document excelDoc = excelFactory.createDocument();
	        excelDoc.open();
	    }
}
