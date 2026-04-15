package ordenacao.agiota;


import java.util.ArrayList;

public class Agiota {
    private ArrayList<Client> aliveList;
    private ArrayList<Client> deathList;
    private ArrayList<Operation> aliveOper;
    private ArrayList<Operation> deathOper;
    private int nextOpId;


    public Agiota() {
        aliveList = new ArrayList<>();
        deathList = new ArrayList<>() ;
        aliveOper = new ArrayList<>();
        deathOper = new ArrayList<>();
        nextOpId = 0;
    }

    public int searchClient(String name) {
        for (int i = 0; i < aliveList.size(); i++) {
            if (aliveList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Client getClient(String name) {
        if(searchClient(name) >= 0) {
            return aliveList.get(searchClient(name));
        }
        System.out.println("fail: cliente nao existe");
        return null;
    }

    public void addClient( String name, int limite) throws  ClienteException {
        if (searchClient(name) >= 0) {
            throw new ClienteException("fail: cliente ja existe");
        }
        aliveList.add(new Client(name, limite));
    }

    public void pushOperation(Client client, Label label, int value)throws ClienteException {
        Operation op = new Operation(nextOpId++, client.getName(), label, value);

        client.addOperation(op);
        aliveOper.add(op);
    }

    public void give(String name, int value) throws ClienteInexistenteException, ClienteException {
        if (value < 0) {
            return;
        }

        Client client = getClient(name);

        pushOperation(client, Label.GIVE, value);
    }

    public void take(String name, int value) throws ClienteInexistenteException, ClienteException {
        if (value < 0) {
            System.out.println("fail: valor nao pode ser negativo ");
            return;
        }
        Client client = getClient(name);
        pushOperation(client, Label.TAKE, value);
    }

    public void plus() throws Exception {
        ArrayList<Client> toKill = new ArrayList<>();

        for (Client client : aliveList) {
            int balance = client.getBalance();

            if (balance < 0) {
                int debt = -balance;
                int interest = (int) Math.ceil(debt * 0.1);

                pushOperation(client, Label.PLUS, interest);

                if (-client.getBalance() > client.getLimite()) {
                    toKill.add(client);
                }
            }
        }

        for (Client client : toKill) {
            kill(client.getName());
        }
    }

    public void kill(String name) throws ClienteInexistenteException {
        int idx = searchClient(name);
        if (idx < 0) {
            throw new ClienteInexistenteException();
        }

        Client client = aliveList.remove(idx);
        deathList.add(client);

        ArrayList<Operation> toRemove = new ArrayList<>();

        for (Operation op : aliveOper) {
            if (op.getName().equals(name)) {
                deathOper.add(op);
                toRemove.add(op);
            }
        }

        aliveOper.removeAll(toRemove);
    }



    @Override
    public String toString() {
        String ss = "";
        for ( Client client : this.aliveList ) {
            ss += ":) " + client.getName() + " " + client.getBalance() + "/" + client.getLimite() + "\n";
        }
        for ( Operation oper : this.aliveOper ) {
            ss += "+ " + oper + "\n";
        }
        for ( Client client : this.deathList ) {
            ss += ":( " + client.getName() + " " + client.getBalance() + "/" + client.getLimite() + "\n";
        }
        for ( Operation oper : this.deathOper ) {
            ss += "- " + oper + "\n";
        }
        return ss;
    }
}

