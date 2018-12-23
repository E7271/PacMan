import javax.swing.*;
import java.util.Scanner;

public class connectFour {
    public static gameboard gb = new gameboard();

    public static void main(String[] args) {
        // Create the window to hold the game
        JFrame window = new JFrame("Game");
        // Create the "canvas" JPanel from MainGame
        gameboard gameboard = new gameboard();
        // Add the canvas as a JPanel to the window
        window.setContentPane(gameboard);
        // Finish setting up the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
        while (true) {
            /*
            This Section Deals with Player One Input
             */
            Scanner in = new Scanner(System.in);
            System.out.println("Which column would you like to drop into? ");
            int playerOneChoice = in.nextInt();


            int valueForPlayers = 2;


            for (int row = (playerOneChoice - 1); row <= 5; row += 1) {
                if (gb.connectFourBoard[row][(playerOneChoice - 1)] == 1 || gb.connectFourBoard[row][(playerOneChoice - 1)] == 2) {
                    gb.connectFourBoard[row - 1][(playerOneChoice - 1)] = valueForPlayers;
                    System.out.println("Full Space");
                    break;
                }
                if (gb.connectFourBoard[row][(playerOneChoice - 1)] == 0) {
                    System.out.println("Blank Space");
                }
            }


            gameboard.repaint();
            // Add pause
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(gb.connectFourBoard[0][0]);
            System.out.println(gb.connectFourBoard[1][0]);
            System.out.println(gb.connectFourBoard[2][0]);
            System.out.println(gb.connectFourBoard[3][0]);
            System.out.println(gb.connectFourBoard[4][0]);
            System.out.println(gb.connectFourBoard[5][0]);

        }

    }


}


