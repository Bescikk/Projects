package pl.konrad;

import java.util.Random;
import java.util.Scanner;

public class Projekt2 {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) +1;

        Scanner scanner = new Scanner(System.in);

        boolean wasNumberGuesssed = false;

       while (!wasNumberGuesssed){
            System.out.println("Podaj liczbe: ");
            int userNumber = scanner.nextInt();

            if(userNumber > numberToGuess){
                System.out.println("Liczba za wysoka.");

            }
            else if(userNumber < numberToGuess){
                System.out.println("Liczba za niska.");
            }
            else {
                System.out.println("Zgadłeś liczbę, brawo!");
                wasNumberGuesssed = true;
            }
        }
    }
}
