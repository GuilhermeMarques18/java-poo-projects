package ordenacao.porquinho;

import java.util.ArrayList;

public class Pig{
    private ArrayList<Item> itens;
    private ArrayList<Coin> coins;
    private int volumeMax;
    private boolean broken;

    public Pig(int volumeMax){
        this.volumeMax=volumeMax;
        this.broken=false;
        itens= new ArrayList<>();
        coins= new ArrayList<>();
    }

    public boolean addCoin(Coin coin){
        if(broken){
            throw new PigException();
        }
        if(getVolume() + coin.getVolume() > volumeMax){
            throw new PigFullException();
        }
        coins.add(coin);
        return true;
    }

    public boolean addItem(Item item){
        if(broken){
            throw new PigException();
        }
        if(getVolume()+item.getVolume()>volumeMax){
            throw new  PigFullException();
        }
        itens.add(item);
        return true;
    }

    public int getVolume(){
        if(broken){
            return 0;
        }
        int volume=0;
        for(Item item : itens){
            volume += item.getVolume();
        }
        for(Coin coin : coins){
            volume += coin.getVolume();
        }
        return volume;
    }

    public double getValue(){
        double value=0;
        for(Coin coin : coins){
            value += coin.getValue();
        }
        return value;
    }

    public boolean breakPig(){
        if(broken){
            throw new PigBrokenException();
        }
        broken=true;
        return true;
    }

    public Coin[] extractCoins(){
        if(!broken){
            throw new PigBreakException();
        }
        Coin[] extracted = coins.toArray(new Coin[0]);
        coins.clear();
        return extracted;
    }

    public Item[] extractItems(){
        if(!broken){
            throw new PigBreakException();
        }
        Item[] extract = itens.toArray(new Item[0]);
        itens.clear();
        return extract;
    }

    @Override
    public String toString() {
        String state = broken ? "broken" : "intact";

        return "state=" + state
                + " : coins=" + coins
                + " : items=" + itens
                + " : value=" + String.format("%.2f", getValue())
                + " : volume=" + getVolume() + "/" + volumeMax;
    }

}
