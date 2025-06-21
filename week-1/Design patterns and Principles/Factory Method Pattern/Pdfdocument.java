package factorymethodpatternexample;

public class Pdfdocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}