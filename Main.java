// Zawiera metodę main() tworzy samochod i motocykl, a następnie wywołuje metody wyświetlające informacje o nich.
import java.util.ArrayList; // Przeniesiony samochod i motocykl do ArrayList  oraz wyswietla ich liste (przygotowanie do stworzenia menu pojazdów)
import java.util.Scanner; // Scanner do możliwości interakcji menu z użytkownikiem


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Samochod samochod = new Samochod("Toyota", "Corolla", 2020, 5, 1995, "Benzyna");
        Motocykl motocykl = new Motocykl("Yamaha", "MT-07", 2021, 689, "Kros");

        ArrayList<Pojazd> pojazdy = new ArrayList<>(); // arraylist do przechowywania pojazdów
        pojazdy.add(samochod);
        pojazdy.add(motocykl); 

        // menu w którym można wyświetlić informacje o wszystkich pojazdach w ArrayList.

        int wybor;
        do {
            System.out.println("=== MENU ZARZĄDZANIA POJAZDAMI ===");
            System.out.println("1. Wyświetl informacje o wszystkich pojazdach");
            System.out.println("2. Dodaj samochód");
            System.out.println("3. Dodaj motocykl");
            System.out.println("4. Wyjście");
            System.out.print("Wybierz opcję: ");
            wybor = scanner.nextInt();
            scanner.nextLine(); // Odbiera Enter, żeby można było wpisać markę.

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
                    break; 
                case 2:
                System.out.print("Podaj markę: ");
                    String marka = scanner.nextLine();

                    System.out.print("Podaj model: ");
                    String model = scanner.nextLine();

                    System.out.print("Podaj rok produkcji: ");
                    int rok = scanner.nextInt();

                    System.out.print("Podaj liczbę drzwi: ");
                    int drzwi = scanner.nextInt();

                    System.out.print("Podaj pojemność silnika w cm3: ");
                    int pojemnosc = scanner.nextInt();
                    scanner.nextLine(); // Odbiera pozostawiony Enter (nie wiem jak to działa podpowiedział mi copilot)

                    System.out.print("Podaj rodzaj paliwa: ");
                    String paliwo = scanner.nextLine();

                    Samochod nowySamochod = new Samochod(
                        marka, model, rok, drzwi, pojemnosc, paliwo
                    );

                    pojazdy.add(nowySamochod);
                    System.out.println("Dodano samochód!");
                    break;
                case 3:
                System.out.print("Podaj markę: ");
                    String marka1 = scanner.nextLine();

                    System.out.print("Podaj model: ");
                    String model1 = scanner.nextLine();

                    System.out.print("Podaj rok produkcji: ");
                    int rok1 = scanner.nextInt();

                    System.out.print("Podaj pojemność silnika w cm3: ");
                    int pojemnosc1 = scanner.nextInt();
                    scanner.nextLine(); // Odbiera pozostawiony Enter (nie wiem jak to działa podpowiedział mi copilot)

                    System.out.print("Podaj typ motocykla: ");
                    String typ1 = scanner.nextLine();

                    Motocykl nowyMotocykl = new Motocykl(
                        marka1, model1, rok1, pojemnosc1, typ1
                    );

                    pojazdy.add(nowyMotocykl);
                    System.out.println("Dodano Motocykl!");
                    break;
                case 4:
                    System.out.println("Koniec programu.");
                    scanner.close(); // Zamyka skaner.
                    return; // Kończy metodę main(), czyli działanie programu by nie wyświetlać znowu tego samego.
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        } while (wybor != 4);

    System.out.println("=== SYSTEM ZARZADZANIA POJAZDAMI ===");
    
        for (Pojazd pojazd : pojazdy) { // przechodzi przez wszystkie pojazdy w ArrayList i wywołuje metodę wyswietlInformacje().
            System.out.println();
            pojazd.wyswietlInformacje();
        }
    }
}
