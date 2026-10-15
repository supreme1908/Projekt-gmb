// Dziedziczy po klasie Pojazd, dodatkowe pole: pojemnoscSilnika. Wyświetla informacje o motocyku.

public class Motocykl extends Pojazd {
    private int pojemnoscSilnika;

    public Motocykl(String marka, String model, int rokProdukcji, int pojemnoscSilnika) {
        super(marka, model, rokProdukcji);
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Pojemność silnika: " + pojemnoscSilnika + " cm3");
    }
}