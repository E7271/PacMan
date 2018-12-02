import java.util.Random;
import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        int[] arrayName = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        Random rand = new Random();
        int computerChoice = rand.nextInt(52);
        int playerChoice = rand.nextInt(52);

        int[] playersHand = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] computersHand = {0,0,0,0,0,0,0,0,0,0,0,0,0};

        playersHand[0] = arrayName[playerChoice];
        playerChoice = rand.nextInt(52);
        playersHand[1] = arrayName[playerChoice];

        System.out.println("Your Hand " + playersHand[0] + ", " + playersHand[1]);


        computersHand[0] = arrayName[computerChoice];
        computerChoice = rand.nextInt(52);
        computersHand[1] = arrayName[computerChoice];

        int playerCounter = 2;
        int computerCounter = 2;

        int playerHandSum = 0;
        int computerHandSum = 0;



        //System.out.println("Would you like to start a game? Press 1: ");

        //Scanner wouldYou = new Scanner(System.in);
        int continuePlay = 1;

        while(continuePlay == 1 && computerHandSum < 19) {
            //Use this section to see if the person still wants to play
            int firstCheck = playersHand[0] + playersHand[1];
            System.out.println("Your hand value is " + firstCheck + " are you sure you want to continue? (1 = Y, 2 = N)");


            Scanner wouldYou = new Scanner(System.in);
            continuePlay = wouldYou.nextInt();

            //Player Turn
            if (continuePlay == 1) {
                playerChoice = rand.nextInt(52);
                playersHand[playerCounter] = arrayName[playerChoice];
                System.out.println("you picked a " + arrayName[playerChoice]);
                playerCounter += 1;
                for(int i = 0; i <= 12; i++ ){
                    playerHandSum += playersHand[i];

                }
                System.out.println(" Total Value of your hand is " + playerHandSum);



            }

            //Computer Turn
            if (computerHandSum < 19) {
                computersHand[computerCounter] = arrayName[computerChoice];
                System.out.println("the computer picked a " + arrayName[playerChoice]);
                computerCounter += 1;
                for(int i = 0; i <= 12; i++ ){
                    computerHandSum += computersHand[i];

                }
                System.out.println(" Total Value of the computer's hand is " + computerHandSum);
                if (continuePlay == 2) {

                }
            }
        }

    }




}
