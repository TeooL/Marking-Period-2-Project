public class Main{
  public static void main(String[]args){
    GUI gui = new GUI();
    gui.displayMap();
    Game RPG = new Game();
    boolean playing = true;
    Player player = RPG.character_creation();
    while (playing){
      RPG.act_one();
      Enemy prisoner = new Enemy("Prisoner", 50, 10 );

      break;
    }
      System.out.println("Thanks for Playing");
  }
}

