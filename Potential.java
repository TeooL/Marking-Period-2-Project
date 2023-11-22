public class Potential{
  private String style;
  
  public Potential(String n){
    style = n;
  }
  public void displayMoves_Warrior(){
   System.out.println("1) Unwavering Resolve: Gain shield equal to 25% of missing health");
   System.out.println("2) Decisive Blows: Deal damage equal to two times your attack value");
   System.out.println("3) Sweeping Strike: Deal damage equal to your attack value up to 3 targets in front of you");
  }
  public void displayMoves_Ranger(){
    //Add moves for Ranger
  }
  public void displayMoves_Mage(){
    //Add moves for Mage
  }
}
