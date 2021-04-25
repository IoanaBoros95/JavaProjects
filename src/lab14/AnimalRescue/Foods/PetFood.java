package lab14.AnimalRescue.Foods;

public class PetFood extends Food {
    @Override
    public void taste() {
        System.out.println("It's salty!");
    }

    public void smell() {
        System.out.println("It smells bad!");
    }

    @Override
    public void consistency() {
        System.out.println("It is too creamy");

    }
}
