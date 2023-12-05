import java.util.Scanner;
public class Game{
  public Player character_creation() {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");
    String player_name = input.nextLine();
    System.out.println("You are currently in the dark, three objects illuminated with light are in front of you");
    System.out.println("The left object is the sword, the middle object is the wand, the right object is the bow");
    System.out.println("Choose...");
    String weapon = input.nextLine();
    if (weapon.equals("sword")) weapon = "warrior";
    else if (weapon.equals("wand")) weapon = "mage";
    else if (weapon.equals("bow")) weapon = "ranger";
    Potential player_potential = new Potential(weapon);
    if (player_potential.equals("mage")) {
       Player player = new Player(player_name, player_potential, 100);
       return player;
    }
    else {
       Player player = new Player(player_name, player_potential);
       return player;
    }
  }
  public void act_one(){
    System.out.println("You wake up in a dimly lit room, surrounded by prison cells.");
    System.out.println("Your weapon is in front of you and your door is swung wide open.");
    System.out.println("All the other cells seem to be open too.");
    System.out.println("You leave your cell and see another prisoner before you with a metal pipe.");
  }
  public void startFight(){

  }
}
