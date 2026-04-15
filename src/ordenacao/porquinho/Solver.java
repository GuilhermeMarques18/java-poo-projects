package ordenacao.porquinho;

import java.util.Scanner;
import java.util.Arrays;

public class Solver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pig pig = null;

        while (true) {
            if (!sc.hasNextLine())
                break;

            String line = sc.nextLine().trim();
            if (line.isEmpty())
                continue;


            System.out.println("$" + line);

            String[] parts = line.split(" ");

            try {
                switch (parts[0]) {

                    case "end":
                        return;

                    case "init":
                        pig = new Pig(Integer.parseInt(parts[1]));
                        break;

                    case "show":
                        System.out.println(pig);
                        break;

                    case "addCoin":
                        int value = Integer.parseInt(parts[1]);
                        pig.addCoin(Coin.fromValue(value));
                        break;

                    case "addItem":
                        pig.addItem(new Item(parts[1],
                                Integer.parseInt(parts[2])));
                        break;

                    case "break":
                        pig.breakPig();
                        break;

                    case "extractCoins":
                        try {
                            Coin[] coins = pig.extractCoins();
                            System.out.println(Arrays.toString(coins));
                        } catch (PigBreakException e) {
                            System.out.println(e.getMessage());
                            System.out.println("[]");
                        }
                        break;

                    case "extractItems":
                        try {
                            Item[] items = pig.extractItems();
                            System.out.println(Arrays.toString(items));
                        } catch (PigBreakException e) {
                            System.out.println(e.getMessage());
                            System.out.println("[]");
                        }
                        break;

                    default:
                        System.out.println("fail: comando invalido");
                }

            } catch (PigException |
                     PigFullException |
                     PigBrokenException e) {

                System.out.println(e.getMessage());
            }
        }
    }
}

