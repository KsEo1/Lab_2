import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int[] exerciseArray = new int[20];
        ta1(exerciseArray);
        p1(exerciseArray);
        zad2();
        String myName = "Paul";
        String mySurname = "Faules";
        int myAge = 0;
        forZad3(myName, mySurname, myAge);
        forZad4();
    }
    /* ćwiczenie 5 Metody */

    /* zad.1
    a) stworzyć tablicę typu int[20],
    b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
    c) napisać metodę, która wypisze otrzymane wartości,
    d) wstawić wywołanie metody do metody main
    */
    public static void ta1(int[] exerciseArray) {
        for(int i = 0; i < exerciseArray.length; ++i) {
            exerciseArray[i] = 40 + (int)(Math.random() * -21.0D);
        }
    }

    public static void p1(int[] exerciseArray) {
        for (int i = 0; i < exerciseArray.length; ++i) {
            System.out.println(exerciseArray[i]);
        }
    }

    /* zad.2
    a) stworzyc tablicę typu String[6],
    b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
        (użyć do tego pętli i klasy Scanner),
    c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
    */
    public static void zad2() {
        String[] arrayForZad2 = new String[6];
        forZad2_2(arrayForZad2);
        forZad2P(arrayForZad2);
    }
    public static void forZad2_2(String[] arrayForZad2) {
        Scanner forInsertToForZad2 = new Scanner(System.in);
        for(byte i = 0; i < arrayForZad2.length; ++i) {
            System.out.println("Give numbers to Array number: " + i);
            String forInput = forInsertToForZad2.next();
            arrayForZad2[i] = forInput;
        }
    }
    public static void forZad2P(String[] arrayForZad2) {
        for(int i = arrayForZad2.length - 1; i > (-1); --i) {
            System.out.println("Array number  ....");
            System.out.println("Array = " + arrayForZad2[i]);
        }
    }

    /* zad.3
    a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
        wyświetla w konsoli string który ma być waszym imieniem,
    b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
        wasze imie i nazwisko,
    c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
        nazwisko i wiek (int), a następnie wszystko wyświetli,
    */
    public static void forZad3(String myName) {
        myName = "Paweł";
        System.out.println("my name: " + myName);
    }
    public static void forZad3(String myName, String mySurname) {
        myName = "Paweł";
        mySurname = "Leszczyński";
        System.out.println("my name: " + myName + " and my surname: " + mySurname);
    }
    public static void forZad3(String myName, String mySurname, int myAge) {
        myName = "Paweł";
        mySurname = "Leszczyński";
        myAge = 21;
        System.out.println("my name: " + myName + " and my surname: " + mySurname + " Age: " + myAge);
    }

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

    public static void forZad4() {
        int variable1 = 10;
        int variable2 = 20;
        int variable3 = 30;
        forZad4A(variable1, variable2);
        forZad4A(variable1, variable2, variable3);
        int resultC = forZad4A(variable1, variable2) + forZad4A(variable1, variable2, variable3);
        System.out.println(resultC);
    }
    public static int forZad4A(int parametr1, int parametr2) {
        int additionSum = parametr1 + parametr2;
        return additionSum;
    }
    public static int forZad4A(int parametr1, int parametr2, int parametr3) {
        int additionSum = parametr1 + parametr2 + parametr3;
        return additionSum;
    }
}


