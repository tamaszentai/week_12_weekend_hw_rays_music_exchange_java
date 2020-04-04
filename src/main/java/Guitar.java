public abstract class Guitar extends Instrument implements IPlay{

    private int numberOfStrings;

    public Guitar(String material, String colour, String type, int numberOfStrings){
        super(material, colour, type);
        this.numberOfStrings = numberOfStrings;
    }

    public String play(String sound) {
        return "guitarsound";
    }
}
