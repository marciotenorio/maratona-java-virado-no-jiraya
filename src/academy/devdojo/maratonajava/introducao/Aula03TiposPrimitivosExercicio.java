package academy.devdojo.maratonajava.introducao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
         String nome = "Marcio Tenorio";
         String endereco = "Rua Augusto Severo";
         double salario =  17.580;
         String dataRecebimentoSalario = "23/03/2021";

        System.out.println("Eu " + nome + ", morando no endereco " + endereco);
        System.out.println("confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario);
    }
}
