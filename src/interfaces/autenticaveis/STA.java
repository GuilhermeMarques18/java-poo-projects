package interfaces.autenticaveis;

class STA extends FuncionarioAutenticavel {
    private int nivel;

    public STA(String nome, int nivel) {
        super(nome);
        this.nivel = nivel;
        this.maxDiarias = 1;
    }

    @Override
    public int getSalario() {
        return 3000 + nivel * 300 + super.getSalario();
    }

    @Override
    public String toString() {
        return "sta:" + nome + ":" + nivel + ":" + getSalario();
    }
}

