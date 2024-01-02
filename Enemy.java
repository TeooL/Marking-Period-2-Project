public class Enemy {
    private String name;
    private int hp;
    private int attack_val;
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
}
