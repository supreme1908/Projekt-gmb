// Dziedziczy po klasie Pojazd dodatkowe pole: liczbaDrzwi, rodzaj paliwa oraz pojemnoscSilnika(pomysł pana krzysia). Wyświetla informacje o samochodzie.

public class Samochod extends Pojazd {
    private int liczbaDrzwi;
    private int pojemnoscSilnika;
    private String rodzajPaliwa;

    public Samochod(String marka, String model, int rokProdukcji, int liczbaDrzwi, int pojemnoscSilnika, String rodzajPaliwa) {
        super(marka, model, rokProdukcji);
        this.liczbaDrzwi = liczbaDrzwi;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajPaliwa = rodzajPaliwa;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Liczba drzwi: " + liczbaDrzwi);
        System.out.println("Pojemność silnika: " + pojemnoscSilnika + " cm3");
        System.out.println("Rodzaj paliwa: " + rodzajPaliwa);
    }
}
