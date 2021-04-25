package lab14.AnimalRescue.Peoples;

public class Adopter extends People {
    @Override
    public void eat() {
        System.out.println("Yummm");
    }

    @Override
    public void sleep() {
        System.out.println("snores");
    }

    public void dreams() {
        System.out.println("zzZZZZZ");
    }
}
