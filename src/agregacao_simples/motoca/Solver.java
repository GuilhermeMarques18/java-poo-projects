package agregacao_simples.motoca;

import java.util.*;

class Solver {
    public static void main(String[] args) {
        Motobike motoca = new Motobike();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String[] parts = line.split(" ");
            String command = parts[0];

            switch (command) {
                case "end":
                    return;

                case "show":
                    System.out.println(motoca);
                    break;

                case "buy":
                    if (parts.length < 2) {
                        System.out.println("fail: missing time");
                        break;
                    }
                    int time = Integer.parseInt(parts[1]);
                    motoca.buyTime(time);
                    break;

                case "leave":
                    Person p = motoca.remove();
                    if (p != null) {
                        System.out.println(p);
                    }

                    break;

                case "drive":
                    if (parts.length < 2) {
                        System.out.println("fail: missing time");
                        break;
                    }
                    int driveTime = Integer.parseInt(parts[1]);
                    motoca.drive(driveTime);
                    break;

                case "honk":
                    System.out.println(motoca.honk());
                    break;

                case "init":
                    if (parts.length < 2) {
                        System.out.println("fail: missing power");
                        break;
                    }
                    int power = Integer.parseInt(parts[1]);
                    motoca.setPotencia(power);
                    break;

                case "enter":
                    if (parts.length < 3) {
                        System.out.println("fail: missing person data");
                        break;
                    }

                    String names = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    motoca.insert(new Person(names, age));
                    break;

                default:
                    System.out.println("fail: unknown command");
            }
        }
    }
}
