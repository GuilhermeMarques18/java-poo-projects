package interfaces.autenticaveis;

abstract class Funcionario {
    protected String nome;
    protected int bonus;
    protected int diarias;
    protected int maxDiarias;

    public Funcionario(String nome) {
        this.nome = nome;
        this.bonus = 0;
        this.diarias = 0;
        this.maxDiarias = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void addDiaria() {
        if (this.diarias >= this.maxDiarias)
            throw new MsgException("fail: limite de diarias atingido");
        this.diarias++;
    }

    public int getSalario() {
        return bonus + diarias * 100;
    }
}

