package factorymethodpatternexample;

public class Exceldocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}