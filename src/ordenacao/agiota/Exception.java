package ordenacao.agiota;

class ClienteException extends Exception {
    public ClienteException(String msg) {
        super(msg);
    }
}

class ClienteInexistenteException extends Exception {
    public ClienteInexistenteException() {
        super("fail: cliente nao existe");
    }
}
