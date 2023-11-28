package Ex_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (1>0)
        {
            Scanner inputString = new Scanner(System.in);
            System.out.println("inserisci una stringa");
            String string1 = inputString.nextLine();
            if(string1 .equals(":q")) break;
            String[] a=string1.split("");
            System.out.println(Arrays.toString(a));


        }

    }
}