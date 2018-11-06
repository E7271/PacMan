import javax.swing.*;

public class snakeForm {
    private JPanel mainPanel;



    public static void main(String[] args) {
        JFrame frame = new JFrame("snakeForm");
        frame.setContentPane(new snakeForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }






}
