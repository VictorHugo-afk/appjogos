package  interface;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class janela extends JFrame{
    pubilc Janela(){
        this.setBounds(0, 0, 1920, 1080);
        CardLayout controleTela = new CardLayout();
        JPanel telas = new JPanel(controleTela);
        LoginPanel LoginPanel = new LoginPanel(telas, this);
        PrincipalPanel PrincipalPanel = new PrincipalPanel(telas, this);
    }
}