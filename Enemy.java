import java.util.Random;
public class Enemy {
    private Random rand = new Random();
    private String name;
    private double hp;
    private double attack_val = 10.0;
    private double charge_atk_val = 1;
    public Enemy(){
        int random_enemy = rand.nextInt(5) + 1;
        if (random_enemy == 1){
            name = "Skeleton";
            hp = 100;
        }
        if (random_enemy == 2){
            name = "Zombie";
            hp = 120;
        }
        if (random_enemy == 3){
            name = "Giant Bat";
            hp = 90;
        }
        if (random_enemy == 4){
            name = "Giant Spider";
            hp = 110;
        }
    }
    public Enemy(String name, int hp, int attack_val){
        this.name = name;
        this.hp = hp;
        this.attack_val = attack_val;
    }
    public void gainHp(double health){
        hp += health;
    }
    public void loseHp(double health){
        hp -= health;
    }
    public double getHp() {return hp;}
    public void chargeAttack(Player p){
        if (charge_atk_val == 2){
            System.out.println(name + " is charged attacking!");
            p.loseHp(attack_val * 3);
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
    public void healFriendly(Enemy e){
        System.out.println(name + " is healing " + e);
        e.gainHp(30);
    }
    public void healSelf(){
        System.out.println(name + " is healing themselves!");
        this.gainHp(30);
    }
    public void decide_action(Player p){
        int action = rand.nextInt(4);
        if (action == 0) attack(p);
        if (action == 1) chargeAttack(p);
        if (action == 3) healSelf();
    }
}
