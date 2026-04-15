package agregacao_simples.motoca;

public class Motobike{
    private int potencia;
    private int time;
    private Person pessoa;


    public Motobike(){
        this.potencia=1;
        this.time=0;
        this.pessoa=null;
    }

    public boolean insert(Person p){
        if(this.pessoa!=null){
            System.out.println("fail: busy motorcycle");
            return false;
        }
        this.pessoa=p;
        return true;
    }

    public Person remove(){

        if(this.pessoa ==null){
            System.out.println("fail: empty motorcycle");
            return null;
        }
        Person p = this.pessoa;
        this.pessoa = null;
        return p;
    }

    public void buyTime(int time){
        this.time+=time;
    }

    public void drive(int tempo){
        if(this.time <=0){
            System.out.println("fail: buy time first");
            return;
        }
        if(this.pessoa == null){
            System.out.println("fail: empty motorcycle");
            return;
        }
        if(this.pessoa.getAge()> 10){
            System.out.println("fail: too old to drive");
            return;
        }
        if(tempo > this.time){
            System.out.printf("fail: time finished after %d minutes\n", this.time);
            this.time=0;
        }else{
            this.time -=tempo;
        }
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }


    public String honk(){
        StringBuilder sb = new StringBuilder();
        sb.append("P");
        for(int i=0; i< potencia; i++){
            sb.append("e");
        }
        sb.append("m");
        return sb.toString();

    }
    @Override
    public String toString(){
        String pesInfo = (pessoa==null) ? "empty" : pessoa.toString();
        return String.format("power:%d, time:%d, person:(%s)", potencia, time, pesInfo);
    }
}
