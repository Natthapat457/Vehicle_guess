package th.ac.su.cp.vehicle_guess.model;

public class Vehicle_item {
    public final int imageResId;
    public final String vehicle_name;
    public final String weight;

    public Vehicle_item(int imageResId, String name,int weight) {
        this.imageResId = imageResId;
        this.vehicle_name = name;
        this.weight="Weight : "+Integer.toString(weight)+" Kg.";
    }
}
