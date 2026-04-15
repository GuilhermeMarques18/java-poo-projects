package array_list.lapiseira;

public class Lead{
    private float thickness;
    private String hardness;
    private int size;

    public Lead(float thickness, String hardness, int size){
        this.thickness=thickness;
        this.hardness=hardness;
        this.size=size;
    }

    public int usagePer(){
        switch(hardness){
            case "HB":return 1;
            case "2B":return 2;
            case "4B": return 4;
            case "6B": return 6;
            default: return 1;
        }
    }

    public String toString(){
        return thickness + ":" + hardness + ":" + size;
    }

    public float getThickness(){
        return thickness;
    }

    public void setThickness(float thickness){
        this.thickness=thickness;
    }

    public String getHardness(){
        return hardness;
    }

    public void setHardness(String hardness){
        this.hardness=hardness;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size=size;
    }



}
