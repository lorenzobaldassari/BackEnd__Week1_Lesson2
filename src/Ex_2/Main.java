package Ex_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("inserisi un numero tra 0 e 3");
        int number = Integer.parseInt(inputNumber.nextLine());
        switch (number) {
            case 1:{
                System.out.println("Uno");
                break;
            }
            case 2:{
                System.out.println("Due");
                break;
            }
            case 3:{
                System.out.println("Tre");
                break;
            }
            case 0:{
                System.out.println("Zero");
                break;
            }
            default :{
                System.out.println("Birichino! Rirpova ed inserisci un numero tra e 0 e 3");
            }
        }
    }
}

