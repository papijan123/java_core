import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BouncingBall extends JPanel implements ActionListener {
    // Window dimensions
    private final int WIDTH = 108*5;
    private final int HEIGHT = 192*5;

    // Ball attributes
    private final int BALL_DIAMETER = 500;
    private int ballX = 50;
    private int ballY = 50;
    
    // Physics / Velocity variables
    private int xSpeed = 3;
    private int ySpeed = 3;

    public BouncingBall() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);

        // Timer triggers the actionPerformed method every 10 milliseconds
        Timer timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Enable anti-aliasing for smoother visuals
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the moving ball
        g2d.setColor(Color.CYAN);
        g2d.fillOval(ballX, ballY, BALL_DIAMETER, BALL_DIAMETER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the position of the ball
        ballX += xSpeed;
        ballY += ySpeed;

        // Bounce off left or right walls
        if (ballX <= 0 || ballX >= WIDTH - BALL_DIAMETER) {
            xSpeed = -xSpeed;
        }

        // Bounce off top or bottom walls
        if (ballY <= 0 || ballY >= HEIGHT - BALL_DIAMETER) {
            ySpeed = -ySpeed;
        }

        // Force the panel to clear and redraw itself
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Swing Animation Example");
        BouncingBall panel = new BouncingBall();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center window on screen
        frame.setVisible(true);
    }
}