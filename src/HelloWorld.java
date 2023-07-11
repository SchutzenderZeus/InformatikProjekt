import java.awt.*;
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


    public Chat1(){
        textArea = new JTextArea();
        textArea.addKeyListener(this);
        add(textArea);
        Chat1.setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setVisible(true);
    }





    private Image backgroundImage;
    private Image objectImage;



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
        new HelloWorld();
        JFrame Chat1 = new HelloWorld();

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
