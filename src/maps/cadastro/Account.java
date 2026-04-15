package maps.cadastro;

import java.text.DecimalFormat;
abstract class Account {
    protected double balance;
    private static int nextAccountId = 0;
    protected int accId;
    protected String clientId;
    protected String typeId;

    public Account( int accId, String clientId, String typeId ) {
        this.accId=accId;
        this.clientId=clientId;
        this.typeId=typeId;
        this.balance=0;
    }

    public void deposit( double value ) {
        balance+=value;

    }


    public void withdraw( double value ) {
        if(balance<value){
            throw new AccountValueInsufficient();
        }
        this.balance-=value;
    }

    public void transfer( Account other, double value ) {
        if(this.balance < value){
            throw new AccountValueInsufficient();
        }
        this.withdraw(value);
        other.deposit(value);

    }

    @Override
    public String toString() {
        DecimalFormat d = new DecimalFormat("0.00");
        //double x = 4.3; System.out.println( d.format(x) ); //4.30
        return accId + ":" + clientId + ":" + d.format(balance) + ":" + typeId;

    }

    public double getBalance() {
        return balance;

    }
    public int getAccId() {
        return accId;
    }
    public String getClientId() {
        return clientId;
    }
    public String getTypeId() {
        return  typeId;
    }

    public abstract void updateMonthly();
}
