public class Dungeon {
    private Room[] floor1 = new Room[4];
    private Room[] floor2 = new Room[4];
    private Room[] floor3 = new Room[4];
    private Room current_room;
    private int floorNum = 1;
    private int roomNum = 0;
    private Dialogue dialogue = new Dialogue();

    public void generateDungeon(){
        for (int i = 0; i < floor1.length; i++){
            floor1[i] = new Room();
            floor2[i] = new Room();
            floor3[i] = new Room();
        }
        current_room = floor1[0];
    }

    public void play(){
        GUI display = new GUI();
        Dialogue dia = new Dialogue();
        Colorizer color = new Colorizer();
        display.MainWindow();
        dia.introduction();
        System.out.println();
        Player p = dia.character_creation();
        System.out.println();
        dia.how_to_play();
        generateDungeon();
        enter_dungeon(p);
        color.makeBlue("This is Blue");
    }
    public void fight(Player p, Enemy e){
        System.out.println("The room gives off the smell of blood");
        System.out.println("You prepare for a fight.");
        while (p.getHp() > 0 && e.getHp() > 0) {
            int action = dialogue.decide_action();
            if (p.getPath().equals("Warrior")){
                if (action == 1) p.war_double_strike(e);
                if (action == 2) p.war_strong_resolve();
                if (action == 3) p.war_diving_strike(e);
            }
            e.decide_action(p);
        }
        if (p.getHp() > 0) System.out.println("You have defeated the enemy");
        else System.out.println("You have been defeated");
    }
    public void enter_dungeon(Player p) {
        while (p.getHp() > 0) {
            current_room.enterRoom(p, this);
            current_room = floor1[1];
            current_room.enterRoom(p, this);
            current_room = floor1[2];
            current_room.enterRoom(p, this);
            current_room = floor1[3];
            current_room.enterRoom(p, this);
        }
    }
}
