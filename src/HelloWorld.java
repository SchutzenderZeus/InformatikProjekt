import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//Tobias du hast doch Latein  / Thalionmel

public class HelloWorld extends JFrame implements KeyListener {
    private JTextArea textArea;

    public HelloWorld() {
        textArea = new JTextArea();
        textArea.addKeyListener(this);
        add(textArea);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloWorld();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'h') {
            textArea.setRows(' ');
            textArea.append("Hallo Welt\n");
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
