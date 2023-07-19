import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class MediaNotasGUI extends JFrame implements ActionListener {  

    public MediaNotasGUI() {
        // cria uma janela
        JFrame frame = new JFrame("Cálculo de média de notas");

        // cria um painel para os componentes
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        // cria três labels para as notas
        JLabel label1 = new JLabel("Nota 1:");
        JLabel label2 = new JLabel("Nota 2:");
        JLabel label3 = new JLabel("Nota 3:");
        JLabel label4 = new JLabel("Nota 4:");

        // cria três campos de texto para as notas
        JTextField field1 = new JTextField(5);
        JTextField field2 = new JTextField(5);
        JTextField field3 = new JTextField(5);
        JTextField field4 = new JTextField(5);

        // cria um botão para calcular a média
        JButton button = new JButton("Revelar a média");

        // cria um label para exibir a média
        JLabel labelMedia = new JLabel("");

        // adiciona os componentes ao painel
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(field3);
        panel.add(label4);
        panel.add(field4);
        panel.add(button);
        panel.add(labelMedia);

        // configura o tamanho do painel
        panel.setPreferredSize(new Dimension(300, 150));

        // configura a ação do botão
        button.addActionListener(e -> {
            // converte as notas de texto para número
            int num1 = Integer.parseInt(field1.getText());
            int num2 = Integer.parseInt(field2.getText());
            int num3 = Integer.parseInt(field1.getText());
            int num4 = Integer.parseInt(field2.getText());
            float media;

            media = (num1 + num2 + num3 + num4)/4;
            

            // exibe a média no label
            

            labelMedia.setText(Float.toString(media));
    });

        // adiciona o painel à janela
        frame.getContentPane().add(panel);

        // configura o fechamento da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // exibe a janela
        frame.pack();
        frame.setVisible(true);
    }

    public void setVisible(boolean b) {
    }
       public static void main(String[] args) {
            MediaNotasGUI app = new MediaNotasGUI();
            app.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}


