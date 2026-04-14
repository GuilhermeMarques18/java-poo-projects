package classe.carro;

import java.util.*;


public class Shell {
    public static void main(String[] args){
        Carro carro = new Carro();
        Scanner scanner= new Scanner(System.in);
        while(true){
            var line = scanner.nextLine();
            System.out.println("$" + line);

            var par = line.split(" ");
            var cmd = par[0];

            if(cmd.equals("end")){
                break;

            }
            else if(cmd.equals("show")){
                System.out.println(carro);
            }
            else if(cmd.equals("enter")){
                carro.entrar();
            }
            else if(cmd.equals("leave")){
                carro.sair();
            }
            else if(cmd.equals("fuel")){
                int increment = Integer.parseInt(par[1]);
                carro.abastecer(increment);

            }
            else if(cmd.equals("drive")){
                int distance= Integer.parseInt(par[1]);
                carro.dirigir(distance);
            }
            else{
                System.out.println("fail: comando invalidado");
            }
        }
    }
}
