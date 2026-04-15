package classe.calculadora;

public class Calculadora{
    private double display;
    private int battery;
    private int batteryMax;


    public Calculadora( int batteryMax){
        this.display=0.0;
        this.battery=0;
        this.batteryMax = batteryMax;

    }


    public void recarregar(int valor){
        this.battery+=valor;
        if(this.battery >batteryMax){
            this.battery=batteryMax;
        }

    }

    public void somar(int a, int b){
        if(battery==0){
            System.out.println("fail: bateria insuficiente");
            return;
        }
        display=a+b;
        battery --;
    }

    public void divisao(double a, double b){
        if(battery<=0){
            System.out.println("fail: bateria insuficiente");
            return;
        }
        if(b==0){
            System.out.println("fail: divisao por zero");
            battery --;
            return;
        }
        display= a/b;
        battery --;
    }

    public String  toString(){
        return String.format("display = %.2f, battery = %d", display, battery);

    }

}