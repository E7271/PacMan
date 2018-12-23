import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class gameboard extends JPanel implements KeyListener {

    //Yellow Character
    public int playerOnePositionX = 11 ;
    public int playerOnePositionY = 14 ;
    public int playerOneWidth = 17;
    public int playerOneHeight = 17;
    public Color playerOneColor = new Color(254, 255, 194);

    //Green Character
    public int playerTwoPositionX = 1 ;
    public int playerTwoPositionY = 11 ;
    public int playerTwoWidth = 17;
    public int playerTwoHeight = 17;
    Color playerTwoColor = new Color(194,255,186);

    //Red Character
    public int playerThreePositionX = 4 ;
    public int playerThreePositionY = 1 ;
    public int playerThreeWidth = 17;
    public int playerThreeHeight = 17;
    Color playerThreeColor = new Color(255,148,148);

    //Blue Character
    public int playerFourPositionX = 14 ;
    public int playerFourPositionY = 4 ;
    public int playerFourWidth = 17;
    public int playerFourHeight = 17;
    Color playerFourColor = new Color(127, 181, 235);




    public static int[][] sorryBoard = new int[][]{
            //0 is out of bound
            //1 is path way
            //2 is yellow, 6 is yellow circle
            //3 is green, 7 is green circle
            //4 is red, 8 is red circle
            //5 is blue, 9 is blue circle
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 4, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 4, 0, 0, 0, 0, 0, 0, 0, 9, 5, 5, 5, 5, 1},
            {1, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 1},
            {1, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 11, 10, 10, 14, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 15, 16, 10, 15, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 15, 10, 10, 15, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 12, 10, 10, 13, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 1},
            {1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1},
            {1, 3, 3, 3, 3, 7, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 2, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            
    };

    public gameboard() {
        setBackground(Color.BLACK); // TODO may not work
        addKeyListener(this);
        setFocusable(true);
        setPreferredSize(new Dimension(400, 400));
        setFocusTraversalKeysEnabled(false); // TODO see what this does

    }


    /**
     * This Section is Drawing out the gameboard by checking the value of each value in the array and colouring it accordingly
     *
     */

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        // TODO paint graphics here, using for loops
        for (int row = 0; row < sorryBoard.length; row++) {
            for (int col = 0; col < sorryBoard[row].length; col++) {
                if (sorryBoard[row][col] == 0) {
                    g2d.setColor(Color.GRAY);
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.fillRect(x_coords, y_coords, width, height);
                }
            }
            for (int col = 0; col < sorryBoard[row].length; col++) {
                if (sorryBoard[row][col] == 1) {
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.setColor(Color.DARK_GRAY);
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.LIGHT_GRAY);
                    g2d.fillOval(x_coords, y_coords, width, height);
                }
            }
            for (int col = 0; col < sorryBoard[row].length; col++) {
                if (sorryBoard[row][col] == 2) {
                    g2d.setColor(Color.YELLOW);
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.fillRect(x_coords, y_coords, width, height);
                }
            }
            for (int col = 0; col < sorryBoard[row].length; col++) {
                if (sorryBoard[row][col] == 3) {
                    g2d.setColor(Color.GREEN);
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.fillRect(x_coords, y_coords, width, height);
                }
            }
            for (int col = 0; col < sorryBoard[row].length; col++) {
                if (sorryBoard[row][col] == 4) {
                    g2d.setColor(Color.RED);
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.fillRect(x_coords, y_coords, width, height);
                }
            }
            for (int col = 0; col < sorryBoard[row].length; col++) {
                if (sorryBoard[row][col] == 5) {
                    g2d.setColor(Color.BLUE);
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.fillRect(x_coords, y_coords, width, height);
                }
            }


            for (int col = 0; col < sorryBoard[row].length; col++) {
                if (sorryBoard[row][col] == 6) {
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.setColor(Color.GRAY);
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(x_coords, y_coords, width, height);
                }
            }

            for (int col = 0; col < sorryBoard[row].length; col++) {
                if (sorryBoard[row][col] == 7) {
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.setColor(Color.GRAY);
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.GREEN);
                    g2d.fillOval(x_coords, y_coords, width, height);
                }
            }

            for (int col = 0; col < sorryBoard[row].length; col++) {
                if (sorryBoard[row][col] == 8) {
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.setColor(Color.GRAY);
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.RED);
                    g2d.fillOval(x_coords, y_coords, width, height);
                }
            }

            for (int col = 0; col < sorryBoard[row].length; col++) {
                if (sorryBoard[row][col] == 9) {
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.setColor(Color.GRAY);
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(x_coords, y_coords, width, height);
                }
            }


            /***
             * This is for the canadian flag thing
             */
            for (int col = 0; col < sorryBoard[row].length; col++) {



                if (sorryBoard[row][col] == 10) {
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.setColor(Color.WHITE);
                    g2d.fillRect(x_coords, y_coords, width, height);

                }


                if (sorryBoard[row][col] == 11) {
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.setColor(Color.GRAY);
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.RED);
                    g2d.fillArc(x_coords, y_coords, width, height, 180, 360);
                    g2d.fillRect(x_coords, y_coords + 15, 25, 12);
                    g2d.fillRect(x_coords + 15, y_coords, 12, 25);

                }
                if (sorryBoard[row][col] == 12) {
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.setColor(Color.GRAY);
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.RED);
                    g2d.fillArc(x_coords, y_coords, width, height, 360, 360);
                    g2d.fillRect(x_coords, y_coords, 25, 12);
                    g2d.fillRect(x_coords + 15, y_coords, 12, 25);

                }
                if (sorryBoard[row][col] == 13) {
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.setColor(Color.GRAY);
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.RED);
                    g2d.fillArc(x_coords, y_coords, width, height, 180, 360);
                    g2d.fillRect(x_coords, y_coords, 25, 12);
                    g2d.fillRect(x_coords, y_coords, 12, 25);

                }
                if (sorryBoard[row][col] == 14) {
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.setColor(Color.GRAY);
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.RED);
                    g2d.fillArc(x_coords, y_coords, width, height, 180, 360);
                    g2d.fillRect(x_coords, y_coords + 15, 25, 12);
                    g2d.fillRect(x_coords, y_coords, 12, 25);

                }

                if (sorryBoard[row][col] == 15) {
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.setColor(Color.RED);
                    g2d.fillRect(x_coords, y_coords, width, height);

                }

                if (sorryBoard[row][col] == 16) {
                    // Pixel coordinates
                    int x_coords = 25 * col;
                    int y_coords = 25 * row;
                    // Block dimensions
                    int width = 25;
                    int height = 25;
                    g2d.setColor(Color.WHITE);
                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.RED);
                    g2d.fillArc(x_coords + 10, y_coords + 10, width, height, 180, 360);

                }


            }



            g2d.setColor(playerOneColor);
            g2d.fillOval(((playerOnePositionX * 25) + 4), ((playerOnePositionY * 25) + 4), playerOneWidth, playerOneHeight);

            g2d.setColor(playerTwoColor);
            g2d.fillOval(((playerTwoPositionX * 25) + 4), ((playerTwoPositionY * 25) + 4), playerTwoWidth, playerTwoHeight);

            g2d.setColor(playerThreeColor);
            g2d.fillOval(((playerThreePositionX * 25) + 4), ((playerThreePositionY * 25) + 4), playerThreeWidth, playerThreeHeight);

            g2d.setColor(playerFourColor);
            g2d.fillOval(((playerFourPositionX * 25) + 4), ((playerFourPositionY * 25) + 4), playerFourWidth, playerFourHeight);

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
