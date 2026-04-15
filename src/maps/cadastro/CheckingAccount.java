package maps.cadastro;

public class CheckingAccount extends Account{
    private static final  double monthlyFee = 20.0;

    public CheckingAccount(int accId, String clientId){
        super(accId, clientId, "CC");
    }

    public void updateMonthly(){
        balance -= monthlyFee;
    }


}
