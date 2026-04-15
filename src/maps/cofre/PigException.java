package maps.cofre;

class PigException extends  RuntimeException{
    public PigException(String message){
        super(message);
    }
}
class PigBroken extends RuntimeException{
    public PigBroken(){
        super("fail: the pig is broken");
    }
}

