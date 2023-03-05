package pl.konrad;

import java.util.*;

public class Party_Impreza {
    private List<Guest_Impreza> guestImprezas = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest_Impreza> phoneToGuest = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addGuest() {
        System.out.println("Podaj imię gościa: ");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posiłek");
        String meal = scanner.nextLine();

        System.out.println("Podaj pnumer telefonu");
        int phoneNumber  = Integer.valueOf(scanner.nextLine());

        System.out.println("Czy weganin? Y/N");
        String isVeganString = scanner.nextLine();

        boolean isVegan;

        if(isVeganString.equals("Y")) {
            isVegan = true;
        }
        else {
            isVegan = false;
        }

        Guest_Impreza guestImpreza = new Guest_Impreza(name, meal, phoneNumber, isVegan);

        meals.add(meal);
        phoneToGuest.put(phoneNumber, guestImpreza);
        guestImprezas.add(guestImpreza);
    }

    public void displayMeals(){
        for (String meal : meals) {
            System.out.println(meal);

        }
    }

    public void displayGuestByPhoneNumber() {
        System.out.println("Podaj numer telefonu: ");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest_Impreza guestImpreza = phoneToGuest.get(phoneNumber);

        guestImpreza.displayGuestInformation();
    }

    public void displayGuests() {
        for (Guest_Impreza guestImpreza : guestImprezas) {
            guestImpreza.displayGuestInformation();
//            System.out.println(guest);

        }
    }
}
