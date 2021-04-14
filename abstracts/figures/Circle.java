package figures;


public class Circle extends Figure {

    private double radio;

    public Circle(String res, double radio) {
        super(res);
        this.radio = radio;
    }

    public double CalcArea() {
        return roundOut(Math.PI*Math.pow(radio, 2), 3);
    }

    public double CalcPerimeter() {
        return roundOut(2*Math.PI*radio, 3);
    }

    public double CalcDiameter() {
        return roundOut(2*radio, 3);
    }

    public double CalcSemiPerimeter() {
        return roundOut(CalcPerimeter() / 2, 3);
    }    

}
