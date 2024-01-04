public class Colorizer { // This will be used to add color to all the text
    private String resetter = "\u001B[0m";
    private String red = "\u001B[31m";
    private String blue = "\u001B[34m";
    private String green = "\u001B[32m";
    private String yellow = "\u001B[33m";
    public void makeRed(String text){
        System.out.println(red + text + resetter);
    }
    public void makeBlue(String text){
        System.out.println(blue + text + resetter);
    }

    public void makeGreen(String text){System.out.println(green + text + resetter);}
    public void makeYellow(String text){System.out.println(yellow + text + resetter);}
}
