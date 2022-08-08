package project.program.calculator;

import javax.swing.*;
import javax.xml.stream.util.StreamReaderDelegate;


public class CalculationLogic {
    private boolean itFirstChar = true;
    private boolean haveOneDot = false;
    private boolean firstNumIsFull = false;

    private JLabel outputScreen;
    private String firstStringNum = "0";
    private String secondStringNum = "";
    private String operator = "";


    CalculationLogic(JLabel label) {
        outputScreen = label;
    }

    public void init(JButton button) {
        if (!firstNumIsFull) {
            if (!haveOneDot && button.getText().equals(".")) {
                firstStringNum += button.getText();
                haveOneDot = true;
            } else if (button.getText().equals(ServiceButtons.buttonPlus) || button.getText().equals(ServiceButtons.buttonMinus) || button.getText().equals(ServiceButtons.buttonMultiply) || button.getText().equals(ServiceButtons.buttonDivide)) {
                firstNumIsFull = true;
                haveOneDot = false;
                operator = button.getText();
            } else if (itFirstChar && button.getText().equals("0")) {
                System.err.println("You can't write ZERO char again");
            }else if (button.getText().equals("Del")){
                firstStringNum = firstStringNum.replaceFirst(".$","");
            }else if (itFirstChar) {
                firstStringNum = button.getText();
                itFirstChar = false;
                } else if (!itFirstChar) {
                firstStringNum += button.getText();
            }
            outputScreen.setText(firstStringNum + operator);
        }else if(firstNumIsFull){
            if(button.getText().equals("Del")){
                secondStringNum = secondStringNum.replaceFirst(".$","");
                if (secondStringNum.isEmpty()){
                    operator = operator.replaceFirst(".$", "");
                }
            }else if(itFirstChar && !haveOneDot){
                secondStringNum = "0.";
                haveOneDot = true;
            }else if (button.getText().equals("=") && !secondStringNum.isEmpty()){
                if (operator.equals("+")) firstStringNum = String.valueOf(Float.parseFloat(firstStringNum) + Float.parseFloat(secondStringNum));
                if (operator.equals("-")) firstStringNum = String.valueOf(Float.parseFloat(firstStringNum) - Float.parseFloat(secondStringNum));
                if (operator.equals("*")) firstStringNum = String.valueOf(Float.parseFloat(firstStringNum) * Float.parseFloat(secondStringNum));
                if (operator.equals("/")) firstStringNum = String.valueOf(Float.parseFloat(firstStringNum) / Float.parseFloat(secondStringNum));
                operator = "";
                secondStringNum = "";
                firstNumIsFull = false;
            }else if (button.getText().equals(ServiceButtons.buttonPlus) || button.getText().equals(ServiceButtons.buttonDivide) || button.getText().equals(ServiceButtons.buttonMultiply) || button.getText().equals(ServiceButtons.buttonMinus)){
                operator = button.getText();
                if (!operator.isEmpty()){
                    outputScreen.setText(firstStringNum + operator);
                }
            }else{
                secondStringNum += button.getText();
            }
            outputScreen.setText(firstStringNum + operator + secondStringNum);
        }
    }
}
