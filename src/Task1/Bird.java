package Task1;

public class Bird extends Animals{
    private int sizeOfWings;
    private static int heightOfFly;

    public void setSizeOfWings(final int sizeOfWings){
        this.sizeOfWings = sizeOfWings;
    }

    public int getSizeOfWings (){
        return sizeOfWings;
    }

    public static void setHeightOfFly(final int heightOfFly){
        Bird.heightOfFly = heightOfFly;
    }

    public static int getHeightOfFly (){
        return heightOfFly;
    }

    public Bird(final String territoryOfResidance, final int sizeOfWings){
        super(territoryOfResidance);
        this.sizeOfWings = sizeOfWings;
    }

    static {
        heightOfFly = 20;
    }
}
