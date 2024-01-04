import java.util.Scanner;
public class Dialogue {
    private Scanner input = new Scanner(System.in);
    private Colorizer color = new Colorizer();
    public void introduction(){
        System.out.println("Hello, Welcome to Dungeon Crawler");
        System.out.println("This is a text based RPG game where you will explore an ancient dungeon");
        System.out.println("Legend has it that it contains many riches");
        System.out.println("However, it is filled with monsters, traps, and puzzles");
        System.out.println("Only the greatest adventurers will ever hope to conquer this dungeon");
    }
    public void how_to_play(){
        System.out.println("The goal of this game is to explore the dungeon and gather as many artifacts as possible");
        System.out.println("There will be multiple rooms that you can go through and you may encounter enemies, a trap, or a puzzle");
        System.out.println("You can always return to the entrance of the dungeon to sell your artifacts by the shop");
        System.out.println("The shop also allows you to buy upgrades to help boost your stats");
    }
    public Player character_creation(){
        System.out.println("It's time to make your character.");
        System.out.println("What is your name?");
        String player_name = input.nextLine();
        System.out.println("Now what path will you walk?");
        System.out.println("Warrior (1) The path of brute force and defense");
        System.out.println("Ranger (2) The path of adaptability and swiftness");
        System.out.println("Rogue (3) The path of stealth and deadly strikes");
        int choice = input.nextInt();
        String chosen_path = "";
        if (choice == 1) chosen_path = "Warrior";
        else if (choice == 2) chosen_path = "Ranger";
        else if (choice == 3) chosen_path = "Rogue";
        else System.out.println("Invalid Choice");
        Player player = new Player(player_name, chosen_path);
        return player;
    }
}
