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
    System.out.println("1) Quick Hands: Gain 40% attack speed for 10 seconds");
    System.out.println("2) Piercing Shot: Shoot a powerful shot that can hit up to three enemies in a line");
    System.out.println("3) Follow Up Shot: Shoot one arrow followed by two others");
  }
  public void displayMoves_Mage(){
    System.out.println("1) Concentrate: Recover 50 Mana over 10 seconds");
    System.out.println("2) Fiery Blast: Summon a fireball that hits up to three enemies");
    System.out.println("3) Arcane Beam: Summon a beam made of pure magic that deals 2.5x your base damage value");
  }
  public void displayAbilities(String style){
    if (style.equals("warrior")) displayMoves_Warrior();
    else if (style.equals("mage")) displayMoves_Mage();
    else if (style.equals("ranger")) displayMoves_Ranger();
  }
  public void unwaveringResolve(Player p){
    int missing_hp = 100 - p.getHp();
    double shield_gain = missing_hp * 0.25;
    p.changeHp(p.getHp() + shield_gain);
  }
  public void decisiveBlows(Player p, Enemy e){
    int damage_dealt = p.getDamage() * 2;
    e.change_health(e.get_health() - damage_dealt);
  }
  public void sweepingStrike(Player p, Enemy a, Enemy b, Enemy c){
    a.change_health(a.get_health() - p.getDamage());
    b.change_health(b.get_health() - p.getDamage());
    c.change_health(c.get_health() - p.getDamage());
  }
}
