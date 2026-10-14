// Dziedziczy po klasie Pojazd dodatkowe pole: liczbaDrzwi. Wyświetla informacje o samochodzie.
public class Samochod extends Pojazd {
    private int liczbaDrzwi;

    public Samochod(String marka, String model, int rokProdukcji, int liczbaDrzwi) {
        super(marka, model, rokProdukcji);
        this.liczbaDrzwi = liczbaDrzwi;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Liczba drzwi: " + liczbaDrzwi);
    }
}