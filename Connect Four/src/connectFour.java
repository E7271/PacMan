import javax.swing.*;
import java.util.Scanner;
public class connectFour {
    public static gameboard gb = new gameboard();
    public static input input = new input();
    public static int playerTurn = 1;
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
            if (playerTurn == 3){
                playerTurn = 2;
            }
            if (playerTurn == 4){
                playerTurn = 1;
            }
            Scanner in = new Scanner(System.in);
            System.out.println("Which column would you like to drop into? ");
            int playerChoice = in.nextInt();
            /*
            This Section Deals with Player One Input
             */
            if (playerTurn == 1) {

                //TODO connect to the input.java class so it can check and see if anyone has one
                //TODO also make it so that all sections are place-able

                for (int row = (playerChoice - 1); row <= 6; row += 1) {
                    if (gb.connectFourBoard[5][playerChoice - 1] == 0) {
                        gb.connectFourBoard[5][playerChoice - 1] = 1;
                        break;
                    }
                    if (gb.connectFourBoard[row][(playerChoice - 1)] == 1 || gb.connectFourBoard[row][(playerChoice - 1)] == 2) {
                        gb.connectFourBoard[row - 1][(playerChoice - 1)] = 1;
                        System.out.println("Full Space");
                        break;
                    }
                    if (gb.connectFourBoard[row][(playerChoice - 1)] == 0) {
                        System.out.println("Blank Space");
                    }
                }
                playerTurn = 3;
            }
            /*
            This Section Deals with Player Two Input
             */
            if (playerTurn == 2) {
                for (int row = (playerChoice - 1); row <= 6; row += 1) {

                    System.out.println("For Loop Runs ");
                    if (gb.connectFourBoard[5][playerChoice - 1] == 0) {
                        gb.connectFourBoard[5][playerChoice - 1] = 2;
                        break;
                    }
                    if (gb.connectFourBoard[row][(playerChoice - 1)] == 1 || gb.connectFourBoard[row][(playerChoice - 1)] == 2) {
                        gb.connectFourBoard[row - 1][(playerChoice - 1)] = 2;
                        System.out.println("Full Space");
                        break;
                    }
                    if (gb.connectFourBoard[row][(playerChoice - 1)] == 0) {
                        System.out.println("Blank Space");
                    }
                }
                playerTurn = 4;
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
