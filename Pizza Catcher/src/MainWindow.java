import javax.swing.*;

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

            switch (canvas.lastKey) {

                case 1: //Right
                    //Makes sure you don't go into walls
                    if (canvas.grid[canvas.playerPositionY][canvas.playerPositionX + 1] != 0) {
                        canvas.grid[canvas.playerPositionY][canvas.playerPositionX + 1] = 9;
                        canvas.playerPositionX += 1;
                        break;
                    }
                case 2: //Left
                    //Makes sure you don't go into walls
                    if (canvas.grid[canvas.playerPositionY][canvas.playerPositionX - 1] != 0) {
                        canvas.grid[canvas.playerPositionY][canvas.playerPositionX - 1] = 9;
                        canvas.playerPositionX -= 1;
                        break;
                    }
                case 3: //Up
                    //Makes sure you don't go into walls
                    if (canvas.grid[canvas.playerPositionY - 1][canvas.playerPositionX] != 0) {
                        canvas.grid[canvas.playerPositionY - 1][canvas.playerPositionX] = 9;
                        canvas.playerPositionY -= 1;
                        break;
                    }
                case 4: //Down
                    //Makes sure you don't go into walls
                    if (canvas.grid[canvas.playerPositionY + 1][canvas.playerPositionX] != 0) {
                        canvas.grid[canvas.playerPositionY + 1][canvas.playerPositionX] = 9;
                        canvas.playerPositionY += 1;
                        break;
                    }
                    break;
            }
            canvas.repaint();
            // Add pause
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}