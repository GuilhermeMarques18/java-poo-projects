package maps.cofre;

import java.text.DecimalFormat;
public class Item implements Valuable{
    private String label;
    private double value;
    private int volume;

    public Item(String label, int volume, double value){
        this.label=label;
        this.volume=volume;
        this.value=value;
    }

    public String getLabel(){
        return label;
    }

    public double getValue(){
        return value;
    }

    public int getVolume(){
        return volume;
    }

    public void setLabel(String label){
        this.label=label;
    }

    public void setVolume(int volume){
        this.volume=volume;
    }

    public String toString(){
        DecimalFormat d = new DecimalFormat("0.00");
        return label + ":" + d.format(value) + ":" + volume;
    }
}
