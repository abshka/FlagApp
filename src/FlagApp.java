import javax.swing.*;
import java.awt.*;

public class FlagApp {
    public static void main(String[] args) {
        // Создание главного окна
        JFrame frame = new JFrame("Флаг");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание панели для отображения флага
        JPanel flagPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Задание цвета фона (белый)
                g.setColor(Color.WHITE);
                // Заполнение прямоугольной области фона
                g.fillRect(0, 0, getWidth(), getHeight());

                // Задание цвета полосы (красный)
                g.setColor(Color.RED);
                // Рисование красной полосы с вертикальными координатами
                g.fillRect(0, 75, getWidth(), getHeight());
            }
        };

        // Установка менеджера компоновки для главного окна
        frame.setLayout(new BorderLayout());
        // Добавление панели с флагом в центральную часть главного окна
        frame.add(flagPanel, BorderLayout.CENTER);
        // Установка видимости главного окна
        frame.setVisible(true);
    }
}