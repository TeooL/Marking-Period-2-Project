public class Player{
  private String name;
  private int healthpoints = 100;
  private Potential style;
  private int damage = 10;
  private int mana;
  private boolean hiding;
  
  public Player(String n, Potential p){
    name = n;
    style = p;
  }
  public Player(String n, Potential p, int z){
    name = n;
    style = p;
    mana = 100;
  }
  public void rest(){
    healthpoints += 25;
  }
  public int getHp(){
    return healthpoints;
  }
  public void changeHp(double num){
    healthpoints -= num;
  }
  public void attack_enemy(Enemy e, int damage){
    double health_after = e.get_health() - damage;
    e.change_health(health_after);
  }
  public int getDamage(){return damage;}
  public Potential getStyle(){return style;}
  public void initiateFight(Enemy e){
    while (e.get_health() >= 0 && healthpoints >= 0){
    }
  }
  public void makeMove(){
    System.out.println("What do you do?");
    System.out.println("1) Attack ");
    System.out.println("2) Use Abilities");
    System.out.println("3) Rest");
    System.out.println("4) View Artifacts");
  }
  public void change_hide(boolean c){
    hiding = c;
  }
  public void change_mana(int m){
    mana += m;
  }
}
