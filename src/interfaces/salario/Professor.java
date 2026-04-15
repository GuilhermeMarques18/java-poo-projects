package interfaces.salario;

class Professor extends Funcionario{
    private String classe;
    public Professor(String nome, String classe){
        super(nome);
        this.classe=classe;
        this.maxDiarias=2;
    }

    public String getClasse(){
        return classe;
    }

    @Override
    protected int getSalarioBase() {
        switch (classe) {
            case "A": return 3000;
            case "B": return 5000;
            case "C": return 7000;
            case "D": return 9000;
            case "E": return 11000;
            default: return 0;
        }
    }

    @Override
    public String toString() {
        return "prof:" + name + ":" + classe + ":"+ getSalario();
    }
}








































// class Professor extends Funcionario {
//     private String classe;

//     public Professor(String nome, String classe) {
//         super(nome);
//         this.classe = classe;
//         this.maxDiarias = 2;
//     }

//     @Override
//     protected int getSalarioBase() {
//         switch (classe) {
//             case "A": return 3000;
//             case "B": return 5000;
//             case "C": return 7000;
//             case "D": return 9000;
//             case "E": return 11000;
//             default: return 0;
//         }
//     }

//     @Override
//     public String toString() {
//         return "prof:" + nome + ":" + classe + ":"+ getSalario();
//     }
// }

