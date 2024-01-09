public class Dungeon {
    private Room[] floor1 = new Room[4];
    private Room[] floor2 = new Room[4];
    private Room[] floor3 = new Room[4];
    private Room current_room = floor1[0];

    public void play(){
        GUI display = new GUI();
        display.MainWindow();
        Dialogue dia = new Dialogue();
        dia.introduction();
        System.out.println();
        Player p = dia.character_creation();
        System.out.println();
        dia.how_to_play();
        Colorizer color = new Colorizer();
        color.makeBlue("This is Blue");
    }
}
