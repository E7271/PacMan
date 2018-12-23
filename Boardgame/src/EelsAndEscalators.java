import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class EelsAndEscalators {

    public static int[][] grid = new int[][]{
            //9 is the start and end
            //1 is path
            //0 is wall
            //2 is Eels base, and 3 is Eels top
            //When player is on a 3, move to the corresponding 2
            //4 is escalators base, and 5 is escalator top
            //When player is on a 4, move to the corresponding 5
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1, 9, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 1, 1, 3, 1, 1, 1, 2, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 2, 1, 2, 1, 1, 1, 1, 1, 3, 1, 1, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    public int playerOnePositionX = 2 ;
    public int playerOnePositionY = 9 ;

    public int playerTwoPositionX = 2 ;
    public int playerTwoPositionY = 9 ;


    public static void main(String[] args) {
        System.out.println("Welcome to Eels and Escalators");


        roll();
    }


    public static void roll() {
        System.out.println("Welcome to Eels and Escalators");
        printArray(grid);
    }


    public static void printArray(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    }


    public static void drawPlayers(){


    }


}

