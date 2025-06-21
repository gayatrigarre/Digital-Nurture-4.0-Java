package factorymethodpatternexample;

public class Exceldocumentfactory extends Documentfactory {
    @Override
    public Document createDocument() {
        return new Exceldocument();
    }
}
