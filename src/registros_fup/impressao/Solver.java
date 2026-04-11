package registros_fup.impressao;

import java.util.HashMap;
import java.util.Map;

class Solver {

    public static Map<String, Object> lerAluno(){
        Map<String,Object>registro = new HashMap<>();

        String nome = IO.input();
        int matricula = IO.inputInt();
        String disciplina = IO.input();
        double nota = IO.inputDouble();

        registro.put("Nome", nome);
        registro.put("Matrícula", matricula);
        registro.put("Disciplina", disciplina);
        registro.put("Nota", nota);

        return registro;

    }

    public static void imprimir(Map<String, Object>aluno){
        IO.println("Nome = " + aluno.get("Nome"));
        IO.println("Matrícula = " + aluno.get("Matrícula"));
        IO.println("Disciplina = "+ aluno.get("Disciplina"));
        IO.println("Nota = " + aluno.get("Nota"));
    }
    public static void main (String[] args) {
        Map<String, Object> registro = lerAluno();
        imprimir(registro);
    }
}
