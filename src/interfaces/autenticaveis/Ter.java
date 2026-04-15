package interfaces.autenticaveis;

public class Ter extends Funcionario {
    private int horas;
    private boolean insalubre;

    public Ter(String nome, int horas, boolean insalubre) {
        super(nome);
        this.horas = horas;
        this.insalubre = insalubre;
        this.maxDiarias = 0;
    }

    @Override
    public int getSalario() {
        int base = (horas * 4) + (insalubre ? 500 : 0);
        return base + super.getSalario();
    }

    @Override
    public void addDiaria() {
        throw new MsgException("fail: terc nao pode receber diaria");
    }

    @Override
    public String toString() {
        return "ter:" + nome + ":" + horas + ":" +
                (insalubre ? "sim" : "nao") + ":" + getSalario();
    }
}
