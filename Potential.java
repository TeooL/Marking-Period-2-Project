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
   System.out.println("1) Concentrate: Recover 50 Mana over 10 seconds")
   System.out.println("2) Fiery Blast: Summon a fireball that hits up to three enemies")
   System.out.println("3) Arcane Beam: Summon a beam made of pure magic that lasts for 5 seconds")
  }
}