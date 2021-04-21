/**
 * Index
 */
import javax.swing.*;
import java.awt.event.*;

public class Index extends JFrame implements ActionListener{

    private JLabel label1, label2, label3, label4;
    private JTextField txt1, txt2, txt3, txt4;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6;

    public Index() {
        setLayout(null);

        label1 = new JLabel("Valor 1");
        label1.setBounds(10, 10, 100, 20);
        add(label1);
        label2 = new JLabel("Valor 2");
        label2.setBounds(220, 10, 100, 20);
        add(label2);
        label3 = new JLabel("Valor 1");
        label3.setBounds(10, 70, 100, 20);
        add(label3);
        label4 = new JLabel("Valor 2");
        label4.setBounds(220, 70, 100, 20);
        add(label4);

        txt1 = new JTextField();
        txt1.setBounds(10, 30, 200, 30);
        add(txt1);
        txt2 = new JTextField();
        txt2.setBounds(220, 30, 200, 30);
        add(txt2);
        txt3 = new JTextField();
        txt3.setBounds(10, 100, 200, 30);
        add(txt3);
        txt4 = new JTextField();
        txt4.setBounds(220, 100, 200, 30);
        add(txt4);

        btn1 = new JButton("Comparar int");
        btn1.setBounds(10, 140, 200, 30);
        add(btn1);
        btn2 = new JButton("Comparar String");
        btn2.setBounds(220, 140, 200, 30);
        add(btn2);
        btn3 = new JButton("Listas");
        btn3.setBounds(10, 180, 200, 30);
        add(btn3);
        btn4 = new JButton("Sumar int");
        btn4.setBounds(220, 180, 200, 30);
        add(btn4);
        btn5 = new JButton("Sumar String");
        btn5.setBounds(10, 220, 200, 30);
        add(btn5);
        btn6 = new JButton("Restar int");
        btn6.setBounds(220, 220, 200, 30);
        add(btn6);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn1) {
            Validations<Integer> comp = new Validations<Integer>();
            JOptionPane.showMessageDialog(null, "Este numero: " + comp.compN(Integer.parseInt(txt1.getText()), Integer.parseInt(txt2.getText())) +" es mayor");
        }

        if (e.getSource() == btn2) {
            Validations<String> comp = new Validations<String>();
            JOptionPane.showMessageDialog(null, "Esta cadena " + comp.compS(txt1.getText(), txt2.getText()) +" es mas grande");
        }

        if (e.getSource() == btn3) {
            Lista<Integer> x = new Lista<Integer>();
            for (int i = 0; i < 5; i++) {
                x.add(i+50);
            }

            Lista<Persona> list = new Lista<Persona>();
            Persona persona = new Persona(txt1.getText(), txt2.getText());
            Persona persona2 = new Persona(txt3.getText(), txt4.getText());
            list.add(persona);
            list.add(persona2);
            for (Persona p : list) {
                JOptionPane.showMessageDialog(null, "Persona en lista " + p.getNombre() + " " + p.getApellido());
            }
        }

        if (e.getSource() == btn4) {
            Validations<Integer> suma = new Validations<Integer>();
            JOptionPane.showMessageDialog(null, "La suma es: "+ suma.sumarN(Integer.parseInt(txt1.getText()), Integer.parseInt(txt2.getText())));
        }

        if (e.getSource() == btn5) {
            Validations<String> suma = new Validations<String>();
            JOptionPane.showMessageDialog(null, "El suma es: " + suma.sumS(txt1.getText(), txt2.getText()));
        }

        if (e.getSource() == btn6) {
            Validations<Integer> x = new Validations<Integer>();
            JOptionPane.showMessageDialog(null, "La resta es: " + x.restaN(Integer.parseInt(txt1.getText()), Integer.parseInt(txt2.getText())));
        }
    }
    public static void main(String[] args) {
        Index index = new Index();
        index.setBounds(0, 0, 500, 400);
        index.setVisible(true);
        index.setResizable(false);
        index.setLocationRelativeTo(null);
        index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}