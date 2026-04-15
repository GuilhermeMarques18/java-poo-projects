package array_list.pula_pula;

public class Kid{
    private int age;
    private String name;

    public Kid(String name, int age){
        this.name=name;
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String toString(){
        return  String.format("%s:%d", name, age);
    }




}
