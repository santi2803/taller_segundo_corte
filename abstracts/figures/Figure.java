package figures;

public abstract class Figure {
    
    private String result;

    public Figure(String result) {
        this.result = result;
    }

    public abstract double CalcArea();
    public abstract double CalcPerimeter();
    public abstract double CalcDiameter();
    public abstract double CalcSemiPerimeter();

    public String getResult() {
        return this.result;
    }

    public double roundOut(double num, int nDecimals) {
        double intPart, result;
        result = num;

        intPart = Math.floor(result);
        result = (result-intPart)*Math.pow(10, nDecimals);
        result = Math.round(result);
        result = (result/Math.pow(10, nDecimals))+intPart;

        return result;
    }

}
