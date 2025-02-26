package incubator.incubator.it;
import javax.swing.*;
import java.awt.*;
public class Main  {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Мой первый графический интерфейс");

        JPanel buttonsPanel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        JButton start = new JButton("Старт");
        JButton stop = new JButton("Стоп");

        buttonsPanel.add(start);
        buttonsPanel.add(stop);

        frame.getContentPane().add(BorderLayout.NORTH, buttonsPanel);
        frame.setVisible(true);
    }
}
