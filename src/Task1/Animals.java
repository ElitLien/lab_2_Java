package Task1;

public class Animals {
    private String territoryOfResidance;
    private static boolean isExist;

    public void setTerritoryOfResidance(final String territoryOfResidance){
        this.territoryOfResidance = territoryOfResidance;
    }

    public static void setIsExist(final Boolean isExist){
        Animals.isExist = isExist;
    }

    public static boolean getIsExist(){
        return isExist;
    }

    public String getTerritoryOfResidance(){
        return territoryOfResidance;
    }

    public Animals (final String territoryOfResidance){
        this.territoryOfResidance = territoryOfResidance;
    }

    static {
        isExist = true;
    }

}
