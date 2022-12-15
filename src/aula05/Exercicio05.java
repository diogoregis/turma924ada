package aula05;

public class Exercicio05 {

    public static void main(String[] args) {

        int nota = 75;

        System.out.println("Nota: " + retornaNota(nota));

    }
    public static char retornaNota(int nota) {

        if (nota >= 90 && nota <= 100) {
            return 'A';
        }
        if (nota >= 80 && nota < 90) {
            return 'B';
        }
        if (nota >= 70 && nota < 80) {
            return 'C';
        }
        if (nota >= 60 && nota < 70) {
            return 'D';
        }

        if (nota < 60) {
            return 'F';
        } else return 0;
    }

}
