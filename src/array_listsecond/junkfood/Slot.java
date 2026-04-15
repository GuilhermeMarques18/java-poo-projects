package array_listsecond.junkfood;


public class Slot {
    private String name;
    private int qtd;
    private double preco;

    public Slot() {
        this.name = "empty";
        this.qtd = 0;
        this.preco = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return String.format("[%8s : %d U : %.2f RS]", name, qtd, preco);
    }
}


