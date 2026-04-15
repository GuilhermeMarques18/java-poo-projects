package interfaces.salario;

abstract class Funcionario{
    protected int bonus;
    protected int diarias;
    protected int maxDiarias;
    protected String name;

    public Funcionario(String name){
        this.name=name;
    }

    public void addDiaria() throws MsgException{
        if(diarias >= maxDiarias)
            throw new MsgException("fail: limite de diarias atingido");
        diarias++;

    }

    public String getNome(){
        return name;
    }

    public int  getSalario(){
        return getSalarioBase() + bonus + diarias * 100;
    }

    protected abstract int getSalarioBase();

    public void setBonus(int bonus){
        this.bonus=bonus;
    }
}













































// abstract class Funcionario {
//     protected String nome;
//     protected int bonus = 0;
//     protected int diarias = 0;
//     protected int maxDiarias = 0;

//     public Funcionario(String nome) {
//         this.nome = nome;
//     }

//     public void setBonus(int bonus) {
//         this.bonus = bonus;
//     }

//     public String getNome(){
//         return nome;
//     }

//     public void addDiaria() {
//         if (diarias >= maxDiarias)
//             throw new MsgException("fail: limite de diarias atingido");
//         diarias++;
//     }

//     public int getSalario() {
//         return getSalarioBase() + bonus + diarias * 100;
//     }

//     protected abstract int getSalarioBase();
// }

