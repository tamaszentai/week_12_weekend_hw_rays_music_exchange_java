public class Drumkit extends Instrument implements IPlay {

    private int numberOfCymbals;

    public Drumkit(String material, String colour, InstrumentType type, int numberOfCymbals){
        super(material, colour, type);
        this.numberOfCymbals = numberOfCymbals;
    }

    public String play() {
        return "dumdum trrrc";
    }
}
