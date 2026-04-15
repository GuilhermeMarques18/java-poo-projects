package maps.cofre;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Pig{
    private boolean broken;
    private ArrayList<Valuable> valuables;
    private int volumeMax;


    public Pig(int volumeMax){
        this.volumeMax=volumeMax;
        this.broken=false;
        this.valuables = new ArrayList<>();
    }

    public boolean addValuable(Valuable valuable){
        if(this.broken){
            throw new PigBroken();
        }

        int volume = 0;
        for (Valuable v : valuables) {
            volume += v.getVolume();
        }

        int vd = volume + valuable.getVolume();

        if(vd> volumeMax){
            throw new PigException("fail: the pig is full");
        }


        valuables.add(valuable);
        return true;
    }

    public boolean breakPig(){
        this.broken=true;
        return true;
    }

    public List<Coin> getCoins(){
        if(!this.broken){
            throw new  PigException("fail: you must break the pig first");
        }
        List<Coin> coins = new ArrayList<>();
        Iterator<Valuable> it = valuables.iterator();
        while(it.hasNext()){
            Valuable v = it.next();
            if(v instanceof Coin){
                coins.add((Coin) v);
                it.remove();
            }
        }
        return coins;

    }

    public List<Item> getItems(){
        if(!this.broken){
            throw new PigException("fail: you must break the pig first");
        }
        List<Item> itens = new ArrayList<>();
        Iterator<Valuable> it = valuables.iterator();
        while(it.hasNext()){
            Valuable v = it.next();
            if(v instanceof Item){
                itens.add((Item) v);
                it.remove();
            }
        }
        return itens;
    }

    public double calcValue(){
        double  valor=0;
        for(Valuable v : valuables){
            valor+=v.getValue();
        }
        return valor;
    }

    public int getVolume(){
        int volume=0;
        for(Valuable v : valuables){
            volume+=v.getVolume();
        }
        return volume;
    }

    public int getVolumeMax(){
        return volumeMax;
    }

    public boolean isBroken(){
        return broken;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < valuables.size(); i++) {
            sb.append(valuables.get(i));
            if (i < valuables.size() - 1)
                sb.append(", ");
        }
        sb.append("]");

        sb.append(" : ");
        sb.append(String.format("%.2f$", calcValue()));

        sb.append(" : ");
        sb.append(broken ? 0 : getVolume());
        sb.append("/").append(volumeMax);

        sb.append(" : ");
        sb.append(broken ? "broken" : "intact");

        return sb.toString();
    }


}