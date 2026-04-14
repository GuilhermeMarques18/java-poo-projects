package classe.animal;

import java.util.Scanner;

public class Concha{
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args){
        Animal animal = new Animal("", "");

        while(true){
            var linha = scanner.nextLine();
            System.out.println("$" + linha);

            var par = linha.split(" ");
            var cmd = par[0];

            if(cmd.equals("end")){
                break;
            }
            else if(cmd.equals("init")){
                animal = new Animal(par[1], par[2]);


            }

            else if(cmd.equals("show")){
                System.out.println(animal);


            }
            else if(cmd.equals("noise")){
                System.out.println(animal.makeSound());
            }
            else if(cmd.equals("grow")){
                var increment = Integer.parseInt(par[1]);
                animal.toAge(increment);

            }
            else {
                System.out.println("fail: comando invalido");
            }
        }
    }
}

