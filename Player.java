public class Player{
  private String name;
  private int healthpoints = 100;
  private Potential style;
  private int damage;
  private int mana;
  
  public Player(String n, Potential p){
    name = n;
    style = p;
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
  public void attack_enemy(Enemy e, int damage){
    int health_after = e.get_health() - damage;
    e.change_health(health_after);
  }
}
