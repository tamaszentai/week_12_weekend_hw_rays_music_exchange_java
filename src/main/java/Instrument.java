public abstract class Instrument {

    private String material;
    private String colour;
    private InstrumentType type;

    public Instrument(String material, String colour, InstrumentType type){
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial(){
        return this.material;
    }

    public String getColour(){
        return this.colour;
    }

    public InstrumentType getType(){
        return this.type;
    }


}
