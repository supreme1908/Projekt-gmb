// Zawiera metodę main() tworzy samochod i motocykl, a następnie wywołuje metody wyświetlające informacje o nich.
import java.util.ArrayList; // Przeniesiony samochod i motocykl do ArrayList  oraz wyswietla ich liste (przygotowanie do stworzenia menu pojazdów)
import java.util.Scanner; // Scanner do możliwości interakcji menu z użytkownikiem.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Samochod samochod = new Samochod("Toyota", "Corolla", 2020, 5, 1995);
        Motocykl motocykl = new Motocykl("Yamaha", "MT-07", 2021, 689);

        ArrayList<Pojazd> pojazdy = new ArrayList<>(); // arraylist do przechowywania pojazdów
        pojazdy.add(samochod);
        pojazdy.add(motocykl); 

        // menu w którym można wyświetlić informacje o wszystkich pojazdach w ArrayList.

        int wybor;
        do {
            System.out.println("=== MENU ZARZĄDZANIA POJAZDAMI ===");
            System.out.println("1. Wyświetl informacje o wszystkich pojazdach");
            System.out.println("2. Wyjście");
            System.out.print("Wybierz opcję: ");
            wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    if (pojazdy.isEmpty()) {
                        System.out.println("Brak pojazdów do wyświetlenia."); // jeśli lista pojazdów jest pusta, wyświetla komunikat o braku pojazdów do wyświetlenia.
                    } else {
                        for (Pojazd pojazd : pojazdy) { // przechodzi przez wszystkie pojazdy w ArrayList i wywołuje metodę wyswietlInformacje().
                            System.out.println();
                            pojazd.wyswietlInformacje();
                        } 
                    }
                case 2:
                    System.out.println("Koniec programu.");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        } while (wybor != 2);

    System.out.println("=== SYSTEM ZARZADZANIA POJAZDAMI ===");
    
        for (Pojazd pojazd : pojazdy) { // przechodzi przez wszystkie pojazdy w ArrayList i wywołuje metodę wyswietlInformacje().
            System.out.println();
            pojazd.wyswietlInformacje();
        }
    }
}