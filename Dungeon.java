public class Dungeon {
    private Room[] floor1 = new Room[4];
    private Room[] floor2 = new Room[4];
    private Room[] floor3 = new Room[4];
    private Room current_room = floor1[0];
    private Dialogue dialogue = new Dialogue();
    public Dungeon(){
        for (int i = 0; i < floor1.length; i++){
            floor1[i] = new Room();
        }
    }

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
    public void fight(Player p, Enemy e){
        while (p.getHp() > 0 && e.getHp() > 0) {
            int action = dialogue.decide_action();
            e.decide_action(p);
        }
        if (p.getHp() > 0) System.out.println("You have defeated the enemy");
        else System.out.println("You have been defeated");
    }
}
