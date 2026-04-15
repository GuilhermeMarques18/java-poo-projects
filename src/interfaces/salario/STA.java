package interfaces.salario;

class STA extends Funcionario {
    protected int nivel;


    public STA(String nome, int nivel) {
        super(nome);
        this.nivel=nivel;
        this.maxDiarias=1;
    }

    public int getNivel() {
        return nivel;
    }


    @Override
    public int getSalarioBase() {
        int salario = 3000 + 300 * nivel;
        return salario;
    }

    @Override
    public String toString() {
        return "sta" + ":" + name + ":" + nivel + ":" +getSalario();
    }
}
