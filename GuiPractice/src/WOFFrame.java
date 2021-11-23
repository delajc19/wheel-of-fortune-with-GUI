import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class WOFFrame extends JFrame implements ActionListener {
    /*
    data fields -all GUI objects
                -variables for game components
                    -array of strings for puzzles
                    -current puzzle number
                    -player objects
                    -current puzzle (hidden)
                    -shown puzzle
     */
    /*
    methods:
        -constructor:
            1. set up the GUi objects
            2. initialize the game (make it a method that you call every time you start a new game)
        -initialize method
        -methods executed in response to GUI events
     */
    private JButton spinButton;
    private JLabel winnerText;
    private JLabel consText1;
    private JTextField puzzle;

    private int moneyToWin;
    boolean continueTurn;
    private int[] spin = {0, 1, 100, 200, 300, 400, 500, 600, 700, 800, 900, 10000};


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == spinButton){
            doSpin();
        }
    }

    public void doSpin(){
        Random rand = new Random();
        int n = rand.nextInt(spin.length);

        if (spin[n] == 0){
            winnerText.setText("BANKRUPT");
            continueTurn = false;
        }
        else if (spin[n] == 1){
            winnerText.setText("LOSE A TURN");
            continueTurn = false;
        }
        else {
            winnerText.setText(Integer.toString(spin[n]));
            moneyToWin = spin[n];
            continueTurn = true;
        }
    }

    public void checkConsonant() {
        char c = (consText1.getText()).charAt(0);
    }
}
