import javax.swing.*;
import java.awt.*;

public class FlagApp {
    public static void main(String[] args) {
        // Создание графического интерфейса
        JFrame frame = new JFrame("Флаг");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание компонента для отображения флага Польши
        JPanel flagPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Рисование флага Польши
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, getWidth(), getHeight());

                g.setColor(Color.RED);
                g.fillRect(50, 30, 200, 20);
                g.fillRect(120, 30, 20, 150);
            }
        };

        // Добавление компонента на форму
        frame.add(flagPanel);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}