import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class gameboard extends JPanel {
    public static int[][] connectFourBoard = new int[][]{
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},

    };

    public gameboard() {
        setBackground(Color.BLACK);
        setFocusable(true);
        setPreferredSize(new Dimension(175, 150));
        setFocusTraversalKeysEnabled(false);
    }



    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
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
            }
        }
    }
}
