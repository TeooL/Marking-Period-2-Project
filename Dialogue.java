import java.util.Scanner;
public class Dialogue {
    private Scanner input = new Scanner(System.in);
    private Colorizer color = new Colorizer();
    public void introduction(){
        color.makeGreen("Hello, Welcome to Dungeon Crawler");
        color.makeGreen("This is a text based RPG game where you will explore an ancient dungeon");
        color.makeGreen("Legend has it that it contains many riches");
        color.makeGreen("However, it is filled with monsters and traps");
        color.makeGreen("Only the greatest adventurers will ever hope to conquer this dungeon");
    }
    public void how_to_play(){
        color.makeGreen("The goal of this game is to explore the dungeon and reach the end");
        color.makeGreen("There will be multiple rooms that you can go through and you may encounter enemies or a trap");
        System.out.println();
        color.makeGreen("It's time to enter the dungeon");
        color.makeGreen("Try your best to stay alive");
    }
    public Player character_creation(){
        color.makeGreen("Now what path will you walk?");
        color.makeRed("Warrior (1) The path of brute force and defense");
        color.makeGreen("Ranger (2) The path of adaptability and swiftness");
        color.makeBlue("Rogue (3) The path of stealth and deadly strikes");
        int choice = input.nextInt();
        String chosen_path = "";
        if (choice == 1) chosen_path = "Warrior";
        else if (choice == 2) chosen_path = "Ranger";
        else if (choice == 3) chosen_path = "Rogue";
        else System.out.println("Invalid Choice");
        Player player = new Player("Player", chosen_path);
        return player;
    }
    public int decide_action(){
        color.makeYellow("What do you do?");
        color.makeYellow("(1) Basic Attack");
        color.makeYellow("(2) Heal");
        color.makeYellow("(3) Abilities");
        int action = input.nextInt();
        return action;
    }
}
