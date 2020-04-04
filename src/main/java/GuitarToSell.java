public class GuitarToSell extends Guitar implements IPlay, ISell{

    private String description;
    private double priceAtBought;
    private double priceAtSell;

    public GuitarToSell(String material, String colour, InstrumentType type, int numberOfStrings, String description, double priceAtBought, double priceAtSell) {
        super(material, colour, type, numberOfStrings);
        this.description = description;
        this.priceAtBought = priceAtBought;
        this.priceAtSell = priceAtSell;
    }

    public double calculateMarkup() {
        return priceAtSell - priceAtBought;
    }


    public double getPriceAtBought() {
        return priceAtBought;
    }


    public double getPriceAtSell() {
        return priceAtSell;
    }

    public String getDescription() {
        return description;
    }

}
