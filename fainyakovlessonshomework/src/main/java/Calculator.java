import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {

    //Объявление всех компонентов калькулятора
    JPanel windowContent;
    JTextField displayFormatedField;
    JButton [] button = new JButton[10];
    JButton buttonPoint;
    JButton buttonEqual;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonDivision;
    JButton buttonMulti;
    JPanel p1;
    JPanel p2;

        //в конструкторе создаются все компоненты и добавляются на фрейм с помощью комбинации
        //BorderLayout и GridLayout
        Calculator(){
            //основная панель
            windowContent = new JPanel();

            //Задаём схему для основной панели
            BorderLayout bl = new BorderLayout();
            windowContent.setLayout(bl);

            //Создаём и отображаем текстовое поле
            //Добавляем его в Северную область окна
            displayFormatedField = new JFormattedTextField();
            displayFormatedField.setHorizontalAlignment(SwingConstants.RIGHT);
            windowContent.add("North",displayFormatedField);

            //Создаём кнопки, используя конструктор класса JButton, который принимает
            //текст кнопки в качестве параметра
            for (int i = 0; i < 10; i++){
                button[i] = new JButton(""+i);
            }
            buttonPoint = new JButton(".");
            buttonEqual = new JButton("=");
            buttonPlus = new JButton("*");
            buttonMinus = new JButton("-");
            buttonDivision = new JButton("/");
            buttonMulti = new JButton("*");


            //Создаём панель с GridLayout, которая содержит 12 кнопок - 10 кнопок с числами
            //и кнопки с точкой и знаком равно

            p1 = new JPanel();
            GridLayout gl = new GridLayout(4,3);
            p1.setLayout(gl);

            //Создаем панель с кнопками вычисления
            p2 = new JPanel();
            GridLayout glLeft = new GridLayout(4,1);
            p2.setLayout(glLeft);

            //добавляем кнопки на панель p1
            for(int i = 1; i <= 10; i++) {
                if (i == 10){
                    p1.add(button[0]);
                continue;
                }
                    p1.add(button[i]);
            }
            p1.add(buttonPoint);
            p1.add(buttonEqual);

            //добавляем кнопки на панель p2
            p2.add(buttonPlus);
            p2.add(buttonMinus);
            p2.add(buttonDivision);
            p2.add(buttonMulti);

            //Помещаем панель p1 в центральную область окна
            windowContent.add("Center", p1);

            //Помещаем панель p2 в восточную область окна
            windowContent.add("East", p2);

            //Создаём фрейм и задаём его основную панель
            JFrame frame = new JFrame("Calculator 1.0");
            frame.setContentPane(windowContent);

            //Делаем размер окна достаточным для того, чтобы вместить все компоненты
            frame.pack();

            //Наконец, отображаем окно
            frame.setVisible(true);

            //добавляем слушатель
            CalculatorEngine calcEngine = new CalculatorEngine();
            button[0].addActionListener(calcEngine);
        }

        public static void main(String[] args){
            Calculator calc = new Calculator();
        }
}
