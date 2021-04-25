package lab14.AnimalRescue.Foods;

public class PeopleFood extends Food {
    public void taste() {
        System.out.println("It's so good!!!");
    }

    @Override
    public void smell() {
        System.out.println("It's small good");
    }

    @Override
    public void consistency() {
        System.out.println("It is too creamy");
    }
}
