package array_list.pula_pula;

import java.util.*;

public class Solver {
    public static void main(String[] args) {
        Trampoline trampo = new Trampoline();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String lineStr = scanner.nextLine();
            System.out.println("$" + lineStr);
            String[] line = lineStr.split(" ");

            if (line[0].equals("end")) {
                break;
            }

            else if (line[0].equals("show")) {
                System.out.println(trampo);
            }

            else if (line[0].equals("arrive")) {
                String name = line[1];
                int age = Integer.parseInt(line[2]);
                trampo.arrive(new Kid(name, age));
            }

            else if (line[0].equals("enter")) {
                trampo.enter();
            }

            else if (line[0].equals("leave")) {
                trampo.leave();
            }

            else if (line[0].equals("remove")) {
                trampo.remove(line[1]);
            }

            else {
                System.out.println("fail: comando invalido");
            }
        }

        scanner.close();
    }
}

