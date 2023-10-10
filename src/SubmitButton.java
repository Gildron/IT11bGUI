import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class SubmitButton implements ActionListener, KeyListener {

    JTextField nameInput;
    JLabel nameOutput;
    Integer randomNumber;


    public SubmitButton(JTextField textfield, JLabel output, int result){
        nameInput = textfield;
        randomNumber = result;
        nameOutput = output;
    }

    @Override
    public void actionPerformed(ActionEvent submitClicked) {

        int inputFieldNumber = Integer.parseInt(nameInput.getText());

        Component frame = new JFrame();

        if (inputFieldNumber > randomNumber){
            nameOutput.setText("Die Zahl ist ist kleiner");
        }

        if (inputFieldNumber < randomNumber){
            nameOutput.setText("Die Zahl ist ist größer");
        }

        if (inputFieldNumber == randomNumber){
            nameOutput.setText("Die Zahl ist ist gleich");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_ENTER){
        Component frame = new JFrame();

        int inputFieldNumber = Integer.parseInt(nameInput.getText());


        if (inputFieldNumber > randomNumber){
            nameOutput.setText("Die Zahl ist ist kleiner");
        }

        if (inputFieldNumber < randomNumber){
            nameOutput.setText("Die Zahl ist ist größer");
        }

        if (inputFieldNumber == randomNumber){
            nameOutput.setText("Die Zahl ist ist gleich");
        }
        }

    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent arg0) {

    }
}