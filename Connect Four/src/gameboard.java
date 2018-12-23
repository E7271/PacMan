import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class gameboard extends JPanel implements KeyListener {


    public static int[][] connectFourBoard = new int[][]{
            //0 is out of bound
            //1 is path way
            //2 is yellow, 6 is yellow circle
            //3 is green, 7 is green circle
            //4 is red, 8 is red circle
            //5 is blue, 9 is blue circle
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {2, 2, 2, 2, 2, 2, 2},

    };


    public gameboard() {
        setBackground(Color.BLACK); // TODO may not work
        addKeyListener(this);
        setFocusable(true);
        setPreferredSize(new Dimension(175, 150));
        setFocusTraversalKeysEnabled(false); // TODO see what this does

    }


    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        // TODO paint graphics here, using for loops

        for (int row = 0; row < connectFourBoard.length; row++) {
            for (int col = 0; col < connectFourBoard[row].length; col++) {
                if (connectFourBoard[row][col] == 0) {
                    g2d.setColor(Color.YELLOW);
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.BLACK);
                    g2d.fillOval(x_coords + 2, y_coords + 2, width - 5, height - 5);
                }

                if (connectFourBoard[row][col] == 1) {
                    g2d.setColor(Color.YELLOW);
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(x_coords + 2, y_coords + 2, width - 5, height - 5);


                }

                if (connectFourBoard[row][col] == 2) {
                    g2d.setColor(Color.YELLOW);
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.RED);
                    g2d.fillOval(x_coords + 2, y_coords + 2, width - 5, height - 5);


                }
                if (connectFourBoard[row][col] == 9) {
                    g2d.setColor(Color.BLACK);
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.BLACK);
                    g2d.fillOval(x_coords + 2, y_coords + 2, width - 5, height - 5);
                }
            }


        }


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}