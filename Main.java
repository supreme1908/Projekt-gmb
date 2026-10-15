// Zawiera metodę main() tworzy samochod i motocykl, a następnie wywołuje metody wyświetlające informacje o nich.
public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("Toyota", "Corolla", 2020, 5, 1995);
        Motocykl motocykl = new Motocykl("Yamaha", "MT-07", 2021, 689);

        System.out.println("Informacje o samochodzie:");
        samochod.wyswietlInformacje();

        System.out.println("\nInformacje o motocyklu:");
        motocykl.wyswietlInformacje();
    }
}