import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Dimension;

//Tobias du hast doch Latein  / Thalionmel

public class HelloWorld extends JFrame implements KeyListener {
    private JTextArea textArea;

    public HelloWorld() {
        setUndecorated(true);
        setSize(1041,780);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hintergrundbild laden
        backgroundImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\MaximilianJatzlau\\IdeaProjects\\InformatikProjekt\\src\\Bilder\\Wald.jpg");

        // Objektbild laden
        objectImage = Toolkit.getDefaultToolkit().getImage("C:\\Users\\MaximilianJatzlau\\IdeaProjects\\InformatikProjekt\\src\\Bilder\\Zwerg.png");

        setVisible(true);

    }


    private Image backgroundImage;
    private Image objectImage;

    public static Image chat = Toolkit.getDefaultToolkit().getImage("C:\\Users\\MaximilianJatzlau\\IdeaProjects\\InformatikProjekt\\src\\Bilder\\White.png");




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


        JFrame Background1 = new HelloWorld();



        JTextArea chat1 = new JTextArea(); // Umbenennung zu "Chat1"
        JFrame frame2 = new JFrame("Chat 1"); // Umbenennung zu "Chat 1"
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLocation(1041,0);
        frame2.setSize(300, 780);
        frame2.setLocationRelativeTo(null);
        frame2.add(chat1); // Hinzufügen des JTextArea "Chat1" zum JFrame "Chat 1"
        frame2.setVisible(true);
        frame2.imageUpdate(chat,0,0,0,0,0);

    }



    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'h') {
            textArea.setRows(' ');
            textArea.append("Hallo Welt\n");
            System.out.println("Hi");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Nicht benötigt
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Nicht benötigt
    }
}
