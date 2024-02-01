import java.util.Random;
//
public class Enemy {
    private static int enemies_made = 0;
    private Random rand = new Random();
    private String name;
    private double hp;
    private double max_hp;
    private double attack_val = 10.0;
    private double charge_atk_val = 1;
    public Enemy(){
        int random_enemy = rand.nextInt(5) + 1;
        if (random_enemy == 1){
            name = "Skeleton";
            hp = 100;
            max_hp = 100;
            attack_val = 20;
        }
        if (random_enemy == 2){
            name = "Zombie";
            hp = 120;
            max_hp = 120;
            attack_val = 15;
        }
        if (random_enemy == 3){
            name = "Giant Bat";
            hp = 90;
            max_hp = 90;
        }
        if (random_enemy == 4){
            name = "Giant Spider";
            hp = 110;
            max_hp = 110;
        }
        if (random_enemy == 5){
            name = "Undead Mage";
            hp = 200;
            max_hp = 200;
        }
    }
    public Enemy(String name, int hp, int attack_val){
        this.name = name;
        this.hp = hp;
        this.attack_val = attack_val;
        enemies_made++;
    }
    public void gainHp(double health){
        hp += health;
    }
    public void loseHp(double health){
        System.out.println(name + " has lost " + health + " health");
        hp -= health;
    }
    public double getHp() {return hp;}
    public double getMax_hp() {return max_hp;}
    public void chargeAttack(Player p){
        if (charge_atk_val == 2){
            System.out.println(name + " is charged attacking!");
            p.loseHp(attack_val * 2);
            charge_atk_val = 1;
        }
        else {
            System.out.println(name + " is preparing a charged attack");
            charge_atk_val++;
        }
    }
    public void attack(Player p){
        System.out.println(name + " is attacking!");
        p.loseHp(attack_val);
    }
    public void healSelf(){
        System.out.println(name + " is healing themselves!");
        if (hp + 30 > max_hp) hp = max_hp;
        else hp += 30;
    }
    public void decide_action(Player p){
        int action = rand.nextInt(4);
        if (action == 0) attack(p);
        if (action == 1) chargeAttack(p);
        if (action == 3){
            if (hp == max_hp) System.out.println("It tried to heal but its already max");
            else healSelf();
        }
    }
}
