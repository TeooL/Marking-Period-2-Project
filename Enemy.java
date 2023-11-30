public class Enemy{
  private String name;
  private int health;
  private int movement;
  private int attack_dmg;
  
  public Enemy(String n, int h, int m, int ad){
    name = n;
    health = h;
    movement = m;
    attack_dmg = ad;
  }
  public void move(int n){
    movement -= n;
  }
  public int get_health(){
    return health;
  }
  public void change_health(int h){
    health = h;
  }
  public String toString(){ return name; }
}
