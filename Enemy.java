public class Enemy {
    private String name;
    private int hp;
    private int attack_val = 1;
    private int charge_atk_val;
    public Enemy(String name, int hp, int attack_val){
        this.name = name;
        this.hp = hp;
        this.attack_val = attack_val;
    }
    public void gainHp(int health){
        hp += health;
    }
    public void loseHp(int health){
        hp -= health;
    }
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
}
