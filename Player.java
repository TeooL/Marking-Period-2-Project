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
            System.out.println("Deals damage equal to 1.5x your attack power");
            System.out.println("(2) Strong Resolve - Prepares your mind for the dangers ahead");
            System.out.println("Gain temporary health points equal to 20% of your max health");
            System.out.println("(3) Rush Down - Charges at the enemy and performs a diving strike");
            System.out.println("Deals damage equal to 2.5 times your attack power");
            System.out.println("(4) Mighty Swing - Swings your blade around you attacking up to 3 enemies");
        }
        if (path.equals("Ranger")){ // WORK IN PROGRESS
            System.out.println("(1) Piercing Arrow - Attacks up to two enemies with one arrow");
            System.out.println("(2) Adept Leap - Jumps into the air and prepares arrows");
            System.out.println("(3) Arrow Rain - Fire arrows  ");
            System.out.println("(4) Requiem - Unleash ");
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
}
