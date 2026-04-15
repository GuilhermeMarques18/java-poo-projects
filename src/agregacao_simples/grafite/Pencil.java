package agregacao_simples.grafite;

public class Pencil {
    private float thickness;
    private Lead tip;

    public Pencil(float thickness) {
        this.thickness = thickness;
        this.tip = null;
    }

    public boolean hasGrafite() {
        return tip != null;
    }

    public void insert(Lead grafite) {
        if (hasGrafite()) {
            System.out.println("fail: ja existe grafite");
            return;
        }
        if (grafite.getThickness() != this.thickness) {
            System.out.println("fail: calibre incompativel");
            return;
        }
        this.tip = grafite;
    }

    public Lead remove() {
        if (!hasGrafite()) {
            System.out.println("fail: nao existe grafite");
            return null;
        }
        Lead temp = tip;
        tip = null;
        return temp;
    }

    public void writePage() {
        if (!hasGrafite()) {
            System.out.println("fail: nao existe grafite");
            return;
        }
        int desgaste = tip.usagePerSheet();
        if (tip.getSize() <= 10) {
            System.out.println("fail: tamanho insuficiente");
            return;
        }

        int novoTamanho = tip.getSize() - desgaste;
        if (novoTamanho < 10) {
            tip.setSize(10);
            System.out.println("fail: folha incompleta");
        } else {
            tip.setSize(novoTamanho);
        }
    }

    @Override
    public String toString() {
        if (hasGrafite()) {
            return "calibre: "  + thickness + ", grafite: [" + tip.toString() + "]";
        } else {
            return "calibre: " + thickness + ", grafite: null";
        }
    }
}

