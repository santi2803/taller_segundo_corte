import java.awt.*;

import javax.swing.*;

public class Draw extends JPanel {

    private String figure;
    private int x, y, radio, side, sideA, sideB, sideC;

    public Draw(String figure, int x, int y, int radio, int side, int sideA, int sideB, int sideC) {
        this.side = side;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.x = x;
        this.y = y;
        this.figure = figure;

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.BLACK);
        g.drawOval(10, 10, 20, 20);
        switch (figure) {
            case "Square":
                g.drawRect(x, y, side, side);
                break;

            case "Circle":
                System.out.println(this.radio);
                System.out.println("dibujado");
                break;
            
            case "Triangle":
                int [] vx1 = {500, 550, 450};
                int [] vy1 = {70, 120, 120};
                g.drawPolygon(vx1, vy1, 3);
                break;

            default:
                break;
        }
    }
}
