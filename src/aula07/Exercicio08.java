package aula07;

public class Exercicio08 {

    public static void main(String[] args) {
        int [][] matriz = new int[10][10];

        for(int x = 0; x < matriz.length; x++){
            for(int y = 0; y < matriz.length; y++){
                System.out.print(matriz[x][y] + "  ");
            }

            System.out.println();

        }
    }

}
