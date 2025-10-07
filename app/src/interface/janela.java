package  interface;
import java.security.Principal;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class janela extends JFrame{
    pubilc Janela(){
        this.setBounds(0, 0, 1920, 1080);
        CardLayout controleTela = new CardLayout();
        JPanel telas = new JPanel(controleTela);
        LoginPanel LoginPanel = new LoginPanel(telas, this);
        PrincipalPanel PrincipalPanel = new PrincipalPanel(telas, this);

        this.add(telas);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setVisible(true);
    }
}