import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.Graphics;
public class GUI {
    public void MainWindow(){
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Current Room");
        JMenu m2 = new JMenu("Map");
        JMenu m3 = new JMenu("Inventory");
        JMenu m4 = new JMenu("Stats");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.setVisible(true);
    }
    public void StartMenu(){
    }
}
