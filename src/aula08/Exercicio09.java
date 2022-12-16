package aula08;

import java.util.Scanner;

public class Exercicio09 {

    final static int MINUTOANO = 525600;
    final static int MINUTODIA = 1440;
    static Scanner tecla = new Scanner(System.in);

    public static void main(String[] args) {

        converteMinutos(recebeMinutos());

    }

    public static void converteMinutos (int minutos){
        int anos = minutos / MINUTOANO;
        double sobra = minutos % MINUTOANO;
        int dias = (int) sobra / MINUTODIA;
        System.out.println("Ano(s): " + anos);
        System.out.println("Dia(s) " + dias);
    }

    public static int recebeMinutos(){
        System.out.println("Digite um numero inteiro com os minutos: ");
        return tecla.nextInt();

    }

}
