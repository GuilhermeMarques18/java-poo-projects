package maps.cadastro;

public  class SavingsAccount extends Account{
    private static final double  monthlyInterest = 100.0;

    public SavingsAccount(int accId, String clientId){
        super(accId, clientId, "CP");
    }

    public void updateMonthly(){
        double pix = balance/monthlyInterest;
        balance+=pix;
    }

}