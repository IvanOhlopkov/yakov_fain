import javax.swing.*;
import java.awt.GridLayout;

public class SimpleCalculatorGrid {
    public static void main(String args[]){

        //Создаем панель
        JPanel panel = new JPanel();

        //Создаем менеджер расположения для этой панели
        GridLayout gl = new GridLayout(4,2,5,5);
        panel.setLayout(gl);

        //Создаем компоненты в памяти
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");

        //Добавляем компоненты в панель
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(result);
        panel.add(go);

        //Создаем фрейм и задаем панель для него
        JFrame frame = new JFrame("My First Calculator");
        frame.setContentPane(panel);

        //Задаем размер и отображаем окно
        frame.setSize(600,200);
        frame.setVisible(true);
    }

}
