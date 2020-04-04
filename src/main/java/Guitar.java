public abstract class Guitar extends Instrument implements IPlay{

    private int numberOfStrings;

    public Guitar(String material, String colour, InstrumentType type, int numberOfStrings){
        super(material, colour, type);
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return "guitarsound";
    }

    public int getNumberOfStrings(){
        return this.numberOfStrings;
    }
}
