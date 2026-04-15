package maps.cadastro;

import java.util.*;

class Agency {
    private Map<Integer, Account> accounts;
    private Map<String, Client> clients;
    private int nextAccountId;

    public Agency() {
        this.accounts = new LinkedHashMap<>();
        this.clients = new LinkedHashMap<>();
        this.nextAccountId = 0;
    }

    public void addClient(String clientId) {
        Client client = new Client(clientId);
        clients.put(clientId, client);

        Account cc = new CheckingAccount(nextAccountId++, clientId);
        accounts.put(cc.getAccId(), cc);
        client.addAccount(cc);

        Account cp = new SavingsAccount(nextAccountId++, clientId);
        accounts.put(cp.getAccId(), cp);
        client.addAccount(cp);
    }

    private Account getAccount(int accountId) {
        Account acc = accounts.get(accountId);
        if (acc == null) {
            throw new AccountException("fail: conta nao encontrada");
        }
        return acc;
    }

    public void deposit(int accId, double value) {
        Account acc = getAccount(accId);
        acc.deposit(value);
    }

    public void withdraw(int accId, double value) {
        Account acc = getAccount(accId);
        acc.withdraw(value);
    }

    public void transfer(int fromAccId, int toAccId, double value) {
        Account from = getAccount(fromAccId);
        Account to = getAccount(toAccId);
        from.transfer(to, value);
    }

    public void updateMonthly() {
        for (Account acc : accounts.values()) {
            acc.updateMonthly();
        }
    }

    @Override
    public String toString() {
        String s = "- Clients\n";
        for (Client client : clients.values()) {
            s += client + "\n";
        }
        s += "- Accounts\n";
        for (Account acc : accounts.values()) {
            s += acc + "\n";
        }
        return s;
    }
}

