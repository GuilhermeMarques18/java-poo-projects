package modificadoresAcesso.tomagotchi;

public class Pet {
    private int energMax;
    private int cleanMax;
    private int energy;
    private int clean;
    private int age;
    private boolean alive;

    public Pet(int energMax, int cleanMax){
        this.energMax = energMax;
        this.energy=energMax;
        this.cleanMax= cleanMax;
        this.clean=cleanMax;
        this.age=0;
        this.alive= true;

    }

    public boolean checkAlive(){
        if(!alive){
            System.out.println("fail: pet esta morto");
            return false;
        }
        return true;
    }

    public void testDeath(){
        if(energy <= 0){
            alive=false;
            energy=0;
            System.out.println("fail: pet morreu de fraqueza");
        }
        else if(clean <= 0){
            alive = false;
            clean = 0;
            System.out.println("fail: pet morreu de sujeira");
        }
    }

    public void play(){
        if(!checkAlive()) return;
        energy-=2;
        clean -=3;
        age +=1;
        testDeath();
    }

    public void sleep(){
        if(!checkAlive())return;
        if(energy > energMax - 5){
            System.out.println("fail: nao esta com sono");
            return;
        }
        int splet= energMax-energy;
        age+=splet;
        energy=energMax;
    }


    public void shower(){;
        if(!checkAlive())return;
        energy-=3;
        clean=cleanMax;
        age+=2;
        testDeath();
    }


    public String toString() {
        return String.format("E:%d/%d, L:%d/%d, I:%d", energy, energMax, clean, cleanMax, age);
    }



}

