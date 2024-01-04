public class Player {
    private String name;
    private String path;
    private double hp = 100;
    private double attack_power = 10.0;
    private double mana = 100;


    public Player(String name,String path){
        this.name = name;
        this.path = path;
    }
    public void gainHp(int health){
        hp += health;
    }
    public void loseHp(int health){
        hp -= health;
    }
}
