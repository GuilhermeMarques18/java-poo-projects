package ordenacao.porquinho;

public class Coin{
    private double value;
    private int volume;
    private String label;

    public Coin(double value, int volume, String label){
        this.value=value;
        this.volume=volume;
        this.label=label;
    }

    public static final Coin C10 = new Coin(0.10, 1, "C10");
    public static final Coin C25 = new Coin(0.25, 2, "C25");
    public static final Coin C50 = new Coin(0.50, 3, "C50");
    public static final Coin C100 = new Coin(1.0, 4, "C100");

    public double getValue(){
        return value;
    }

    public int getVolume(){
        return volume;
    }

    public String getLabel(){
        return label;
    }
    public static Coin fromValue(int value) {
        switch (value) {
            case 10:  return C10;
            case 25:  return C25;
            case 50:  return C50;
            case 100: return C100;
            default:  return null;
        }
    }


    public String toString(){
        String result = String.format("%.2f:%d", value, volume);
        return result;
    }
}

