import java.util.Scanner;
import java.util.Random;
public class Player {
    private String name;
    private String path;
    private double max_hp = 100;
    private double hp = 100;
    private double attack_power = 10.0;
    private double dodge_chance = 10.0;
    private boolean dodge_next;
    private double next_attack_multiplier = 1.0;
    private Scanner input = new Scanner(System.in);
    private Random rand = new Random();
    private Colorizer color = new Colorizer();

    public Player(String name,String path){
        this.name = name;
        this.path = path;
    }
    public void gainHp(double health){
        System.out.println("You have gained " + health + " HP.");
        if (health + hp > max_hp) hp = max_hp;
        else hp += health;
    }
    public void loseHp(double health){
        System.out.println("You have lost " + health + " HP.");
        hp -= health;
    }
    public double getHp(){return hp;}
    public double getMaxhp(){return max_hp;}
    public String getPath(){
        return path;
    }
    public void display_abilities(){
        if (path.equals("Warrior")){
            color.makeRed("(1) Double Strike - Attacks your enemy twice in quick succession.");
            color.makeRed("Deals damage equal to 1.5x your attack power");
            color.makeRed("(2) Strong Resolve - Prepares your mind for the dangers ahead");
            color.makeRed("Gain temporary health points equal to 35% of your max health");
            color.makeRed("(3) Rush Down - Charges at the enemy and performs a diving strike");
            color.makeRed("Deals damage equal to 2.5x your attack power");
            color.makeRed("(4) Final Slash - Perform an ultimate slash on an enemy");
            color.makeRed("Deals damage equal to 50% of the enemies max health");
        }
        if (path.equals("Ranger")){
            color.makeGreen("(1) True Shot - Fires a tipped arrow made of iron");
            color.makeGreen("Deals damage equal 1.5x your attack power");
            color.makeGreen("(2) Focus - Scan your surroundings to be prepared for anything ");
            color.makeGreen("You will dodge the next enemy attack while increasing your next basic attack by 2x");
            color.makeGreen("(3) Twin Arrow - Fires one arrow followed by a second at the same spot on the enemy");
            color.makeGreen("Deals normal damage with the first arrow, but if the second arrow hits, it deals 3x damage");
            color.makeGreen("(4) Requiem - Unleash a barrage of arrows at the enemy");
            color.makeGreen("Deals damage equal to the attack power times all the arrows that manage to land");
        }
        if (path.equals("Rogue")){
            color.makeBlue("(1) Fearless Stab - Brandish your weapon and charge straight at your enemy for a stab");
            color.makeBlue("Deals damage equal to 2x your attack power");
            color.makeBlue("(2) Into The Shadows - Envelope yourself in dark mist");
            color.makeBlue("Blocks the next instance of damage against you");
            color.makeBlue("(3) Taste of Death - Attack your enemy with blinding speed with a chance to dismember a part of their body");
            color.makeBlue("Deals damage equal to 1.5x your attack power with a small chance to instantly kill them");
            color.makeBlue("(4) Living Nightmare - Disappear and hover above your enemy for three seconds and then attack them");
            color.makeBlue("Deals damage equal to 4x your attack power, if the enemy is below 35% of the max health, they instantly die");
        }
    }
    public void levelUp(){
        color.makeGreen("You have leveled up!");
        color.makeGreen("What stat would you like to increase?");
        color.makeGreen("(1) Attack Power (+5.0)");
        color.makeGreen("(2) Health Points (+20.0)");
        int choice = input.nextInt();
        if (choice == 1) {
            attack_power += 5.0;
            System.out.println("Your attack power has been increased");
        }
        else if (choice == 2) {
            max_hp += 20;
            System.out.println("Your max health has been increased");
        }
        else{
            System.out.println("Invalid Choice");
            levelUp();
        }
    }
    public void basic_attack(Enemy e){
        e.loseHp(attack_power * next_attack_multiplier);
        if (next_attack_multiplier > 1) next_attack_multiplier = 1;
    }
    public void war_double_strike(Enemy e){
        System.out.println("You used double strike!");
        double damage = 1.5 * attack_power;
        e.loseHp(damage);
    }
    public void war_strong_resolve(){
        System.out.println("You used strong resolve!");
        hp += 0.35 * max_hp;
    }
    public void war_diving_strike(Enemy e){
        System.out.println("You used diving strike!");
        double damage = 2.5 * attack_power;
        e.loseHp(damage);
    }
    public void war_final_slash(Enemy e){
        System.out.println("You used final slash!");
        double damage = e.getMax_hp() * 0.5;
        e.loseHp(damage);
    }
    public void ran_true_shot(Enemy e){
        System.out.println("You used true shot!");
        double damage = 1.5 * attack_power;
        e.loseHp(damage);
    }
    public void ran_focus(){
        System.out.println("You used focus!");
        next_attack_multiplier = 2.0;
        dodge_next = true;
    }
    public void ran_twin_arrow(Enemy e){
        System.out.println("You used twin arrow!");
        double damage = attack_power;
        double second_hit_chance = rand.nextInt(100) + 1;
        if (second_hit_chance <= 75) e.loseHp(damage * 3);
        else e.loseHp(damage);
    }
    public void ran_requiem(Enemy e){
        System.out.println("You used requiem!");
        double damage =  attack_power;
        int arrows_hit = rand.nextInt(10) + 1;
        System.out.println("You hit " + arrows_hit + " arrows!");
        e.loseHp(damage * arrows_hit);
    }
    public void rog_fearless_stab(Enemy e){
        System.out.println("You used fearless stab!");
        double damage = 2.0 * attack_power;
        e.loseHp(damage);
    }
    public void rog_into_the_shadows(){
        System.out.println("You used into the shadows!");
        dodge_next = true;
    }
    public void rog_taste_of_death(Enemy e){
        System.out.println("You used taste of death!");
        double damage = 1.5 * attack_power;
        int instant_kill = rand.nextInt(100) + 1;
        if (instant_kill <= 25) e.loseHp(e.getHp());
        else e.loseHp(1.5 * attack_power);
    }
    public void rog_living_nightmare(Enemy e){
        System.out.println("You used living nightmare!");
        if (e.getHp() <= 0.4 *e.getMax_hp()) e.loseHp(e.getHp());
        else e.loseHp(attack_power * 4);
    }
}
