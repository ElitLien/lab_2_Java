package Task1;

public class Main {

    public static void main(final String[] args) {
        final Fish fish = new Fish("water", "fins");
        final Bird bird = new Bird("land", 20);
        System.out.println("Territory of residance of fish is " + fish.getTerritoryOfResidance() + " and she moves using " + fish.getTypeOfMove());
        System.out.println("Territory of residance of bird is " + bird.getTerritoryOfResidance() + " and her size of wings is " + bird.getSizeOfWings() + " cm");
    }
}
