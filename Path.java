public class Path {
    private String name; // Displays the name of the path (Warrior, Ranger or Rogue);
    private int pathID; // 1 = Warrior, 2 = Ranger, 3 = Rogue;

    public Path(String name, int ID){
        this.name = name;
        pathID = ID;
    }
}
