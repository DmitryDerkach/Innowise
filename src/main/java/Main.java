import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setResizable(false); // Prevent window resizing
        frame.add(new GamePanel());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); // Center the window
    }
}
