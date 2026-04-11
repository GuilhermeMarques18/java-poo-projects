package registros_fup.nova_media;

import java.util.Scanner;

class IO {
    //print
    static public void println() {
        System.out.println();
    }
    static public void println(Object str) { //Object para também aceitar int, float, double, ...
        System.out.println(str);
    }
    static public void print(Object str) { //Object para também aceitar int, float, double, ...
        System.out.print(str);
    }
    static public void printf(String str, Object... args) {
        System.out.printf(str, args);
    }

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
