package array_listsecond.cinema;

public class Solver {
    public static void main (String[] args) {
        Theater theater = null;
        IO IO = new IO();
        while (true) {

            String[] line = IO.inputPartsPrintingLine();

            if(line[0].equals("end")){
                break;
            }

            else if (line[0].equals("show")){
                if (theater == null) {
                    System.out.println("[]");
                } else {
                    System.out.println(theater.toString());
                }
            }


            else if(line[0].equals("init")){
                theater= new Theater(IO.strToInt(line[1]));
            }

            else if(line[0].equals("reserve")){
                theater.reserve(line[1], IO.strToInt(line[2]), IO.strToInt(line[3]));
            }
            else  if(line[0].equals("cancel")){
                theater.cancel(line[1]);
            }

            else { System.out.println("fail: comando invalido");
            }
        }
    }
}

