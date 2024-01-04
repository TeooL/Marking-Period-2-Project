public class Main {
    public static void main(String[]args){
        Dialogue dia = new Dialogue();
        dia.introduction();
        System.out.println();
        Player p = dia.character_creation();
        System.out.println();
        dia.how_to_play();
        Colorizer color = new Colorizer();
        color.makeBlue("This is Red");
    }
}