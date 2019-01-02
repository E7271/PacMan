public class input {
    public static int playerCounterOne = 0;
    public static int playerCounterTwo = 0;

    public static connectFour cF = new connectFour();
    public static gameboard gb = new gameboard();



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
            }
        }
        if (playerCounterOne <= 4 || playerCounterTwo <= 4) {
            verticalChecker();
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
            }
        }
        if (playerCounterOne <= 4 || playerCounterTwo <= 4) {
            diagonalCheckerTopToBottom();
        }
    }

    public static void diagonalCheckerTopToBottom() {
        int x;
        int y;
        for (y = 0; y != 3; y += 1) {
            for (x = 0; x != 3; x += 1) {
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
            }
        }
        if (playerCounterOne <= 4 || playerCounterTwo <= 4) {
            diagonalCheckerBottomToTop();
        }
    }


    //TODO finish the diagonal, as it's not checking the entire thing
    public static void diagonalCheckerBottomToTop() {
        int x;
        int y;
        for (y = 0; y != 3; y += 1) {
            for (x = 6; x != 3; x -= 1) {
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
            }
        }
    }

    public static void main(String[] args) {
        //System for checking which player wins, if any (checks each round)
        horizontalChecker();
    }

}
