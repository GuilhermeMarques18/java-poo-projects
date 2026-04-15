package array_listsecond.junkfood;

public class Solver {
    public static void main(String[] args) {
        Machine machine = new Machine();

        while (true) {
            String[] line = IO.inputPartsPrintingLine();

            if      (line[0].equals("end")     ) { break; }
            else if (line[0].equals("init")    ) { machine.init(Integer.parseInt(line[1])); }
            else if (line[0].equals("show")    ) { IO.println(machine.toString()); }
            else if (line[0].equals("set")     ) { machine.setSlot(Integer.parseInt(line[1]), line[2], Integer.parseInt(line[3]), Double.parseDouble(line[4])); }
            else if (line[0].equals("limpar")  ) { machine.limpar(Integer.parseInt(line[1])); }
            else if (line[0].equals("dinheiro")) { machine.inserirDinheiro(Double.parseDouble(line[1])); }
            else if (line[0].equals("troco")   ) { machine.pedirTroco(); }
            else if (line[0].equals("comprar") ) { machine.comprar(Integer.parseInt(line[1])); }
            else                                 { IO.println("fail: comando invalido"); }
        }
    }
}

