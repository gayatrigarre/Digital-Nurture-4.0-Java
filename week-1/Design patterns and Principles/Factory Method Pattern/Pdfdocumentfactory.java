package factorymethodpatternexample;

	public class Pdfdocumentfactory extends Documentfactory {
	    @Override
	    public Document createDocument() {
	        return new Pdfdocument();
	    }
}
