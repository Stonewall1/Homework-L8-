package task2;

public class Main {
    public static void main(String[] args) {
        BaseConverter converter = new BaseConverter(110 , "K" , "F");
        double degree = converter.getDegree();
        converter.convert();
        System.out.println(degree + " " + converter.getSymbolFrom() + " = " + converter.getFinalDegree());

    }
}
