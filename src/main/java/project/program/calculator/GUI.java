package project.program.calculator;

import javax.swing.*;
import java.util.ArrayList;

public class GUI extends JFrame {


    private JPanel output;
    private JPanel Main;
    private JPanel buttons;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button6;
    private JButton button4;
    private JButton button5;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton buttonDivide;
    private JButton buttonMultiply;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonDel;
    private JButton buttonEqual;
    private JButton buttonDot;
    private JLabel outputResult;
    private CalculationLogic logic = new CalculationLogic(outputResult);

    GUI(){
        setTitle("Calculator");
        setDefaultCloseOperation(3);
        setContentPane(Main);
        setSize(500, 600);
        setVisible(true);
        setResizable(false);
        button1.addMouseListener(new ButtonListener(button1, logic));
        button2.addMouseListener(new ButtonListener(button2, logic));
        button3.addMouseListener(new ButtonListener(button3, logic));
        button4.addMouseListener(new ButtonListener(button4, logic));
        button5.addMouseListener(new ButtonListener(button5, logic));
        button6.addMouseListener(new ButtonListener(button6, logic));
        button7.addMouseListener(new ButtonListener(button7, logic));
        button8.addMouseListener(new ButtonListener(button8, logic));
        button9.addMouseListener(new ButtonListener(button9, logic));
        button0.addMouseListener(new ButtonListener(button0, logic));
        buttonDivide.addMouseListener(new ButtonListener(buttonDivide, logic));
        buttonMultiply.addMouseListener(new ButtonListener(buttonMultiply, logic));
        buttonPlus.addMouseListener(new ButtonListener(buttonPlus, logic));
        buttonMinus.addMouseListener(new ButtonListener(buttonMinus, logic));
        buttonEqual.addMouseListener(new ButtonListener(buttonEqual, logic));
        buttonDot.addMouseListener(new ButtonListener(buttonDot, logic));
        buttonDel.addMouseListener(new ButtonListener(buttonDel, logic));
    }
}
