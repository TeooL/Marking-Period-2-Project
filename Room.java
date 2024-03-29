import java.util.Scanner;
import java.util.Random;
public class Room {
    private Scanner input = new Scanner(System.in);
    private Random rand = new Random();
    private String room_type; //Monster, Trap, Puzzle
    private int num_enemies;
    private Enemy[] enemies = {};
    public Room(){
        int rand_room = rand.nextInt(100) + 1;
        if (rand_room <= 25){
            room_type = "Trap";
        }
        if (rand_room > 25){
            room_type = "Monster";
            num_enemies = rand.nextInt(3) + 1;
            enemies = new Enemy[num_enemies];
            for (int i = 0;i < num_enemies;i++){
                enemies[i] = new Enemy();
            }
        }
    }
    public void arrowTrap(Player p){
        System.out.println("You step into the room and you feel your foot sink into the floor.");
        System.out.println("A wall opens up at the end of the hallway and a lot of arrows come flying towards you.");
        System.out.println("You have 3 options.");
        System.out.println("Dodge (1) Block (2) or Hope (3) (No option guarantees safety)");
        int option = input.nextInt();
        int hit_val = 0;
        if (option == 1){
            hit_val = rand.nextInt(101);
            if (hit_val > 50) System.out.println("You dodged!");
            else {
                System.out.println("You were hit!");
                p.loseHp(20);
            }
        }
        if (option == 2){
            hit_val = rand.nextInt(101);
            if (hit_val > 80) System.out.println("The arrows fly past you!");
            else {
                System.out.println("You were hit, but you took reduced damage as a result of blocking");
                p.loseHp(10);
            }
        }
        if (option == 3){
            hit_val = rand.nextInt(101);
            if (hit_val > 90) System.out.println("All the arrows fly past you. Wow");
            else {
                System.out.println("You were hit. What did you expect.");
                p.loseHp(20);
            }
        }
    }
    public void fireTrap(Player p){
        System.out.println("You step into the room and you feel your foot sink into the floor.");
        System.out.println("You feel the room start to get hotter");
        System.out.println("A bright orange flame appears in the center of the room and disperses all out");
        System.out.println("You have 2 options.");
        System.out.println("Try to run out of the room (1) or Dodge into it (2)");
        int option = input.nextInt();
        int hit_val = 0;
        if (option == 1){
            hit_val = rand.nextInt(101);
            if (hit_val > 30) System.out.println("You made it out in time");
            else {
                System.out.println("The flames reach you and you are slightly burned");
                p.loseHp(10);
            }
        }
        if (option == 2){
            hit_val = rand.nextInt(101);
            if (hit_val > 50) System.out.println("You rolled under the wave of flames");
            else {
                System.out.println("Your back hits the flames while rolling and you are burnt");
                p.loseHp(20);
            }
        }
    }
    public void spikedBallsTrap(Player p){
        System.out.println("You step into the room and you feel your foot sink into the floor.");
        System.out.println("A lot of spiked balls fall from the ceiling");
        System.out.println("You have 3 options");
        System.out.println("Dodge (1), Block (2), or Stand Still (3)");
        int option = input.nextInt();
        int hit_val = 0;
        if (option == 1){
            hit_val = rand.nextInt(101);
            if (hit_val > 30) System.out.println("You dodge away from the spiked balls");
            else {
                System.out.println("Some of the spiked balls hit you");
                p.loseHp(20);
            }
        }
        if (option == 2){
            hit_val = rand.nextInt(101);
            if (hit_val > 50) System.out.println("You block bracing for an impact, but none of them hit you");
            else {
                System.out.println("The balls hit you, but you take reduced damage from blocking");
                p.loseHp(10);
            }
        }
        if (option == 3){
            hit_val = rand.nextInt(101);
            if (hit_val > 50) System.out.println("The spiked balls all miss you. Lucky");
            else {
                System.out.println("You were hit. What did you expect.");
                p.loseHp(20);
            }
        }
    }
    public void enterRoom(Player p,Dungeon d){
        if (room_type.equals("Monster")){
            for (Enemy enemy : enemies) {
                if (p.getHp() <= 0) break;
                d.fight(p, enemy);
            }
        }
        if (room_type.equals("Trap")){
            int trap_room = rand.nextInt(3) + 1;
            if (trap_room == 1) arrowTrap(p);
            if (trap_room == 2) fireTrap(p);
            if (trap_room == 3) spikedBallsTrap(p);
        }
    }
}

