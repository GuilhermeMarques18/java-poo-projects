package classe.calculadora;

import java.util.*;
import java.text.DecimalFormat;

public class Solver{

    public static void main(String[] args){
        Calculadora calculo = null;
        Scanner scanner = new Scanner(System.in);

        while(true){
            var line=scanner.nextLine();
            System.out.println("$" + line);

            var par = line.split(" ");
            var cmd = par[0];

            if(cmd.equals("end")){
                break;
            }
            else if (cmd.equals("init")){
                int max=Integer.parseInt(par[1]);
                calculo=new Calculadora(max);
            }
            else if(cmd.equals("show")){
                System.out.println(calculo);
            }
            else if(cmd.equals("charge")){
                int valor = Integer.parseInt(par[1]);
                calculo.recarregar(valor);
            }
            else if(cmd.equals("sum")){
                int a=Integer.parseInt(par[1]);
                int b=Integer.parseInt(par[2]);
                calculo.somar(a, b);
            }
            else if(cmd.equals("div")){
                double num = Double.parseDouble(par[1]);
                double den = Double.parseDouble(par[2]);
                calculo.divisao(num,den);
            }
            else {
                System.out.println("fail: comando invalido");

            }
        }
    }
}