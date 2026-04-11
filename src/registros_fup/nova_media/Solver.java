package registros_fup.nova_media;

import java.util.Scanner;

class Solver{

    String aluno;
    double nota1;
    double nota2;
    double nota3;

    public static void main(String[] args){
        calcular();
    }

    public static void calcular(){
        Scanner mat = new Scanner(System.in);

        String aluno= mat.nextLine();
        double nota1= mat.nextDouble();
        double nota2= mat.nextDouble();
        double nota3= mat.nextDouble();

        double resultado = (nota1+nota2+nota3)/3;

        System.out.printf("%.2f\n", resultado);

        mat.close();
    }
}
