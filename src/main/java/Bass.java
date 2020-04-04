public class Bass extends Instrument implements IPlay{

    private int pickupType;

    public Bass(String material, String colour, String type, int pickupType){
        super(material, colour, type);
        this.pickupType = pickupType;
    }


    public String play(String sound) {
        return "basssound";
    }
}
