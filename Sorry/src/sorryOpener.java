import javax.swing.*;

public class sorryOpener {

    public static void main(String[] args) {

        // Create the window to hold the game
        JFrame window = new JFrame("Game");

        // Create the "canvas" JPanel from MainGame
        gameboard gameboard = new gameboard();


        // Add the canvas as a JPanel to the window
        window.setContentPane(gameboard);

        // Finish setting up the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
    }


}
