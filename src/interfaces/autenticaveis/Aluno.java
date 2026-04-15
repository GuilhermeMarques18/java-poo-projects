package interfaces.autenticaveis;

class Aluno implements Autenticavel {
    private String nome;
    private String curso;
    private int bolsa;
    private String senha;
    private boolean logado;

    public Aluno(String nome, String curso, int bolsa) {
        this.nome = nome;
        this.curso = curso;
        this.bolsa = bolsa;
        this.senha = "indefinida";
        this.logado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public boolean getLogado() {
        return logado;
    }

    public void logar(String senha) {
        if (!this.senha.equals(senha))
            throw new MsgException("fail: senha invalida");
        this.logado = true;
    }

    public void deslogar() {
        this.logado = false;
    }

    @Override
    public String toString() {
        return "alu:" + nome + ":" + curso + ":" + bolsa;
    }
}

