public class Artifact {
    private String name;
    private int sell_val;
    public Artifact(String name, int sell_val){
        this.name = name;
        this.sell_val = sell_val;
    }
    public void display_sell_val(){
        System.out.println(name + " sells for $" + sell_val);
    }
    public String toString(){
        return name;
    }
}
