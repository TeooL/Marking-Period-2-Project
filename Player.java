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
    public void display_abilities(){
        if (path.equals("Warrior")){
            System.out.println("(1) Double Strike - Attacks your enemy twice in quick succession.");
            System.out.println("Deals damage equal to twice your attack power");
            System.out.println("(2) Strong Resolve - Prepares your mind for the dangers ahead");
            System.out.println("Gain temporary health points equal to 20% of your max health");
            System.out.println("(3) Rush Down - Charges at the enemy and performs a diving strike");
            System.out.println("Deals damage equal to 2.5 times your attack power");
        }
    }
}
