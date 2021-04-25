import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.*;

/**
 * Index
 */
public class Index extends JFrame implements ActionListener {

    JButton btn1, btn2;
    JLabel label1;

    public Index() {
        setLayout(null);

        btn1 = new JButton("Editar");
        btn1.setBounds(10, 10, 300, 60);
        add(btn1);
        btn2 = new JButton("Mostrar");
        btn2.setBounds(10, 80, 300, 60);
        add(btn2);

        label1 = new JLabel("");
        label1.setBounds(10, 160, 300, 60);
        add(label1);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        App app = new App();
        if (e.getSource() == btn1) {
            String text = JOptionPane.showInputDialog(null, "Digite un texto");
            app.init(text);
        }

        if (e.getSource() == btn2) {
            Txt txt = new Txt();
            app.show();
            label1.setText(txt.viewContent());
        }
    }

    public static void main(String[] args) {
        Index index = new Index();

        index.setBounds(0, 0, 320, 300);
        index.setVisible(true);
        index.setResizable(false);
        index.setLocationRelativeTo(null);
        index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}