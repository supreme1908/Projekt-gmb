// Zawiera metodę main() tworzy samochod i motocykl, a następnie wywołuje metody wyświetlające informacje o nich.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("Toyota", "Corolla", 2020, 5, 1995);
        Motocykl motocykl = new Motocykl("Yamaha", "MT-07", 2021, 689);

        ArrayList<Pojazd> pojazdy = new ArrayList<>();
        pojazdy.add(samochod);
        pojazdy.add(motocykl);

    System.out.println("=== SYSTEM ZARZADZANIA POJAZDAMI ===");
    
        for (Pojazd pojazd : pojazdy) {
            System.out.println();
            pojazd.wyswietlInformacje();
        }
    }
}