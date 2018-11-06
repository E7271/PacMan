import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public class game extends JPanel implements KeyListener {
    private JPanel gameBoard;

    public static void main(String[] args) {
        JFrame frame = new JFrame("game");
        frame.setContentPane(new game().gameBoard);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }




    public game() {
        int width = 100;
        int height = 100;
        setBackground(Color.BLACK);
        addKeyListener(this);
        setPreferredSize(new Dimension(width, height));
        this.setFocusable(true);
        setFocusTraversalKeysEnabled(false);

    }


    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) { }

}
