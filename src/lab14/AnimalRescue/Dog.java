package lab14.AnimalRescue;

public class Dog extends Animal {
    public void eat() {
        System.out.println("mehhh");
    }

    @Override
    public void sleep() {
        System.out.println("ZzzZZzz snores");
    }

    @Override
    public void bark() {
        System.out.println("woof!");

    }
}
