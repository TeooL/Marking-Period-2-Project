public class Attack {
    private String name;
    private int mana_cost;

    private double multiplier;
    public Attack(String name, int mana_cost, double multiplier){
        this.name = name;
        this.mana_cost = mana_cost;
        this.multiplier = multiplier;
    }
}
