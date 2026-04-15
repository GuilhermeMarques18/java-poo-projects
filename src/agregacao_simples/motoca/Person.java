package agregacao_simples.motoca;

public class Person{
    private int age;
    private String name;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String toString() {
        return String.format("%s:%d", name, age);
    }

}
