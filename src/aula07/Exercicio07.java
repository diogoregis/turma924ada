package aula07;

import java.util.Arrays;

public class Exercicio07 {

    public static void main(String[] args) {

        String nomes[] = {"Cleiton", "Will", "Marta", "Valeria"}, sobreNome[] = {"Santos", "Mendes"};

        System.out.println(nomes[3] + " " + sobreNome[0]);

        int[] arrayCom4 = new int[4];

        for(int x = 0; x < arrayCom4.length; x++){
            System.out.println(arrayCom4[x]);
        }

        //int[] arrayCom4 = new int[4];
        Arrays.stream(arrayCom4).forEach(System.out::println);


        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        Arrays.sort(my_array2);
        Arrays.stream(my_array2).forEach(System.out::println);

        Arrays.sort(my_array1);
        System.out.println(Arrays.toString(my_array1));

        int total = 0;
        double media = 0.0;
        for (int x:my_array1) {
            total += x;
        }

        media = total / my_array1.length;


        System.out.println("Soma = "+ total);
        System.out.println("Media = "+media);

        System.out.println(Arrays.stream(my_array1).sum());
        System.out.println(Arrays.stream(my_array1).average());

    }




}
