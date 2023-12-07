import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
public class GUI {
    public void displayMap(){
        JFrame frame = new JFrame("Map Layout");
        GridLayout grid = new GridLayout(8,8);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setLayout(grid);
        JButton ability_1 = new JButton("Ability 1");
        JButton ability_2 = new JButton("Ability 2");
        JButton ability_3 = new JButton("Ability 3");
        JButton ultimate = new JButton("Ultimate");
        JTextField input = new JTextField("Input");
        frame.add(ability_1);
        frame.add(ability_2);
        frame.add(ability_3);
        frame.add(ultimate);
        frame.add(input);
    }
    public static String coloredText(String color, String text){
        return color + text + "\u001B";
    }
}
