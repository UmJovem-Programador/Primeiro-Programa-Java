import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MaiorDeTresNumerosGUI extends JFrame implements ActionListener {

    private JLabel label1, label2, label3, resultado;
    private JTextField campo1, campo2, campo3;
    private JButton botao;

    public MaiorDeTresNumerosGUI() {
        super("Encontre o maior número");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Número 1:");
        label2 = new JLabel("Número 2:");
        label3 = new JLabel("Número 3:");
        resultado = new JLabel("");

        campo1 = new JTextField(10);
        campo2 = new JTextField(10);
        campo3 = new JTextField(10);

        botao = new JButton("Encontrar o maior");
        botao.addActionListener(this);

        JPanel painel = new JPanel();
        painel.add(label1);
        painel.add(campo1);
        painel.add(label2);
        painel.add(campo2);
        painel.add(label3);
        painel.add(campo3);
        painel.add(botao);
       

        add(painel, BorderLayout.CENTER);
        add(resultado, BorderLayout.SOUTH);
        add(botao, BorderLayout.EAST);
    }

    public void actionPerformed(ActionEvent evento) {
        int num1 = Integer.parseInt(campo1.getText());
        int num2 = Integer.parseInt(campo2.getText());
        int num3 = Integer.parseInt(campo3.getText());

        int maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        resultado.setText("O maior número é: " + maior);
    }

    public static void main(String[] args) {
        MaiorDeTresNumerosGUI app = new MaiorDeTresNumerosGUI();
        app.setVisible(true);
    }
}

