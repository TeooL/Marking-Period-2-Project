import java.util.Scanner;
public class Player {
    private String name;
    private String path;
    private double max_hp = 100;
    private double hp = 100;
    private double attack_power = 10.0;
    private double max_mana = 100;
    private double mana = 100;
    private Attack[] abilities;
    private Scanner input = new Scanner(System.in);

    public Player(String name,String path){
        this.name = name;
        this.path = path;
    }
    public void gainHp(double health){
        System.out.println("You have gained " + health + " HP.");
        hp += health;
    }
    public void loseHp(double health){
        System.out.println("You have lost " + health + " HP.");
        hp -= health;
    }
    public double getHp(){return hp;}
    public String getPath(){
        return path;
    }
    public void display_abilities(){
        if (path.equals("Warrior")){
            System.out.println("(1) Double Strike - Attacks your enemy twice in quick succession.");
            System.out.println("Deals damage equal to 1.5x your attack power");
            System.out.println("(2) Strong Resolve - Prepares your mind for the dangers ahead");
            System.out.println("Gain temporary health points equal to 35% of your max health");
            System.out.println("(3) Rush Down - Charges at the enemy and performs a diving strike");
            System.out.println("Deals damage equal to 2.5x your attack power");
            System.out.println("(4) Mighty Swing - Swings your blade around you attacking up to 3 enemies");
        }
        if (path.equals("Ranger")){
            System.out.println("(1) True Shot - Fires an arrow strong enough to pierce enemies");
            System.out.println("Deals damage equal 1.5x your attack power to up to two enemies");
            System.out.println("(2) Focus - Scan your surroundings to be prepared for anything ");
            System.out.println("You have a 90% to dodge your next attack while increasing your next attack by 2x");
            System.out.println("(3) Twin Arrow - Fires one arrow followed by a second at the same spot on the enemy");
            System.out.println("Deals normal damage with the first arrow, but if the second arrow hits, it deals 3x damage");
            System.out.println("(4) Requiem - Unleash a barrage of arrows at all the enemies");
            System.out.println("Deals 5x damage to all enemies on the field");
        }
        if (path.equals("Rogue")){
            System.out.println("(1) Fearless Stab - Brandish your weapon and charge straight at your enemy for a stab");
            System.out.println("Deals damage equal to 2x your attack power");
            System.out.println("(2) Into The Shadows - Envelope yourself in dark mist");
            System.out.println("Blocks the next instance of damage against you");
            System.out.println("(3) Taste of Death - Attack your enemy with blinding speed with a chance to dismember a part of their body");
            System.out.println("Deals damage equal to 1.5x your attack power with a small chance to instantly kill them");
            System.out.println("(4) Living Nightmare - Disappear and hover above your enemy for three seconds and then attack them");
            System.out.println("Deals damage equal to 4x your attack power, if the enemy is below 35% of the max health, they instantly die");
        }
    }
    public void levelUp(){
        System.out.println("You have leveled up!");
        System.out.println("What stat would you like to increase?");
        System.out.println("(1) Attack Power (+5.0)");
        System.out.println("(2) Health Points (+10.0)");
        System.out.println("(3) Mana (+20.0)");
        int choice = input.nextInt();
        if (choice == 1) {
            attack_power += 5.0;
            System.out.println("Your attack power has been increased");
        }
        if (choice == 2) {
            hp += 10;
            System.out.println("Your max health has been increased");
        }
        if (choice == 3) {
            mana += 20;
            System.out.println("Your max mana has been increased");
        }
    }
    public void war_double_strike(Enemy e){
        double damage = 1.5 * attack_power;
        e.loseHp(damage);
    }
    public void war_strong_resolve(){
        hp += 0.35 * max_hp;
    }
    public void war_diving_strike(Enemy e){
        double damage = 2.5 * attack_power;
        e.loseHp(damage);
    }
}
