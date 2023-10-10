import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Random;
import javax.swing.*;
public class NumberGame {
    NumberGame() throws IOException, URISyntaxException {
        JFrame f= new JFrame("Panel Example");
        JPanel panel=new JPanel();
        JLabel output = new JLabel("Output");
        JLabel correctNumber = new JLabel("");
        JTextField input = new JTextField("Input");

        Random r = new Random();
        int low = 0;
        int high = 100;
        int result = r.nextInt(high-low) + low;



        panel.setBounds(40,80,400,200);
        panel.setBackground(Color.gray);

        JButton breset=new JButton("New Game");
        breset.setBounds(0,0,80,30);

        JButton bsubmit=new JButton("Submit");
        bsubmit.setBounds(0,40,80,30);


        bsubmit.addActionListener(new SubmitButton(input, output , result));
        input.addKeyListener(new SubmitButton(input, output , result));

        breset.addActionListener( new ExitButton());

        output.setBounds(50 , 200 , 80 , 30);
        input.setBounds(100 , 300 , 80 , 30);
        correctNumber.setBounds(150 , 400 , 80 , 30);
        correctNumber.setText(String.valueOf(result));

        panel.add(breset); panel.add(bsubmit); panel.add(output);panel.add(input);panel.add(correctNumber);
        f.add(panel);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]) throws IOException, URISyntaxException {
        new NumberGame();
    }
}