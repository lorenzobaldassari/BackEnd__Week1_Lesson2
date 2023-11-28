package Ex_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputString1 = new Scanner(System.in);
        System.out.println("inserisi una stringa");
        String string1 = inputString1.nextLine();
        Boolean a = strinaPariDispari(string1);
        System.out.println("la lunghezza della stringa e' pari?" +a);


        System.out.println("inserisci un anno");
        Scanner inputYear = new Scanner(System.in);
        int year = Integer.parseInt(inputYear.nextLine());
        Boolean b= annoBisestile(year);
        System.out.println("l'anno e' bisestile?"+b);
    }

    public static Boolean strinaPariDispari(String string1) {
        if (string1.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean annoBisestile(int year){
        if ((year % 4 == 0) ||  (year%100==0 && year%400==0)) {
            return true;
        } else {
            return false;
        }
    }
}
