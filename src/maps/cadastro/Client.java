package maps.cadastro;

import java.util.*;
import java.text.DecimalFormat;

public class Client {
    private String clientId;
    private ArrayList<Account> accounts;

    public Client( String clientId ) {
        this.clientId=clientId;
        accounts= new ArrayList<>();
    }

    public void addAccount( Account acc ) {
        accounts.add(acc);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public String getClientId() {
        return clientId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(clientId).append(" [");

        for(int i=0; i<accounts.size(); i++){
            sb.append(accounts.get(i).getAccId());
            if(i < accounts.size()- 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
