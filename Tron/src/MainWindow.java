import javax.swing.*;
import java.util.Arrays;

/**
 * This class is where the program starts
 */
public class MainWindow {

    public static void main(String[] args) {

        // Create the window to hold the game
        JFrame window = new JFrame("Game");

        // Create the "canvas" JPanel from MainGame
        GameCanvas canvas = new GameCanvas();


        // Add the canvas as a JPanel to the window
        window.setContentPane(canvas);

        // Finish setting up the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
        while (true) {


            System.out.println(canvas.grid[1][1]);

            /***
             * This section is used for the AI to make it's moves
             */

            int[] tails = new int[] {
                    9,8,0
            };

            switch (canvas.enemyKey) {

                case 1:
                    if(canvas.grid[canvas.Characters.enemyPositionY][canvas.Characters.enemyPositionX + 1] == 0 || canvas.grid[canvas.Characters.enemyPositionY][canvas.Characters.enemyPositionX + 1] == 8 || canvas.grid[canvas.Characters.enemyPositionY][canvas.Characters.enemyPositionX + 1] == 9) {
                        System.out.println("It's a tie");
                        System.exit(0);
                    }
                    if (canvas.grid[canvas.Characters.enemyPositionY][canvas.Characters.enemyPositionX + 1] != 0) {
                        canvas.grid[canvas.Characters.enemyPositionY][canvas.Characters.enemyPositionX + 1] = 8;
                        canvas.Characters.enemyPositionX += 1;
                        break;
                    }
                    else{
                        break;
                    }
                case 2:
                    if(canvas.grid[canvas.Characters.enemyPositionY][canvas.Characters.enemyPositionX - 1] == 0 || canvas.grid[canvas.Characters.enemyPositionY][canvas.Characters.enemyPositionX - 1] == 8 || canvas.grid[canvas.Characters.enemyPositionY][canvas.Characters.enemyPositionX - 1] == 9) {
                        System.out.println("It's a tie");
                        System.exit(0);
                    }
                    if (canvas.grid[canvas.Characters.enemyPositionY][canvas.Characters.enemyPositionX - 1] != 0) {
                        canvas.grid[canvas.Characters.enemyPositionY][canvas.Characters.enemyPositionX - 1] = 8;
                        canvas.Characters.enemyPositionX -= 1;
                        break;
                    }
                    else{
                        break;
                    }
                case 3:
                    if(canvas.grid[canvas.Characters.enemyPositionY - 1][canvas.Characters.enemyPositionX] == 0 || canvas.grid[canvas.Characters.enemyPositionY - 1][canvas.Characters.enemyPositionX] == 8 || canvas.grid[canvas.Characters.enemyPositionY - 1][canvas.Characters.enemyPositionX] == 9) {
                        System.out.println("It's a tie");
                        System.exit(0);
                    }
                    if (canvas.grid[canvas.Characters.enemyPositionY - 1][canvas.Characters.enemyPositionX ] != 0) {
                        canvas.grid[canvas.Characters.enemyPositionY - 1][canvas.Characters.enemyPositionX] = 8;
                        canvas.Characters.enemyPositionY -= 1;
                        break;
                    }
                    else{
                        break;
                    }
                case 4:
                    if(canvas.grid[canvas.Characters.enemyPositionY + 1][canvas.Characters.enemyPositionX] == 0 || canvas.grid[canvas.Characters.enemyPositionY + 1][canvas.Characters.enemyPositionX] == 8 || canvas.grid[canvas.Characters.enemyPositionY + 1][canvas.Characters.enemyPositionX] == 9) {
                        System.out.println("It's a tie");
                        System.exit(0);
                    }
                    if (canvas.grid[canvas.Characters.enemyPositionY + 1][canvas.Characters.enemyPositionX ] != 0) {
                        canvas.grid[canvas.Characters.enemyPositionY + 1][canvas.Characters.enemyPositionX] = 8;
                        canvas.Characters.enemyPositionY += 1;
                        break;
                    }
                    else{
                        break;
                    }

            }



            /***
             * This Section is used to select the Players Option
             */
            switch (canvas.lastKey) {
                case 1: //Right
                    if(canvas.grid[canvas.Characters.playerPositionY][canvas.Characters.playerPositionX + 1] == 0 || canvas.grid[canvas.Characters.playerPositionY][canvas.Characters.playerPositionX  + 1] == 8 || canvas.grid[canvas.Characters.playerPositionY][canvas.Characters.playerPositionX + 1] == 9) {
                        System.out.println("It's a tie");
                        System.exit(0);
                    }
                    if (canvas.grid[canvas.Characters.playerPositionY][canvas.Characters.playerPositionX + 1] != 0 && canvas.grid[canvas.Characters.playerPositionY][canvas.Characters.playerPositionX + 1] != 3) {
                        canvas.grid[canvas.Characters.playerPositionY][canvas.Characters.playerPositionX + 1] = 9;
                        canvas.Characters.playerPositionX += 1;
                        break;
                    }
                    else{
                        break;
                    }
                case 2: //Left
                    if(canvas.grid[canvas.Characters.playerPositionY][canvas.Characters.playerPositionX - 1] == 0 || canvas.grid[canvas.Characters.playerPositionY][canvas.Characters.playerPositionX - 1] == 8 || canvas.grid[canvas.Characters.playerPositionY][canvas.Characters.playerPositionX - 1] == 9){
                        System.out.println("It's a tie");
                        System.exit(0);
                    }
                    if (canvas.grid[canvas.Characters.playerPositionY][canvas.Characters.playerPositionX - 1] != 0 && canvas.grid[canvas.Characters.playerPositionY][canvas.Characters.playerPositionX - 1] != 3) {
                        canvas.grid[canvas.Characters.playerPositionY][canvas.Characters.playerPositionX - 1] = 9;
                        canvas.Characters.playerPositionX -= 1;
                        break;
                    }
                    else{
                        break;
                    }
                case 3: //Up
                    if(canvas.grid[canvas.Characters.playerPositionY - 1][canvas.Characters.playerPositionX] == 0 || canvas.grid[canvas.Characters.playerPositionY - 1][canvas.Characters.playerPositionX] == 8 || canvas.grid[canvas.Characters.playerPositionY - 1][canvas.Characters.playerPositionX] == 9) {
                        System.out.println("It's a tie");
                        System.exit(0);
                    }
                    if (canvas.grid[canvas.Characters.playerPositionY - 1][canvas.Characters.playerPositionX] != 0 && canvas.grid[canvas.Characters.playerPositionY - 1][canvas.Characters.playerPositionX] != 3) {
                        canvas.grid[canvas.Characters.playerPositionY - 1][canvas.Characters.playerPositionX] = 9;
                        canvas.Characters.playerPositionY -= 1;
                        break;
                    }
                    else{
                        break;
                    }
                case 4: //Down
                    if(canvas.grid[canvas.Characters.playerPositionY + 1][canvas.Characters.playerPositionX] == 0 || canvas.grid[canvas.Characters.playerPositionY + 1][canvas.Characters.playerPositionX] == 8 || canvas.grid[canvas.Characters.playerPositionY + 1][canvas.Characters.playerPositionX] == 9) {
                        System.out.println("It's a tie");
                        System.exit(0);
                    }
                    if (canvas.grid[canvas.Characters.playerPositionY + 1][canvas.Characters.playerPositionX] != 0 && canvas.grid[canvas.Characters.playerPositionY + 1][canvas.Characters.playerPositionX] != 3) {
                        canvas.grid[canvas.Characters.playerPositionY + 1][canvas.Characters.playerPositionX] = 9;
                        canvas.Characters.playerPositionY += 1;
                        break;
                    }
                    else {
                        break;
                    }
            }
            canvas.repaint();
            // Add pause
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}