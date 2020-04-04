public class DrumStick implements ISell {

    private String description;
    private double priceAtBought;
    private double priceAtSell;

    public DrumStick(String description, double priceAtBought, double priceAtSell){
        this.description = description;
        this.priceAtBought = priceAtBought;
        this.priceAtSell = priceAtSell;
    }

    public double calculateMarkup() {
        return priceAtSell - priceAtBought;
    }

    public String getDescription() {
        return description;
    }

    public double getPriceAtBought() {
        return priceAtBought;
    }

    public double getPriceAtSell() {
        return priceAtSell;
    }
}
