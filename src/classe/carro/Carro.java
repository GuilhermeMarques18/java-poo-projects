package classe.carro;

public class Carro{
    public int gasolina;
    public int gasolinaMax;
    public int km;
    public int passageiros;
    public int passageirosMax;
    public int distancia;

    public Carro() {
        this.gasolina=0;
        this.km=0;
        this.passageiros=0;
        this.passageirosMax = 2;
        this.gasolinaMax = 100;
    }
    public void entrar(){
        if(passageiros >= passageirosMax){
            System.out.println("fail: limite de pessoas atingido");
            return;

        }
        passageiros +=1;
    }
    public void sair(){
        if(passageiros <=0){
            System.out.println("fail: nao ha ninguem no carro");
            return;
        }
        passageiros -=1;
    }


    public void dirigir(int distancia){

        if(passageiros==0){
            System.out.println("fail: nao ha ninguem no carro");
            return;
        }
        if(gasolina <=0){
            System.out.println("fail: tanque vazio");
            return;
        }
        if(gasolina < distancia){
            System.out.println("fail: tanque vazio apos andar " + gasolina + " km");
            km+=gasolina;
            gasolina=0;
            return;
        }
        km+=distancia;
        gasolina -=distancia;
    }

    public void abastecer(int value){
        if(gasolina + value > gasolinaMax){
            gasolina = gasolinaMax;
            return;
        }
        gasolina += value;
    }
    public String toString(){
        return "pass: " + passageiros + "," + " gas: " + gasolina + ","+ " km: " + km;
    }

}
