package lab14.AnimalRescue.Peoples;

public class Veterinarian extends People {
    public void eat(){
        System.out.println("Yummy yummy");
    }

    @Override
    public void sleep() {
        System.out.println("ZzzZzZ");
    }

    @Override
    public void dreams() {
        System.out.println("Yayyy");
    }
}
