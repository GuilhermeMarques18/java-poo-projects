Considere o seguinte formato de registro que deve ser usado em seu programa:

registro_aluno = {"Nome": Joao, "Matricula": 1, "Disciplina": FUP, "Nota": 8.5}

Usando a definição acima, crie um programa que possua uma função de leitura dos valores, lidos do usuário, para um registro de aluno e outra função que receba um registro de aluno e imprima todos os valores dos campos desse registro.

Seu programa deve então ler os valores do registro de um aluno e fazer uso da função de impressão para imprimir tais valores.

Exemplo de Entrada:

Joao
1
FUP
8.5

Exemplo de Saída:

Nome = Joao
Matrícula = 1
Disciplina = FUP
Nota = 8.5


Arquivos requeridos:

Input

import java.util.Scanner;

    //input
    static private Scanner scan = new Scanner(System.in);

    static public String input() {
        return scan.nextLine();
    }
    static public int inputInt() {
        return Integer.parseInt( scan.nextLine() );
    }
    static public float inputFloat() {
        return Float.parseFloat( scan.nextLine() );
    }
    static public double inputDouble() {
        return Double.parseDouble( scan.nextLine() );
    }

    //input split
    static public String[] inputParts() {
        return scan.nextLine().split(" ");
    }

    //inputNext (leitura termina ao detectar um espaço) (cuidado ao misturar nextLine com next)
    static public String inputNext() {
        return scan.next();
    }
    static public int inputNextInt() {
        return scan.nextInt();
    }
    static public float inputNextFloat() {
        return scan.nextFloat();
    }
    static public double inputNextDouble() {
        return scan.nextDouble();
    }
}

    class Out {
    public void println(String str) {
    System.out.println(str);
    }
    public void print(String str) {
    System.out.print(str);
    }
    public void printf(String str, Object... args) {
    System.out.printf(str, args);
    }
    }
    
    class Teste {
    static public Out out = new Out();
    }

Solver
class Solver {
public static void main (String[] args) {
// Teste.out.println("Teste");

        // IO.print("Insira um valor: ");
        // int valorInt = IO.inputInt();
        // IO.println( valorInt );
        // IO.printf( "Teste1 %d, Teste2 %d, Teste%d %d", 1, 2, valorInt, valorInt );
        // IO.println();
    }
}

