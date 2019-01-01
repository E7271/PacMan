public class input {
    public static int playerCounterOne = 0;
    public static int playerCounterTwo = 0;

    public static connectFour cF = new connectFour();
    public static gameboard gb = new gameboard();

    public static void winnerCheck() {
        if (playerCounterOne >= 4) {
            System.out.println("player one wins");
        }
        if (playerCounterTwo >= 4) {
            System.out.println("player two wins");
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
            //TODO add diagonalChecker();
            diagonalChecker();
        }
    }

    public static void diagonalChecker(){





    }


 public static void main(String[] args) {
 //System for checking which player wins, if any (checks each round)
 horizontalChecker();
 }

}
