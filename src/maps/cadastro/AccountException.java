package maps.cadastro;

class AccountException extends RuntimeException{
    public AccountException(String message){
        super(message);
    }
}

class AccountValueInsufficient extends RuntimeException{
    public AccountValueInsufficient(){
        super("fail: saldo insuficiente");
    }

}

