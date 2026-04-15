package array_listsecond.cinema;

public class Client{
    private String id;
    private int phone;

    public Client(String id, int phone){
        this.id=id;
        this.phone=phone;
    }

    public int getPhone(){
        return phone;
    }

    public void setPhone(int phone){
        this.phone=phone;
    }

    public String getId(){
        return id;
    }

    public void setId(String  id){
        this.id=id;
    }

    public String toString(){
        return phone + ":" + id;

    }
}
