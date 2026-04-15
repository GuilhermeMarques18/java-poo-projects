package ordenacao.porquinho;

class PigException extends RuntimeException{
    public PigException(){
        super("fail: the pig is broken");
    }
}

class PigFullException extends RuntimeException{
    public PigFullException(){
        super("fail: the pig is full");
    }
}

class PigBrokenException extends RuntimeException{
    public PigBrokenException(){
        super("fail: the pig is already broken");
    }
}

class PigBreakException extends RuntimeException{
    public PigBreakException(){
        super("fail: you must break the pig first");
    }
}
