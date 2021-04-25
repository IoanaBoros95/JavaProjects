package lab14.AnimalRescue;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Yummmm");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZZZzzz");
    }

    public void bark() {
        System.out.println("miauuuu!");
    }
}
