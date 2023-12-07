public class Enemy{
  private String name;
  private double health;
  private int movement;
  private int attack_dmg;
  
  public Enemy(String n, int h, int ad){
    name = n;
    health = h;
    attack_dmg = ad;
  }
  public double get_health(){
    return health;
  }
  public void change_health(double h){
    health = h;
  }
  public String toString(){ return name; }
}
