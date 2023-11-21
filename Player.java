public class Player{
  private String name;
  private int healthpoints = 100;
  private Potential style;
  
  
  public Player(String n){
    name = n;
  }
  public void rest(){
    healthpoints += 25;
  }
  public int getHp(){
    return healthpoints;
  }
  public void changeHp(int num){
    healthpoints -= num;
  }
}