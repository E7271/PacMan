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
        Characters Characters = new Characters();


        // Add the canvas as a JPanel to the window
        window.setContentPane(canvas);

        // Finish setting up the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
        while (true) {

            switch (canvas.lastKey) {

                case 1: //Right
                    if (canvas.grid[Characters.playerPositionY][Characters.playerPositionX + 1] != 0) {
                        canvas.grid[Characters.playerPositionY][Characters.playerPositionX + 1] = 9;
                        Characters.playerPositionX += 1;
                        break;
                    }
                    else{
                        Characters.playerPositionX += 1;
                    }
                case 2: //Left
                    if (canvas.grid[Characters.playerPositionY][Characters.playerPositionX - 1] != 0) {
                        canvas.grid[Characters.playerPositionY][Characters.playerPositionX - 1] = 9;
                        Characters.playerPositionX -= 1;
                        break;
                    }
                    else{
                        break;
                    }
                case 3: //Up
                    if (canvas.grid[Characters.playerPositionY - 1][Characters.playerPositionX] != 0) {
                        canvas.grid[Characters.playerPositionY - 1][Characters.playerPositionX] = 9;
                        Characters.playerPositionY -= 1;
                        break;
                    }
                    else{
                        break;
                    }
                case 4: //Down
                    if (canvas.grid[Characters.playerPositionY + 1][Characters.playerPositionX] != 0) {
                        canvas.grid[Characters.playerPositionY + 1][Characters.playerPositionX] = 9;
                        Characters.playerPositionY += 1;
                        break;
                    }
                    else {
                        break;
                    }
            }





            System.out.println(canvas.lastKey);
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