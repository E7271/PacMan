import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import java.util.Random;

public class Tetrominoes extends JPanel implements KeyListener {
    int[][] grid = new int[][]{
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},




    };


    public static void Iblock() {
        //Orientation 1
        int[][] iBlock1 = new int[][]{
                { 0, 0, 0, 0},
                { 4, 4, 4, 4},
                { 0, 0, 0, 0},
                { 0, 0, 0, 0},
        };

        //Orientation 2
        int[][] iBlock2 = new int[][]{
                { 0, 0, 4, 0},
                { 0, 0, 4, 0},
                { 0, 0, 4, 0},
                { 0, 0, 4, 0},
        };

        //Orientation 2
        int[][] iBlock3 = new int[][]{
                { 0, 0, 0, 0},
                { 0, 0, 0, 0},
                { 4, 4, 4, 4},
                { 0, 0, 0, 0},
        };

        //Orientation 2
        int[][] iBlock4 = new int[][]{
                { 0, 4, 0, 0},
                { 0, 4, 0, 0},
                { 0, 4, 0, 0},
                { 0, 4, 0, 0},
        };
    }
    public static void Jblock() {
        int[][] Jblock1 = new int[][]{
                { 4, 0, 0},
                { 4, 4, 4},
                { 0, 0, 0},
        };
        int[][] Jblock2 = new int[][]{
                { 0, 4, 4},
                { 0, 4, 0},
                { 0, 4, 0},
        };
        int[][] Jblock3 = new int[][]{
                { 0, 0, 0},
                { 4, 4, 4},
                { 0, 0, 4},
        };
        int[][] Jblock4 = new int[][]{
                { 0, 4, 0},
                { 0, 4, 0},
                { 4, 4, 0},
        };

    }
    public static void Lblock(){
        int[][] Lblock1 = new int[][]{
                { 0, 0, 4},
                { 4, 4, 4},
                { 0, 0, 0},
        };
        int[][] Lblock2 = new int[][]{
                { 0, 4, 0},
                { 0, 4, 0},
                { 0, 4, 4},
        };
        int[][] Lblock3 = new int[][]{
                { 0, 0, 0},
                { 4, 4, 4},
                { 4, 0, 0},
        };
        int[][] Lblock4 = new int[][]{
                { 0, 4, 0},
                { 0, 4, 0},
                { 0, 4, 4},
        };
    }
    public static void Oblock(){
        int[][] Oblock1 = new int[][]{
                { 0, 4, 4, 0},
                { 0, 4, 4, 0},
                { 0, 0, 0, 0},
        };
        int[][] Oblock2 = new int[][]{
                { 0, 4, 4, 0},
                { 0, 4, 4, 0},
                { 0, 0, 0, 0},
        };
        int[][] Oblock3 = new int[][]{
                { 0, 4, 4, 0},
                { 0, 4, 4, 0},
                { 0, 0, 0, 0},
        };
        int[][] Oblock4 = new int[][]{
                { 0, 4, 4, 0},
                { 0, 4, 4, 0},
                { 0, 0, 0, 0},
        };
    }
    public static void Sblock(){
        int[][] Sblock1 = new int[][]{
                { 0, 4, 4},
                { 4, 4, 0},
                { 0, 0, 0},
        };
        int[][] Sblock2 = new int[][]{
                { 0, 4, 0},
                { 0, 4, 4},
                { 0, 0, 4},
        };
        int[][] Sblock3 = new int[][]{
                { 0, 0, 0},
                { 0, 4, 4},
                { 4, 4, 0},
        };
        int[][] Sblock4 = new int[][]{
                { 4, 0, 0},
                { 4, 4, 0},
                { 0, 4, 0},
        };
    }
    public static void Tblock(){
        int[][] Zblock1 = new int[][]{
                { 0, 4, 0},
                { 4, 4, 4},
                { 0, 0, 0},
        };
        int[][] Zblock2 = new int[][]{
                { 0, 4, 0},
                { 0, 4, 4},
                { 0, 4, 0},
        };
        int[][] Zblock3 = new int[][]{
                { 0, 0, 0},
                { 4, 4, 4},
                { 0, 4, 0},
        };
        int[][] Zblock4 = new int[][]{
                { 0, 4, 0},
                { 4, 4, 0},
                { 0, 4, 0},
        };
    }
    public static void Zblock(){
        int[][] Zblock1 = new int[][]{
                { 4, 4, 0},
                { 0, 4, 4},
                { 0, 0, 0},
        };
        int[][] Zblock2 = new int[][]{
                { 0, 0, 4},
                { 0, 4, 4},
                { 0, 4, 0},
        };
        int[][] Zblock3 = new int[][]{
                { 0, 0, 0},
                { 4, 4, 0},
                { 0, 4, 4},
        };
        int[][] Zblock4 = new int[][]{
                { 0, 4, 0},
                { 4, 4, 0},
                { 4, 0, 0},
        };
    }


    Color backgroundColor = new Color(31,34,35);

    Color IblockColor = new Color(56,219,212);
    Color JblockColor = new Color(47,68,213);
    Color LblockColor = new Color(244,173,44);
    Color OblockColor = new Color(252,238,14);
    Color SblockColor = new Color(70,232,38);
    Color TblockColor = new Color(129,45,228);
    Color ZblockColor = new Color(228,45,45);

    int height = 570;
    int width = 780;
    int boxHeight = 30;
    int boxWidth = 30;

    public Tetrominoes() {
        setBackground(Color.BLACK);
        addKeyListener(this);
        setPreferredSize(new Dimension(width, height));
        this.setFocusable(true);
        setFocusTraversalKeysEnabled(false);

    }


    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;


        g2d.setColor(Color.GRAY);

        // Paint walls





        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {

                if (grid[row][col] == 0) {

                    // Pixel coordinates
                    int x_coords = 30 * col;
                    int y_coords = 30 * row;

                    // Block dimensions
                    int width = 30;
                    int height = 30;
                    int width2 = 25;
                    int height2 = 25;


                    g2d.fillRect(x_coords, y_coords, width, height);
                    g2d.setColor(Color.WHITE);
                    g2d.fillRect(x_coords + 3, y_coords + 3, width2, height2);
                    g2d.setColor(Color.GRAY);
                }

            }
        }
        g2d.setColor(backgroundColor);
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {

                if (grid[row][col] == 1) {

                    // Pixel coordinates
                    int x_coords = 30 * col;
                    int y_coords = 30 * row;

                    // Block dimensions
                    int width = 30;
                    int height = 30;

                    g2d.fillRect(x_coords, y_coords, width, height);
                }

            }
        }






    }



    @Override
    public void keyTyped(KeyEvent e) { }
    public void keyPressed(KeyEvent e) { }
    public void keyReleased(KeyEvent e) { }





}