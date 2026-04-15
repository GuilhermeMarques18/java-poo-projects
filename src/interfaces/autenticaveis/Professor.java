package interfaces.autenticaveis;

public class Professor extends FuncionarioAutenticavel {
    private String classe;

    public Professor(String nome, String classe) {
        super(nome);
        this.classe = classe;
        this.maxDiarias = 2;
    }

    public int getSalarioBase() {
        switch (classe) {
            case "A": return 3000;
            case "B": return 5000;
            case "C": return 7000;
            case "D": return 9000;
            case "E": return 11000;
        }
        return 0;
    }

    @Override
    public int getSalario() {
        return getSalarioBase() + super.getSalario();
    }

    @Override
    public String toString() {
        return "prof:" + nome + ":" + classe + ":" + getSalario();
    }
}

