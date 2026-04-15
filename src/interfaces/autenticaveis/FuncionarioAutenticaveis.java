package interfaces.autenticaveis;

class FuncionarioAutenticavel extends Funcionario implements Autenticavel {
    protected String senha;
    protected boolean logado;

    public FuncionarioAutenticavel(String nome) {
        super(nome);
        this.senha = "indefinida";
        this.logado = false;
    }

    public void logar(String senha) {
        if (!this.senha.equals(senha))
            throw new MsgException("fail: senha invalida");
        this.logado = true;
    }

    public void deslogar() {
        this.logado = false;
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
}

