import java.io.*;
public class Main{
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_GREEN = "\\u001B[32m";
  public static final String ANSI_RED = "\\u001B[31m";
  public static final String ANSI_BLUE = "\\u001B[34m";
  public static void main(String[]args){
    GUI gui = new GUI();
    gui.displayOptions();
    Game RPG = new Game();
    boolean playing = true;
    Player player = RPG.character_creation();
    while (playing){
      RPG.act_one();
      Enemy prisoner = new Enemy("Prisoner", 50, 10 );

      break;
    }
      System.out.println(coloredText(ANSI_YELLOW, "Thanks for Playing!"));
  }
  public static String coloredText(String color, String text){
    return color + text + "\u001B";
  }
}

