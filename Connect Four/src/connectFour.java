import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class connectFour {
    public static gameboard gb = new gameboard();
    public static int playerTurn = 1;
    public static int playerCounterOne = 0;
    public static int playerCounterTwo = 0;
    public static JFrame window = new JFrame("Game");

    public static void main(String[] args) {
        playerInput();
    }


    public static void playerInput() {
        gameboard gameboard = new gameboard();
        window.setContentPane(gameboard);
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
            String input = in.nextLine();
            switch (input) {
                case ("1"):
                case ("2"):
                case ("3"):
                case ("4"):
                case ("5"):
                case ("6"):
                case ("7"):
                    gameboard.repaint();
                    break;
                default:
                    System.out.println("Please Enter a valid option");
                    playerInput();
            }

            int playerChoice = Integer.parseInt(input);


            if (playerTurn == 1) {
                for (int row = 0; row <= 6; row += 1) {
                    if (gb.connectFourBoard[0][playerChoice - 1] == 1 || gb.connectFourBoard[0][playerChoice - 1] == 2) {
                        System.out.println("This column is full");
                        break;
                    }


                    if (gb.connectFourBoard[5][playerChoice - 1] == 0) {
                        gb.connectFourBoard[5][playerChoice - 1] = 1;
                        playerTurn = 3;
                        break;
                    }
                    if (gb.connectFourBoard[row][(playerChoice - 1)] == 1 || gb.connectFourBoard[row][(playerChoice - 1)] == 2) {
                        gb.connectFourBoard[row - 1][(playerChoice - 1)] = 1;
                        playerTurn = 3;
                        break;
                    }
                    if (gb.connectFourBoard[row][(playerChoice - 1)] == 0) {
                    }
                }

                horizontalChecker();

            }
            if (playerTurn == 2) {
                for (int row = 0; row <= 6; row += 1) {
                    if (gb.connectFourBoard[0][playerChoice - 1] == 1 || gb.connectFourBoard[0][playerChoice - 1] == 2) {
                        System.out.println("This column is full");
                        break;
                    }

                    if (gb.connectFourBoard[5][playerChoice - 1] == 0) {
                        gb.connectFourBoard[5][playerChoice - 1] = 2;
                        playerTurn = 4;
                        break;
                    }
                    if (gb.connectFourBoard[row][(playerChoice - 1)] == 1 || gb.connectFourBoard[row][(playerChoice - 1)] == 2) {
                        gb.connectFourBoard[row - 1][(playerChoice - 1)] = 2;
                        playerTurn = 4;
                        break;
                    }
                    if (gb.connectFourBoard[row][(playerChoice - 1)] == 0) {
                    }
                }
                while (true) {
                    gameboard.repaint();
                    horizontalChecker();
                }
            }


        }
    }

    public static void winnerCheck() {

        if (playerCounterOne >= 4) {
            System.out.println("player one wins");
            System.out.println(Arrays.deepToString(gameboard.connectFourBoard));
            System.exit(0);
        }
        if (playerCounterTwo >= 4) {
            System.out.println("player two wins");
            System.out.println(Arrays.deepToString(gameboard.connectFourBoard));
            System.exit(0);
        }


    }

    public static void horizontalChecker() {
        int x;
        int y;
        for (y = 0; y != 6; y++) {
            for (x = 0; x != 7; x++) {
                System.out.println("Y:" + y + ", " + "X:" + x + " : for Horizontal");
                //This section checks if player one has won
                if (gb.connectFourBoard[y][x] == 1) {
                    playerCounterOne += 1;
                } else {
                    playerCounterOne = 0;
                }
                //This section checks if player two has won
                if (gb.connectFourBoard[y][x] == 2) {
                    playerCounterTwo += 1;
                } else {
                    playerCounterTwo = 0;
                }
                if (playerCounterOne >= 4 || playerCounterTwo >= 4) {
                    winnerCheck();
                }
            }
        }
        verticalChecker();
    }

    public static void verticalChecker() {
        int x;
        int y;
        for (x = 0; x != 7; x++) {
            for (y = 0; y != 6; y++) {
                System.out.println("Y:" + y + ", " + "X:" + x + " : for Vertical");
                //This section checks if player one has won
                if (gb.connectFourBoard[y][x] == 1) {
                    //System.out.println("player one's tile");
                    //System.out.println(playerCounterOne);
                    playerCounterOne += 1;
                } else {
                    playerCounterOne = 0;
                }
                //This section checks if player two has won
                if (gb.connectFourBoard[y][x] == 2) {
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
            }
        }
        diagonalCheckerTopToBottom();
    }

    public static void diagonalCheckerTopToBottom() {
        for (int y = 0; y != 3; y++) {
            for (int x = 0; x != 4; x++) {
                System.out.println("Y:" + y + ", " + "X:" + x + " : for diagonalCheckerTopToBottom");
                if (gb.connectFourBoard[y][x] == 1 && gb.connectFourBoard[y + 1][x + 1] == 1 && gb.connectFourBoard[y + 2][x + 2] == 1 && gb.connectFourBoard[y + 3][x + 3] == 1) {
                    playerCounterOne = 4;
                }
                if (gb.connectFourBoard[y][x] == 2 && gb.connectFourBoard[y + 1][x + 1] == 2 && gb.connectFourBoard[y + 2][x + 2] == 2 && gb.connectFourBoard[y + 3][x + 3] == 2) {
                    playerCounterTwo = 4;
                }
                if (playerCounterOne >= 4 || playerCounterTwo >= 4) {
                    winnerCheck();
                }
            }
        }
        diagonalCheckerBottomToTop();
    }

    public static void diagonalCheckerBottomToTop() {
        for (int y = 0; y != 3; y++) {
            for (int x = 6; x != 2; x -= 1) {
                System.out.println("Y:" + y + ", " + "X:" + x + " : for diagonalCheckerBottomToTop");
                if (gb.connectFourBoard[y][x] == 1 && gb.connectFourBoard[y + 1][x - 1] == 1 && gb.connectFourBoard[y + 2][x - 2] == 1 && gb.connectFourBoard[y + 3][x - 3] == 1) {
                    playerCounterOne = 4;
                }
                if (gb.connectFourBoard[y][x] == 2 && gb.connectFourBoard[y + 1][x - 1] == 2 && gb.connectFourBoard[y + 2][x - 2] == 2 && gb.connectFourBoard[y + 3][x - 3] == 2) {
                    playerCounterTwo = 4;
                }
                if (playerCounterOne >= 4 || playerCounterTwo >= 4) {
                    winnerCheck();
                }
            }
        }
        playerInput();
    }


}
