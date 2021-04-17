package figures;

public class Triangle extends Figure {

    private double sideA, sideB, sideC;

    public Triangle(String res, double sideA, double sideB, double sideC) {
        super(res);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideB;
    }

    public double CalcArea() {
        double sp = CalcSemiPerimeter();
        double area = (Math.sqrt(sp*(sp-sideA)*(sp-sideB)*(sp-sideC)));
        return roundOut(area, 3);
    }

    public double CalcPerimeter() {
        return roundOut(sideA + sideB + sideC, 3);
    }

    public double CalcDiameter() {
        return 0;
    }

    public double CalcSemiPerimeter() {
        return roundOut(CalcPerimeter() / 2, 3);
    }

}
