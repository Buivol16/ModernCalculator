package project.program.calculator;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonListener implements MouseListener {
    private JButton button;
    private CalculationLogic logic;

    ButtonListener(JButton button, CalculationLogic logicClass){
        this.button = button;
        logic = logicClass;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        logic.init(button);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
