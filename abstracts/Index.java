
/**
 * Index
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import figures.*;

public class Index extends JFrame implements ActionListener {

    private JLabel areaLabel, perimeterLabel, diameterLabel, semiperimeterLabel, resArea, resPerimeter, resDiameter, resSemiperimeter, figureLabel;
    private JButton squareBtn, triangleBtn, circleBtn, drawBtn, areaBtn, perimeterBtn, diameterBtn, semiperimeterBtn;
    private double radio, side, sideA, sideB, sideC;
    private String area, perimeter, diameter, figure, semiperimeter;
    boolean flag = false;

    public Index() {
        setLayout(null);
        /* 
            Buttons
        */
        squareBtn = new JButton("Cuadrado");
        squareBtn.setBounds(10, 10, 150, 30);
        add(squareBtn);
        triangleBtn = new JButton("Triagulo");
        triangleBtn.setBounds(170, 10, 150, 30);
        add(triangleBtn);
        circleBtn = new JButton("Circulo");
        circleBtn.setBounds(330, 10, 150, 30);
        add(circleBtn);
        drawBtn = new JButton("Dibujar");
        drawBtn.setBounds(490, 10, 150, 30);
        add(drawBtn);
        areaBtn = new JButton("Area");
        areaBtn.setBounds(660, 10, 150, 30);
        add(areaBtn);
        perimeterBtn = new JButton("Perimetro");
        perimeterBtn.setBounds(10, 50, 150, 30);
        add(perimeterBtn);
        diameterBtn = new JButton("Diametro");  
        diameterBtn.setBounds(170, 50, 150, 30);
        add(diameterBtn);
        semiperimeterBtn = new JButton("Semiperimetro");  
        semiperimeterBtn.setBounds(330, 50, 150, 30);
        add(semiperimeterBtn);

        squareBtn.addActionListener(this);
        triangleBtn.addActionListener(this);
        circleBtn.addActionListener(this);
        drawBtn.addActionListener(this);
        areaBtn.addActionListener(this);
        perimeterBtn.addActionListener(this);
        diameterBtn.addActionListener(this);
        semiperimeterBtn.addActionListener(this);

         /* 
            Labels
        */
        areaLabel = new JLabel("Area: ");
        areaLabel.setBounds(10, 100, 100, 10);
        add(areaLabel);
        perimeterLabel = new JLabel("Perimetro: ");
        perimeterLabel.setBounds(10, 130, 100, 10);
        add(perimeterLabel);
        diameterLabel = new JLabel("Diametro: ");
        diameterLabel.setBounds(10, 160, 100, 10);
        add(diameterLabel);
        semiperimeterLabel = new JLabel("Semiperimetro: ");
        semiperimeterLabel.setBounds(10, 190, 150, 15);
        add(semiperimeterLabel);
        resArea = new JLabel("");
        resArea.setBounds(130, 100, 250, 10);
        add(resArea);
        resPerimeter = new JLabel("");
        resPerimeter.setBounds(130, 130, 250, 10);
        add(resPerimeter);
        resDiameter = new JLabel("");
        resDiameter.setBounds(130, 160, 250, 10);
        add(resDiameter);
        resSemiperimeter = new JLabel("");
        resSemiperimeter.setBounds(130, 190, 250, 10);
        add(resSemiperimeter);

        figureLabel = new JLabel("");
        figureLabel.setBounds(500, 100, 250, 20);
        add(figureLabel);
        
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (flag) {
            switch (figure) {
                case "Circle":
                    g.setColor(Color.BLACK);
                    g.fillOval(500, 170, (int) radio*2, (int) radio*2);
                    break;
                case "Square":
                    g.setColor(Color.RED);
                    g.fillRect(500, 170, (int) side, (int) side);
                    break;

                case "Triangle":
                    g.setColor(Color.BLUE);
                    int vX [] = {500, 500+(int) sideA, 500-(int) sideB};
                    int vY [] = {170, 170+(int) sideB, 170+(int) sideC};
                    g.fillPolygon(vX, vY, 3);
                    break;
            
                default:
                    break;
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == circleBtn) {
            /* Math.PI; */            
            options("Circle");
            Circle objCircle = new Circle("", radio);
            area = ToString(objCircle.CalcArea());
            perimeter = ToString(objCircle.CalcPerimeter());
            semiperimeter = ToString(objCircle.CalcSemiPerimeter());
            diameter = ToString(objCircle.CalcDiameter());
            figure = "Circle";
            figureLabel.setText(figure);           
        
        }

        if (e.getSource() == squareBtn) {        
            options("Square");
            Square objSquare = new Square("", side);
            area = ToString(objSquare.CalcArea());
            perimeter = ToString(objSquare.CalcPerimeter());
            diameter = "El cuadrado no tiene diametro";
            semiperimeter = ToString(objSquare.CalcSemiPerimeter());
            figure = "Square";
            figureLabel.setText(figure);
        }

        if (e.getSource() == triangleBtn) {
            options("Triangle");
            Triangle objTriangle = new Triangle("", sideA, sideB, sideC);
            area = ToString(objTriangle.CalcArea());
            perimeter = ToString(objTriangle.CalcPerimeter());
            semiperimeter = ToString(objTriangle.CalcSemiPerimeter());
            diameter = "El triangulo no tiene diametro";
            figure = "Triangle";
            figureLabel.setText(figure);
        }

        if (e.getSource() == areaBtn) {
            if (figure == null) {
                JOptionPane.showMessageDialog(this, "Porfavor escoja una figura");
            } else {
                resArea.setText(area);
            }
        }

        if (e.getSource() == perimeterBtn) {
            if (figure == null) {
                JOptionPane.showMessageDialog(this, "Porfavor escoja una figura");
            } else {
                resPerimeter.setText(perimeter);
            }
        }

        if (e.getSource() == diameterBtn) {
            if (figure == null) {
                JOptionPane.showMessageDialog(this, "Porfavor escoja una figura");
            } else {
                resDiameter.setText(diameter);
            }
        }

        if (e.getSource() == semiperimeterBtn) {
            if (figure == null) {
                JOptionPane.showMessageDialog(this, "Porfavor escoja una figura");
            } else {
                resSemiperimeter.setText(semiperimeter);    
            }
        }

        if (e.getSource() == drawBtn) {
            /* Draw draw = new Draw(figure, 10, 10, (int) radio, (int) side,(int) sideA, (int) sideB, (int) sideC);
            panel.add(draw); */
            flag = true;
            repaint();
        }
    }

    public String ToString(double val) {
        return String.valueOf(val);
    }

    public void options(String opt) {
        switch (opt) {
            case "Circle":
                radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del circulo"));                
                break;

            case "Triangle":
                sideA = Double.parseDouble(JOptionPane.showInputDialog("Digite el lado A del triangulo"));
                sideB = Double.parseDouble(JOptionPane.showInputDialog("Digite el lado B del triangulo"));
                sideC = Double.parseDouble(JOptionPane.showInputDialog("Digite el lado C del triangulo"));
                break;
            case "Square":
                side = Double.parseDouble(JOptionPane.showInputDialog("Digite el lade del cuadrado"));
                break;
        
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Index index = new Index();

        index.setBounds(0, 0, 900, 600);
        index.setVisible(true);
        index.setResizable(false);
        index.setLocationRelativeTo(null);
        index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}