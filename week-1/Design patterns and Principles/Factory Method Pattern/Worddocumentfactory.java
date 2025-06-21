package factorymethodpatternexample;

public class Worddocumentfactory extends Documentfactory {
    @Override
    public Document createDocument() {
        return new Worddocument();
    }
}
