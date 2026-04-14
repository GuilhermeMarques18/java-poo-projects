package classe.animal;

public class Animal{

    private String species;
    private String sound;
    private int number;

    public Animal(String species, String sound){
        this.species = species;
        this.sound = sound;
    }

    public String makeSound(){
        if(this.number == 0){
            return "---";
        }
        if(this.number == 4){
            return "RIP";
        }
        return this.sound;
    }

    public void toAge(int value){
        if(this.number + value >=4){
            this.number = 4;
            System.out.println("warning: " + this.species + " morreu");
            return;
        }
        this.number +=value;
    }

    public String toString(){
        return this.species +":" + this.number + ":" + this.sound;
    }
}
