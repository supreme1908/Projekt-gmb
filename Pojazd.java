// Klasa bazowa Pojazd z polami marka, modelm, rok produkcji dodatkowo konstruktor ustawiający dane pojazdu oraz metodę wyswietlInformacje() wyświetlającą dane.
public class Pojazd {
    private String marka;
    private String model;
    private int rokProdukcji;

    public Pojazd(String marka, String model, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }

    public void wyswietlInformacje() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
    }
}