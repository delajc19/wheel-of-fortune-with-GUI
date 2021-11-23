import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){
        WOFFrame mainFrame = new WOFFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
