import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App extends JFrame implements TxtListener{
    String text;
    public App() { 
        this.text = "Default Text";
    }

    
    public void init(String txtToEdit) {
        Txt txt = new Txt();
        txt.addTxtListener(this);
        
        txt.edit(txtToEdit);
    }
    
    public void show() {
        Txt txt = new Txt();
        txt.addTxtListener(this);
        this.text = txt.viewContent();
    }

    @Override
    public void onTextEdited(Txt txt) {
        JOptionPane.showMessageDialog(null, "Se ha editado el texto");
        System.out.println("Se ha editado el texto");
    }

    @Override
    public void onShowTxt(Txt txt) {
        JOptionPane.showMessageDialog(null, "Se ha mostrado el texto");
    }

}
