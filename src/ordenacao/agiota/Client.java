package ordenacao.agiota;



import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private int limite;
    private List<Operation>  operations;

    public Client(String name, int limite) {
        this.name = name;
        this.limite = limite;
        this.operations = new ArrayList<>();
    }

    public String getName() { return this.name;}
    public int getLimite() { return this.limite;}

    public List<Operation> getOperations() { return this.operations;}

    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public int getBalance(){
        int saldo = 0;
        for (Operation op : operations) {
            if (op.getLabel() == Label.GIVE){
                saldo += op.getValue();
            }
            else{
                saldo -= op.getValue();
            }

        }
        return saldo;
    }

    @Override
    public String toString() {
        String ss = this.name + " " + this.getBalance() + "/" + this.limite + "\n";
        for ( Operation oper : this.operations ) {
            ss += oper + "\n";
        }
        return ss;
    }

}

