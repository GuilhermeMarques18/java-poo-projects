package interfaces.autenticaveis;

import java.util.*;

class Sistema {
    private UFC ufc;
    private Map<String, Autenticavel> usuarios;

    public Sistema() {
        ufc = new UFC();
        usuarios = new TreeMap<>();
    }

    public UFC getUFC() {
        return ufc;
    }


    public void addUsuario(String nome, String senha) {
        if (usuarios.containsKey(nome))
            throw new MsgException("fail: usuario ja existe");

        try {

            Funcionario f = ufc.getFuncionario(nome);


            if (f instanceof Ter) {
                throw new MsgException("fail: terc nao pode ser cadastrado no sistema");
            }


            Autenticavel u = (Autenticavel) f;
            u.setSenha(senha);
            usuarios.put(nome, u);

        } catch (MsgException e) {

            if (e.getMessage().contains("terc")) throw e;

            try {
                Aluno a = ufc.getAluno(nome);
                a.setSenha(senha);
                usuarios.put(nome, a);
            } catch (MsgException e2) {
                throw new MsgException("fail: " + nome + " nao encontrado");
            }
        }
    }


    public void rmUsuario(String nome) {
        if (!usuarios.containsKey(nome))
            throw new MsgException("fail: usuario " + nome + " nao encontrado");
        usuarios.remove(nome);
    }


    public void logar(String nome, String senha) {
        Autenticavel u = usuarios.get(nome);
        if (u == null)
            throw new MsgException("fail: usuario " + nome + " nao encontrado");
        u.logar(senha);
    }


    public void deslogar(String nome) {
        Autenticavel u = usuarios.get(nome);
        if (u == null)
            throw new MsgException("fail: usuario " + nome + " nao encontrado");
        u.deslogar();
    }


    public void deslogarTodos() {
        for (Autenticavel u : usuarios.values())
            u.setLogado(false);
    }


    public String showUser(String nome) {
        Autenticavel u = usuarios.get(nome);
        if (u == null)
            throw new MsgException("fail: usuario " + nome + " nao encontrado");

        return u.toString() + ":" + u.getSenha() + ":" + (u.getLogado() ? "online" : "offline");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Autenticavel u : usuarios.values()) {
            sb.append(u.toString())
                    .append(":")
                    .append(u.getSenha())
                    .append(":")
                    .append(u.getLogado() ? "online" : "offline")
                    .append("\n");
        }
        return sb.toString();
    }
}
