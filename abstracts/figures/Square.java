package figures;

public class Square extends Figure{
    
    private double side;

    public Square(String res, double side) {
        super(res);
        this.side = side;
    }

    public double CalcArea() {
        return roundOut(Math.pow(side, 2), 3);
    }

    public double CalcPerimeter() {
        return roundOut(4*side, 3);
    }

    public double CalcDiameter() {
        return 0;
    }

    public double CalcSemiPerimeter() {
        return roundOut(CalcPerimeter() / 2, 3);
    }

}
