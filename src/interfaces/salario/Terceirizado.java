package interfaces.salario;

class Terceirizado extends Funcionario {
    private int horas;
    private boolean isSalubre;

    public Terceirizado(String nome, int horas, boolean isSalubre) {
        super(nome);
        this.horas = horas;
        this.isSalubre = isSalubre;
        this.maxDiarias = 0;
    }

    @Override
    public void addDiaria() throws MsgException {
        throw new MsgException("fail: terc nao pode receber diaria");
    }

    @Override
    protected int getSalarioBase() {
        return 4 * horas + (isSalubre ? 500 : 0);
    }

    @Override
    public String toString() {
        return "ter:" + name + ":" + horas + ":" + (isSalubre ? "sim" : "nao") + ":" + getSalario();
    }
}

