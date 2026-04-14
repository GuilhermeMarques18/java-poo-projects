package classe.tomagotchi;

import  java.util.*;

public class Shell{

    public static void main(String[] args){
        Pet pet= null;
        Scanner scanner = new Scanner(System.in);
        while(true){
            var line=scanner.nextLine();
            System.out.println("$" + line);

            var par = line.split(" ");
            var cmd = par[0];

            if(cmd.equals("end")){
                break;
            }
            else if(cmd.equals("init")){
                int increment = Integer.parseInt(par[1]);
                int value = Integer.parseInt(par[2]);
                pet=new Pet(increment, value);

            }
            else if(cmd.equals("play")){
                if(pet !=null)pet.play();
            }
            else if(cmd.equals("sleep")){
                if(pet !=null)pet.sleep();
            }
            else if(cmd.equals("shower")){
                if(pet !=null)pet.shower();
            }
            else if(cmd.equals("show")){
                if(pet !=null)System.out.println(pet);
            }
            else{
                System.out.println("fail: comando invalido");
            }
        }
    }
}