import javax.swing.*;
import java.util.Scanner;

public class connectFour {
    public static gameboard gb = new gameboard();
    public static int playerTurn = 1;
    public static int playerCounterOne = 0;
    public static int playerCounterTwo = 0;
    // Create the window to hold the game
    public static JFrame window = new JFrame("Game");

    public static void main(String[] args) {
        // Create the "canvas" JPanel from MainGame
        gameboard gameboard = new gameboard();
        // Add the canvas as a JPanel to the window
        window.setContentPane(gameboard);
        // Finish setting up the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
        while (true) {
            String playerName = " player one";
            if (playerTurn == 3) {
                playerTurn = 2;
                playerName = " player two";
            }
            if (playerTurn == 4) {
                playerTurn = 1;
                playerName = " player one";
            }
            Scanner in = new Scanner(System.in);
            System.out.println("Which column would you like to drop into" + playerName + "? ");
            int playerChoice = in.nextInt();
            if (playerChoice > 7 || playerChoice < 1){
                System.out.println("Please pick a valid option");
                //main(null);
            }

            if (playerTurn == 1) {
                for (int row = 0; row <= 6; row += 1) {
                    if (gb.connectFourBoard[5][playerChoice - 1] == 0) {
                        gb.connectFourBoard[5][playerChoice - 1] = 1;
                        break;
                    }
                    if (gb.connectFourBoard[row][(playerChoice - 1)] == 1 || gb.connectFourBoard[row][(playerChoice - 1)] == 2) {
                        gb.connectFourBoard[row - 1][(playerChoice - 1)] = 1;
                        break;
                    }
                    if (gb.connectFourBoard[row][(playerChoice - 1)] == 0) {
                    }
                }
                horizontalChecker();
                playerTurn = 3;
            }
            if (playerTurn == 2) {
                for (int row = 0; row <= 6; row += 1) {
                    if (gb.connectFourBoard[5][playerChoice - 1] == 0) {
                        gb.connectFourBoard[5][playerChoice - 1] = 2;
                        break;
                    }
                    if (gb.connectFourBoard[row][(playerChoice - 1)] == 1 || gb.connectFourBoard[row][(playerChoice - 1)] == 2) {
                        gb.connectFourBoard[row - 1][(playerChoice - 1)] = 2;
                        break;
                    }
                    if (gb.connectFourBoard[row][(playerChoice - 1)] == 0) {
                    }
                }
                horizontalChecker();
                playerTurn = 4;
            }
            gameboard.repaint();
            // Add pause
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void winnerCheck() {

        if (playerCounterOne >= 4) {
            System.out.println("player one wins");
            System.exit(0);
        }
        if (playerCounterTwo >= 4) {
            System.out.println("player two wins");
            System.exit(0);
        }
    }

    public static void horizontalChecker() {
        int i;
        int y;
        for (y = 0; y != 6; y++) {
            for (i = 0; i != 7; i++) {
                //This section checks if player one has won
                if (gb.connectFourBoard[y][i] == 1) {
                    //System.out.println("player one's tile");
                    //System.out.println(playerCounterOne);
                    playerCounterOne += 1;
                } else {
                    playerCounterOne = 0;
                }
                //This section checks if player two has won
                if (gb.connectFourBoard[y][i] == 2) {
                    //System.out.println("player two's tile");
                    //System.out.println(playerCounterTwo);
                    playerCounterTwo += 1;
                } else {
                    playerCounterTwo = 0;
                }
                //This just cancels the loop is someone has won
                if (playerCounterOne >= 4 || playerCounterTwo >= 4) {
                    winnerCheck();
                }
                else{
                    verticalChecker();
                }
            }
        }
    }

    public static void verticalChecker() {
        int i;
        int y;
        for (i = 0; i != 7; i++) {
            for (y = 0; y != 6; y++) {
                //This section checks if player one has won
                if (gb.connectFourBoard[y][i] == 1) {
                    //System.out.println("player one's tile");
                    //System.out.println(playerCounterOne);
                    playerCounterOne += 1;
                } else {
                    playerCounterOne = 0;
                }
                //This section checks if player two has won
                if (gb.connectFourBoard[y][i] == 2) {
                    //System.out.println("player two's tile");
                    //System.out.println(playerCounterTwo);
                    playerCounterTwo += 1;
                } else {
                    playerCounterTwo = 0;
                }
                //This just cancels the loop is someone has won
                if (playerCounterOne >= 4 || playerCounterTwo >= 4) {
                    winnerCheck();
                }
                else{
                    diagonalCheckerTopToBottom();
                }
            }
        }
    }

    public static void diagonalCheckerTopToBottom() {
        int x;
        int y;
        for (y = 0; y != 4; y += 1) {
            for (x = 0; x != 4; x += 1) {
                if (gb.connectFourBoard[y][x] == 1 && gb.connectFourBoard[y + 1][x + 1] == 1 && gb.connectFourBoard[y + 2][x + 2] == 1 && gb.connectFourBoard[y + 3][x + 3] == 1) {
                    playerCounterOne = 4;
                    break;
                }
                if (gb.connectFourBoard[y][x] == 2 && gb.connectFourBoard[y + 1][x + 1] == 2 && gb.connectFourBoard[y + 2][x + 2] == 2 && gb.connectFourBoard[y + 3][x + 3] == 2) {
                    playerCounterTwo = 4;
                    break;
                }
                if (playerCounterOne >= 4 || playerCounterTwo >= 4) {
                    winnerCheck();
                }
                else{
                    diagonalCheckerBottomToTop();
                }
            }
        }
    }

    public static void diagonalCheckerBottomToTop() {
        int x;
        int y;
        for (y = 0; y != 4; y += 1) {
            for (x = 6; x != 2; x -= 1) {
                if (gb.connectFourBoard[y][x] == 1 && gb.connectFourBoard[y + 1][x - 1] == 1 && gb.connectFourBoard[y + 2][x - 2] == 1 && gb.connectFourBoard[y + 3][x - 3] == 1) {
                    playerCounterOne = 4;
                    break;
                }
                if (gb.connectFourBoard[y][x] == 2 && gb.connectFourBoard[y + 1][x - 1] == 2 && gb.connectFourBoard[y + 2][x - 2] == 2 && gb.connectFourBoard[y + 3][x - 3] == 2) {
                    playerCounterTwo = 4;
                    break;
                }
                if (playerCounterOne >= 4 || playerCounterTwo >= 4) {
                    winnerCheck();
                }
                else{
                    break;
                }
            }
        }
    }
}
