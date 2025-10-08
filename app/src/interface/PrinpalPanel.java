
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrinpalPanel extends TelaPanel{
    public PrinciaplPanel(JPanel telas, JFrame janelas){
        super(telas, janelas);
        JLabel mensagem = new JLabel("Conteúdo de Principal Panel");
        JButton botao = new JButton("Voltar");
        botao.addActionListener(this);

        this.add(botao);
        this.add(mensagem);
    }

    public void executarBotao(ActionEvent e){
        trocaTela("Tela Login");
    }
}
