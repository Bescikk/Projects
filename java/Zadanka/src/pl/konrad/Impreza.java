package pl.konrad;

import java.util.*;

public class Impreza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        Party_Impreza partyImpreza = new Party_Impreza();

        while(shouldContinue) {
            System.out.println("Wybierz opcje: ");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("5. Wyjście");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> partyImpreza.displayGuests();
                case 2 -> partyImpreza.addGuest();
                case 3 -> partyImpreza.displayMeals();
                case 4 -> partyImpreza.displayGuestByPhoneNumber();
                case 5 -> shouldContinue = false;

            }
        }
    }
}
