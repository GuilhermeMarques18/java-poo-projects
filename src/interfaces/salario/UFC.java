package interfaces.salario;

import java.util.*;


class UFC{
    private Map<String, Funcionario> funcionarios = new TreeMap<>();


    public void addFuncionario(Funcionario funcionario) throws MsgException{
        String f= funcionario.getNome();
        if(funcionarios.containsKey(f)){
            throw new MsgException("fail:funcionario ja existe");
        }
        funcionarios.put(f, funcionario);
    }

    public Funcionario getFuncionario(String nome) throws MsgException {
        if (!funcionarios.containsKey(nome)) {
            throw new MsgException("fail: funcionario nao existe");
        }
        return funcionarios.get(nome);
    }

    public void rmFuncionario(String name) throws MsgException{
        if(funcionarios.containsKey(name)){
            funcionarios.remove(name);
            return;
        }

        throw new MsgException("fail: funcionario nao existe");
    }

    public void setBonus(int bonus) throws MsgException {
        if(this.funcionarios.size() == 0){
            throw new MsgException("fail: sem funcionarios");
        }
        int quantidade= funcionarios.size();
        int valor = bonus/quantidade;

        for(Funcionario f : funcionarios.values()){
            f.setBonus(valor);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(Funcionario f : funcionarios.values()){
            sb.append(f).append("\n");
        }
        return sb.toString();
    }
}







































// import java.util.Map;
// import java.util.TreeMap;
// class UFC {
//     private Map<String, Funcionario> funcionarios = new TreeMap<>();



//     @Override
//     public String toString() {
//         StringBuilder sb = new StringBuilder();
//         for(Funcionario f : funcionarios.values()){
//             sb.append(f).append("\n");

//         }
//         return sb.toString();
//     }

//     public Funcionario getFuncionario(String nome) {
//         if(funcionarios.containsKey(nome)){
//             Funcionario v = funcionarios.get(nome);
//             return v;
//         }

//         throw new MsgException("fail: funcionario nao existe");

//     }



//     public void addFuncionario(Funcionario funcionario) {
//         String  f = funcionario.getNome();
//         if(funcionarios.containsKey(f)){
//             throw new MsgException("fail: funcionario ja existe");
//         }
//         funcionarios.put(f, funcionario);
//     }

//     public void rmFuncionario(String nome) {
//         if(funcionarios.containsKey(nome)){
//             funcionarios.remove(nome);
//             return;
//         }
//         throw new MsgException("fail: funcionario nao existe");
//     }

//     //reparte o bonus para todos os funcionarios
//     public void setBonus(int bonus) {
//         if ( this.funcionarios.size() == 0 ) {
//             throw new MsgException("fail: sem funcionarios");
//         }
//         int quantidade = funcionarios.size();
//         int bom = bonus/quantidade;

//         for(Funcionario f : funcionarios.values()){
//             f.setBonus(bom);
//         }

//     }



// }
