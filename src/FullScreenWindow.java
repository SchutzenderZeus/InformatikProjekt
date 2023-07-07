import javax.swing.*;
import java.awt.*;


public class FullScreenWindow extends JFrame {
    private Image backgroundImage;
    private Image objectImage;

    public FullScreenWindow() {
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hintergrundbild laden
        backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\MaximilianJatzlau\\IdeaProjects\\InformatikProjekt\\src\\Bilder\\Wald.jpg");

        // Objektbild laden
        objectImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\MaximilianJatzlau\\IdeaProjects\\InformatikProjekt\\src\\Bilder\\Zwerg.png");

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Hintergrundbild zeichnen
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

        // Objektbild in der Mitte des Fensters zeichnen
        int objectX = (getWidth() - objectImage.getWidth(this)) / 2;
        int objectY = (getHeight() - objectImage.getHeight(this)) / 2;
        g.drawImage(objectImage, objectX, objectY, this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FullScreenWindow::new);
        System.out.println("Gus");
    }
}
