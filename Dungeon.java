import java.util.Scanner;
public class Dungeon {
    private Room[] floor1 = new Room[4];
    private Room[] floor2 = new Room[4];
    private Room[] floor3 = new Room[4];
    private Dialogue dialogue = new Dialogue();
    private Colorizer color = new Colorizer();
    private Scanner scanner = new Scanner(System.in);

    public void generateDungeon(){
        for (int i = 0; i < floor1.length; i++){
            floor1[i] = new Room();
            floor2[i] = new Room();
            floor3[i] = new Room();
        }
    }

    public void play(){
        Dialogue dia = new Dialogue();
        Colorizer color = new Colorizer();
        dia.introduction();
        System.out.println();
        Player p = dia.character_creation();
        System.out.println();
        dia.how_to_play();
        generateDungeon();
        enter_dungeon(p);
    }
    public void fight(Player p, Enemy e){
        System.out.println("The room gives off the smell of blood");
        System.out.println("You prepare for a fight.");
        while (p.getHp() > 0 && e.getHp() > 0) {
            int action = dialogue.decide_action();
            if (action == 1) p.basic_attack(e);
            if (action == 2) p.gainHp(20);
            if (action == 3){
                p.display_abilities();
                System.out.println("What would you like to use? (1-4)");
                int choice = scanner.nextInt();
                if (p.getPath().equals("Warrior")){
                    if (choice == 1) p.war_double_strike(e);
                    if (choice == 2) p.war_strong_resolve();
                    if (choice == 3) p.war_diving_strike(e);
                    if (choice == 4) p.war_final_slash(e);
                }
                if (p.getPath().equals("Ranger")){
                    if (choice == 1) p.ran_true_shot(e);
                    if (choice == 2) p.ran_focus();
                    if (choice == 3) p.ran_twin_arrow(e);
                    if (choice == 4) p.ran_requiem(e);
                }
                if (p.getPath().equals("Rogue")){
                    if (choice == 1) p.rog_fearless_stab(e);
                    if (choice == 2) p.rog_into_the_shadows();
                    if (choice == 3) p.rog_taste_of_death(e);
                    if (choice == 4) p.rog_living_nightmare(e);
                }
            }
            e.decide_action(p);
            display_healths(p,e);
        }
        if (p.getHp() > 0) System.out.println("You have defeated the enemy");
    }
    public void enter_dungeon(Player p) {
        while (p.getHp() > 0) {
            for (Room room : floor1) {
                if (p.getHp() <= 0) break;
                room.enterRoom(p, this);
            }
            if (p.getHp() <= 0) break;
            p.levelUp();
            p.levelUp();
            p.levelUp();
            for (Room room : floor2) {
                if (p.getHp() <= 0) break;
                room.enterRoom(p, this);
            }
            if (p.getHp() <= 0) break;
            p.levelUp();
            p.levelUp();
            p.levelUp();
            for (Room room : floor3) {
                if (p.getHp() <= 0) break;
                room.enterRoom(p, this);
            }
            break;
        }
        if (p.getHp() > 0){
            color.makeYellow("You made it to the end of the dungeon!!!");
            color.makeYellow("You have received many riches and a 5 for your project!");
        }
        else color.makeRed("You have been defeated...");
    }
    public void display_healths(Player p, Enemy e){
        color.makeGreen("Player: " + p.getHp() + "/" + p.getMaxhp());
        color.makeRed("Enemy: " + e.getHp() + "/" + e.getMax_hp());
    }
}
