import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
public class Main{
  public static void main(String[]args){
    JFrame frame = new JFrame("Map Layout");
    JFrame frame_2 = new JFrame("Buttons");
    GridLayout grid = new GridLayout(8,8);
    frame.setVisible(true);
    frame_2.setVisible(true);
    frame_2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame_2.setSize(500,500);
    frame.setSize(1000,1000);
    frame.setLayout(grid);
    frame.setResizable(true);
    for (int i = 0; i != 64;i++){
      JButton jbutton = new JButton();
      frame.add(jbutton);
    }
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




    Game RPG = new Game();
    boolean playing = true;
    Player player = RPG.character_creation();
    while (playing){
      break;
    }
      System.out.println("Thanks for Playing");
  }
}

