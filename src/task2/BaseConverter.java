package task2;

public class BaseConverter implements AnyConvertation {
    private double degree;
    private String symbolFrom; // C,K,F
    private String symbolTo; // C,K,F

    public BaseConverter(double degree, String symbolFrom, String symbolTo) {
        this.degree = degree;
        this.symbolFrom = symbolFrom;
        this.symbolTo = symbolTo;
    }

    public String getFinalDegree() {
        return switch (this.symbolTo) {
            case "K" -> degree + " in K";
            case "C" -> degree + " in C";
            case "F" -> degree + " in F";
            default -> "Retry";
        };
    }

    public String getSymbolFrom() {
        return symbolFrom;
    }

    public double getDegree() {
        return degree;
    }

    @Override
    public void convert() {
        if(symbolFrom.equals("C") && symbolTo.equals("K")){
            this.degree = this.degree + 273.15;
        }
        else if(symbolFrom.equals("K") && symbolTo.equals("C")){
            this.degree = this.degree - 273.15;
        }
        else if(symbolFrom.equals("C") && symbolTo.equals("F")){
            this.degree = this.degree * 1.8 + 32;
        }
        else if(symbolFrom.equals("F") && symbolTo.equals("C")){
            this.degree = (this.degree - 32) / 1.8;
        }
        else if(symbolFrom.equals("K") && symbolTo.equals("F")){
            this.degree = ((this.degree - 273.15) * 1.8) + 32;
        }
        else if(symbolFrom.equals("F") && symbolTo.equals("K")){
            this.degree = ((this.degree - 32) / 1.8) + 273.15;
        }
        else System.out.println("Retry");
    }
}
