import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        int numerIndexu = 8;

        for (int zmiennaX = 100; zmiennaX >= 0; zmiennaX-- )
        { if (zmiennaX%numerIndexu ==0 ){
            System.out.println(zmiennaX);}
        }




        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */


        int[] tablicaY = new int[5];
        int zmiennaWprowadzoneDane;

        Scanner zmiennaWprowadzaniadanych = new Scanner(System.in);

        for (int y = 0; y <= tablicaY.length - 1; y++)

        {
            System.out.println( "Podaj liczbe: ");
            tablicaY [y] = zmiennaWprowadzaniadanych.nextInt()*11;

            System.out.println( "Kontener " + y + " = " + tablicaY [y]);
        }

        System.out.println("......");
        int z = 0;
        while (z <= tablicaY.length-1) {
            System.out.println(tablicaY[z]);
            z++;
        }



    }
}
