import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuGUI extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu exemplosMenu;
    private JMenuItem maiorMenuItem, divisibilidadeMenuItem, maiorMenorMenuItem, mediaMenuItem;

    public MenuGUI() {
        super("Exemplos");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria o menu
        menuBar = new JMenuBar();
        exemplosMenu = new JMenu("Menu: ");

        // Adiciona os itens do menu
        maiorMenuItem = new JMenuItem("Maior de três números");
        maiorMenuItem.addActionListener(this);
        exemplosMenu.add(maiorMenuItem);

        divisibilidadeMenuItem = new JMenuItem("Divisibilidade");
        divisibilidadeMenuItem.addActionListener(this);
        exemplosMenu.add(divisibilidadeMenuItem);

        maiorMenorMenuItem = new JMenuItem("Maior, Menor ou Igual");
        maiorMenorMenuItem.addActionListener(this);
        exemplosMenu.add(maiorMenorMenuItem);

        mediaMenuItem = new JMenuItem("Média de 4 notas");
        mediaMenuItem.addActionListener(this);
        exemplosMenu.add(mediaMenuItem);

        // Adiciona o menu à barra de menu
        menuBar.add(exemplosMenu);

        // Define a barra de menu da janela
        setJMenuBar(menuBar);
    }

    public void actionPerformed(ActionEvent evento) {
        
        if (evento.getSource() == maiorMenuItem) {
            // Executa o exemplo de encontrar o maior de três números
            new MaiorDeTresNumerosGUI().setVisible(true);
        } else if (evento.getSource() == divisibilidadeMenuItem) {
            // Executa o exemplo de verificar divisibilidade
            new DivisibilidadeGUI().setVisible(true);
        } else if (evento.getSource() == maiorMenorMenuItem) {
            // Executa o exemplo de encontrar o maior, menor ou igual
            new MaiorMenorIgualGUI().setVisible(true);
        } else if (evento.getSource() == mediaMenuItem) {
            //Executa o exemplo com médias
            new MediaNotasGUI().setVisible(true);
        }
    }

    public static void main(String[] args) {
        MenuGUI app = new MenuGUI();
        app.setVisible(true);
    }
}
