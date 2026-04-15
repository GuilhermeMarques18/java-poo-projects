package interfaces.autenticaveis;

import java.util.*;

class UFC {
    private Map<String, Funcionario> funcionarios;
    private Map<String, Aluno> alunos;

    public UFC() {
        funcionarios = new TreeMap<>();
        alunos = new TreeMap<>();
    }

    public void addFuncionario(Funcionario f) {
        if (funcionarios.containsKey(f.getNome()))
            throw new MsgException("fail: funcionario ja existe");
        funcionarios.put(f.getNome(), f);
    }

    public Funcionario getFuncionario(String nome) {
        if (!funcionarios.containsKey(nome))
            throw new MsgException("fail: funcionario " + nome + " nao encontrado");
        return funcionarios.get(nome);
    }

    public void rmFuncionario(String nome) {
        if (!funcionarios.containsKey(nome))
            throw new MsgException("fail: funcionario " + nome + " nao encontrado");
        funcionarios.remove(nome);
    }

    public void addAluno(Aluno a) {
        if (alunos.containsKey(a.getNome()))
            throw new MsgException("fail: aluno ja existe");
        alunos.put(a.getNome(), a);
    }

    public Aluno getAluno(String nome) {
        if (!alunos.containsKey(nome))
            throw new MsgException("fail: aluno " + nome + " nao encontrado");
        return alunos.get(nome);
    }

    public void rmAluno(String nome) {
        if (!alunos.containsKey(nome))
            throw new MsgException("fail: aluno " + nome + " nao encontrado");
        alunos.remove(nome);
    }

    public void setBonus(int bonus) {
        int each = bonus / funcionarios.size();
        for (Funcionario f : funcionarios.values())
            f.setBonus(each);
    }

    @Override
    public String toString() {
        String s = "";
        for (Funcionario f : funcionarios.values())
            s += f + "\n";
        for (Aluno a : alunos.values())
            s += a + "\n";
        return s;
    }
}

