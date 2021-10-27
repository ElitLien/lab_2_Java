package Task1;

public class Fish extends Animals{
    private String typeOfMove;
    private static String typeOfFamilly;

    public void setTypeOfMove(final String typeOfMove){
        this.typeOfMove = typeOfMove;
    }

    public String getTypeOfMove (){
        return typeOfMove;
    }

    public static void setTypeOfFamilly(final String typeOfFamilly){
        Fish.typeOfFamilly = typeOfFamilly;
    }

    public static String getTypeOfFamilly (){
        return typeOfFamilly;
    }

    public Fish(final String territoryOfResidance, final String typeOfMove){
        super(territoryOfResidance);
        this.typeOfMove = typeOfMove;
    }

    static {
        typeOfFamilly = "Sturgeon";
    }
}
