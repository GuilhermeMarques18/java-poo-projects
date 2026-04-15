package array_listsecond.junkfood;

import java.util.ArrayList;


public class Machine {
    private ArrayList<Slot> slots;
    private double saldo;

    public Machine() {
        slots = new ArrayList<>();
        saldo = 0.0;
    }

    public void init(int n) {
        slots = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            slots.add(new Slot());
        }
    }

    public Slot getSlot(int index) {
        if (index >= 0 && index < slots.size()) {
            return slots.get(index);
        }
        return null;
    }

    public void setSlot(int indice, String name, int qtd, double price) {
        if (indice < 0 || indice >= slots.size()) {
            System.out.println("fail: indice nao existe");
            return;
        }
        Slot slot = slots.get(indice);
        slot.setName(name);
        slot.setQtd(qtd);
        slot.setPreco(price);
    }

    public void limpar(int indice) {
        if (indice < 0 || indice >= slots.size()) {
            System.out.println("fail: indice nao existe");
            return;
        }
        Slot slot = slots.get(indice);
        slot.setName("empty");
        slot.setQtd(0);
        slot.setPreco(0.0);
    }

    public void inserirDinheiro(double value) {
        saldo += value;
    }

    public double pedirTroco() {
        double troco = saldo;
        saldo = 0.0;
        System.out.printf("voce recebeu %.2f RS\n", troco);
        return troco;
    }

    public void comprar(int ind) {
        if (ind < 0 || ind >= slots.size()) {
            System.out.println("fail: indice nao existe");
            return;
        }
        Slot slot = slots.get(ind);
        if (slot.getQtd() == 0) {
            System.out.println("fail: espiral sem produtos");
            return;
        }
        if (saldo < slot.getPreco()) {
            System.out.println("fail: saldo insuficiente");
            return;
        }
        slot.setQtd(slot.getQtd() - 1);
        saldo -= slot.getPreco();
        System.out.printf("voce comprou um %s\n", slot.getName());
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("saldo: %.2f\n", saldo));
        for (int i = 0; i < slots.size(); i++) {
            sb.append(i).append(" ").append(slots.get(i));
            if (i < slots.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}

