package array_list.pula_pula;

import java.util.ArrayList;

public class Trampoline {
    private ArrayList<Kid> waiting;
    private ArrayList<Kid> trampo;

    public Trampoline() {
        trampo = new ArrayList<>();
        waiting = new ArrayList<>();
    }

    public void arrive(Kid kid) {
        waiting.add(0, kid);
    }


    public boolean enter() {
        if (waiting.isEmpty()) {
            System.out.println("fail: a fila esta vazia");
            return false;
        }

        Kid jogar = waiting.remove(waiting.size() - 1);
        trampo.add(0, jogar);
        return true;
    }


    public void leave() {
        if (trampo.isEmpty())
            return;

        Kid saiu = trampo.remove(trampo.size() - 1);
        waiting.add(0, saiu);
    }

    public void remove(String name) {
        boolean found = false;


        for (int i = 0; i < trampo.size(); i++) {
            if (trampo.get(i).getName().equals(name)) {
                trampo.remove(i);
                found = true;
                break;
            }
        }

        for (int i = 0; i < waiting.size(); i++) {
            if (waiting.get(i).getName().equals(name)) {
                waiting.remove(i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.printf("fail: %s nao esta no pula-pula\n", name);
    }

    public String toString() {
        String waitingStr = "[";
        for (int i = 0; i < waiting.size(); i++) {
            waitingStr += waiting.get(i);
            if (i < waiting.size() - 1)
                waitingStr += ", ";
        }
        waitingStr += "]";

        String trampoStr = "[";
        for (int i = 0; i < trampo.size(); i++) {
            trampoStr += trampo.get(i);
            if (i < trampo.size() - 1)
                trampoStr += ", ";
        }
        trampoStr += "]";

        return waitingStr + " => " + trampoStr;
    }
}