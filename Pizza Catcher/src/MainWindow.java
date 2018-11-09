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
    }

}
