import java.util.Scanner;
import java.util.Random;
public class Room {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    String room_type; //Monster, Trap, Puzzle
    int num_enemies;
    int danger_val;
    public Room(){
        room_type = "Puzzle";
    }
    public Room(int n){
        room_type = "Monster";
        num_enemies = n;
    }
    public Room(int n, String trap_name){
        room_type = "Trap";
        danger_val = n;
    }
    public void arrowTrap(Player p){ // Add health loss when the player gets hit later
        System.out.println("You step into the room and you feel your foot sink into the floor.");
        System.out.println("A wall opens up at the end of the hallway and a lot of arrows come flying towards you.");
        System.out.println("You have 3 options. Dodge, Block, or Hope for the Best.");
        System.out.println("Dodge (1) Block (2) or Hope (3)? (No option guarantees safety)");
        int option = input.nextInt();
        int hit_val = 0;
        if (option == 1){
            hit_val = rand.nextInt(101);
            if (hit_val >= 50) System.out.println("You dodged!");
            else System.out.println("You were hit!");
        }
        if (option == 2){
            hit_val = rand.nextInt(101);
            if (hit_val >= 80) System.out.println("The arrows fly past you!");
            else System.out.println("You were hit, but you took reduced damage as a result of blocking");
        }
        if (option == 3){
            hit_val = rand.nextInt(101);
            if (hit_val >= 90) System.out.println("All the arrows fly past you. Wow");
            else System.out.println("You were hit. What did you expect.");
        }
    }
}

