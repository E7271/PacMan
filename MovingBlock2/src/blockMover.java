import javax.swing.*;
import java.util.Random;

public class blockMover {


    private JPanel grid;


    public static void main(String[] args) {
        JFrame frame = new JFrame("blockMover");
        game gamePanel = new game();
        frame.setContentPane(gamePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.addKeyListener(gamePanel);
        gamePanel.requestFocus();
        while (true) {
            //Right
            if (gamePanel.lastKey == 1) {
                //Makes sure you don't go into walls
                if (gamePanel.grid[gamePanel.gridPositionY][gamePanel.gridPositionX + 1] != 0) {
                    gamePanel.gridPositionX = gamePanel.gridPositionX + 1;
                }
                //Score counter, and removes pellets
                if (gamePanel.grid[gamePanel.gridPositionY][gamePanel.gridPositionX] == 1) {
                    gamePanel.grid[gamePanel.gridPositionY][gamePanel.gridPositionX] = 2;
                    gamePanel.score += 1;
                    System.out.println(gamePanel.score);
                }
                if (gamePanel.gridPositionX == 27){
                    gamePanel.gridPositionX = 0;
                }
            }
            //Left
            if (gamePanel.lastKey == 2) {
                //Makes sure you don't go into walls
                if (gamePanel.grid[gamePanel.gridPositionY][gamePanel.gridPositionX - 1] != 0) {
                    gamePanel.gridPositionX = gamePanel.gridPositionX - 1;
                }
                //Score counter, and removes pellets
                if (gamePanel.grid[gamePanel.gridPositionY][gamePanel.gridPositionX] == 1) {
                    gamePanel.grid[gamePanel.gridPositionY][gamePanel.gridPositionX] = 2;
                    gamePanel.score += 1;
                    System.out.println(gamePanel.score);
                }
                if (gamePanel.gridPositionX == 0){
                    gamePanel.gridPositionX = 27;
                }
            }
            //Up
            if (gamePanel.lastKey == 3) {
                //Makes sure you don't go into walls
                if (gamePanel.grid[gamePanel.gridPositionY - 1][gamePanel.gridPositionX] != 0) {
                    gamePanel.gridPositionY = gamePanel.gridPositionY - 1;
                }
                //Score counter, and removes pellets
                if (gamePanel.grid[gamePanel.gridPositionY][gamePanel.gridPositionX] == 1) {
                    gamePanel.grid[gamePanel.gridPositionY][gamePanel.gridPositionX] = 2;
                    gamePanel.score += 1;
                    System.out.println(gamePanel.score);
                }
            }
            //Down
            if (gamePanel.lastKey == 4) {
                //Makes sure you don't go into walls
                if (gamePanel.grid[gamePanel.gridPositionY + 1][gamePanel.gridPositionX] != 0) {
                    gamePanel.gridPositionY = gamePanel.gridPositionY + 1;
                }
                //Score counter, and removes pellets
                if (gamePanel.grid[gamePanel.gridPositionY][gamePanel.gridPositionX] == 1) {
                    gamePanel.grid[gamePanel.gridPositionY][gamePanel.gridPositionX] = 2;
                    gamePanel.score += 1;
                    System.out.println(gamePanel.score);
                }




            }

            Random rand = new Random();
            int ghostDirection = rand.nextInt(4) + 1;
            //Ghost Movement

            while(true) {

            //Pink Ghost
                //right
                if (ghostDirection == 1){
                    //Makes sure ghost doesn't run isn't wall
                    if (gamePanel.grid[gamePanel.pinkGhostY][gamePanel.pinkGhostX + 1] != 0) {
                        gamePanel.pinkGhostX = gamePanel.pinkGhostX + 1;
                    }
                    break;
                }


                //left
                if (ghostDirection == 2){
                    //Makes sure ghost doesn't run isn't wall
                    if (gamePanel.grid[gamePanel.pinkGhostY][gamePanel.pinkGhostX - 1] != 0) {
                        gamePanel.pinkGhostX = gamePanel.pinkGhostX - 1;
                    }
                    break;
                }


                //up
                if (ghostDirection == 3){
                    //Makes sure ghost doesn't run isn't wall
                    if (gamePanel.grid[gamePanel.pinkGhostY - 1][gamePanel.pinkGhostX] != 0) {
                        gamePanel.pinkGhostY = gamePanel.pinkGhostY - 1;
                    }
                    break;
                }


                //down
                if (ghostDirection == 4){
                    //Makes sure ghost doesn't run isn't wall
                    if (gamePanel.grid[gamePanel.pinkGhostY + 1][gamePanel.pinkGhostX] != 0) {
                        gamePanel.pinkGhostY = gamePanel.pinkGhostY + 1;
                        
                    }
                    break;

                }
                
                break;
            }



            



            // Update frame buffer
            gamePanel.repaint();

            // Add pause
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

