package array_list.lapiseira;

import java.util.ArrayList;

public class Pencil {
    private float thickness;
    private Lead tip;
    private ArrayList<Lead> barrel;

    public Pencil(float thickness) {
        this.thickness = thickness;
        this.barrel = new ArrayList<>();
        this.tip = null;
    }

    public boolean insert(Lead lead) {
        if (lead.getThickness() != this.thickness) {
            System.out.println("fail: calibre incompatível");
            return false;
        }
        barrel.add(lead);
        return true;
    }

    public boolean hasGrafite() {
        return tip != null;
    }

    public boolean pull() {
        if (tip != null) {
            System.out.println("fail: ja existe grafite no bico");
            return false;
        }
        if (barrel.isEmpty()) {
            System.out.println("fail: nao existe grafite no tambor");
            return false;
        }
        tip = barrel.remove(0);
        return true;
    }

    public void remove() {
        if (tip == null)
            return;
        tip = null;
    }

    public void writePage() {
        if (tip == null) {
            System.out.println("fail: nao existe grafite no bico");
            return;
        }

        int uso = tip.usagePer();
        if (tip.getSize() <= 10) {
            System.out.println("fail: tamanho insuficiente");
            tip = null;
            return;
        }

        if (tip.getSize() - uso < 10) {
            System.out.println("fail: folha incompleta");
            tip.setSize(10);
            return;
        } else {
            tip.setSize(tip.getSize() - uso);
            return;
        }


    }

    public String toString() {
        String bico = (tip == null) ? "[]" : "[" + tip + "]";
        StringBuilder tamborStr = new StringBuilder("<");
        for (Lead l : barrel) {
            tamborStr.append("[").append(l).append("]");
        }
        tamborStr.append(">");
        return "calibre: " + thickness + ", bico: " + bico + ", tambor: " + tamborStr;
    }
}

