// Dziedziczy po klasie Pojazd, dodatkowe pole: pojemnoscSilnika, typMotocykla. Wyświetla informacje o motocyku.

public class Motocykl extends Pojazd {
    private int pojemnoscSilnika;
    private String typMotocykla;

    public Motocykl(String marka, String model, int rokProdukcji, int pojemnoscSilnika, String typMotocykla) {
        super(marka, model, rokProdukcji);
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.typMotocykla = typMotocykla;
    }

    @Override
    public void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println("Pojemność silnika: " + pojemnoscSilnika + " cm3");
        System.out.println("Typ motocykla: " + typMotocykla);
    }
}