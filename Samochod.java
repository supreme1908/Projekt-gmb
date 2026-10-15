// Dziedziczy po klasie Pojazd dodatkowe pole: liczbaDrzwi oraz pojemnoscSilnika(pomysł pana krzysia). Wyświetla informacje o samochodzie.

public class Samochod extends Pojazd {
    private int liczbaDrzwi;
    private int pojemnoscSilnika;

    public Samochod(String marka, String model, int rokProdukcji, int liczbaDrzwi, int pojemnoscSilnika) {
        super(marka, model, rokProdukcji);
        this.liczbaDrzwi = liczbaDrzwi;
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Liczba drzwi: " + liczbaDrzwi);
        System.out.println("Pojemność silnika: " + pojemnoscSilnika + " cm3");
    }
}
