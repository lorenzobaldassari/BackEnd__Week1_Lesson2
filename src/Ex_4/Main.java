package Ex_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("inserisci una numero");
        int number =Integer.parseInt(inputNumber.nextLine());
        for (int i=number; i>-1;i--){
            System.out.println(i);
        }
    }
}

