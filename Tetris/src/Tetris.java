import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Tetris {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tetris");
        Tetrominoes tetrisPanel = new Tetrominoes();
        frame.setContentPane(tetrisPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.addKeyListener(tetrisPanel);
        tetrisPanel.requestFocus();
    }
}
