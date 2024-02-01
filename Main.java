public class Main {
    public static void main(String[]args){
        Dungeon game = new Dungeon();
        game.play();
    }
    public static void max(){
        Requirements r = new Requirements(new Enemy());
        r.use();
        r.returnMax(new int[]{1,2,3,4,5,6});
        System.out.println(r);
    }
}