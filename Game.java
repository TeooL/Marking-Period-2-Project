import java.util.Scanner;
public class Game{
  public Player character_creation(){
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");
    String player_name = input.nextLine();
    System.out.println("You are currently in the dark, three objects illuminated with light are in front of you");
    System.out.println("The left object is the sword, the middle object is the wand, the right object is the bow");
    System.out.println("Choose...");
    String weapon = input.nextLine();
    Potential player_potential = new Potential(weapon);
    Player player = new Player(player_name, player_potential);
    return player;
  }
}