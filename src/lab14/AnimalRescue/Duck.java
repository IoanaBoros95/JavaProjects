package lab14.AnimalRescue;

import java.sql.SQLOutput;

public class Duck extends Animal {
    @Override
    public void eat() {
        System.out.println("hmmmm");
    }

    @Override
    public void sleep() {
        System.out.println("ZzzzzzZZz");

    }

    @Override
    public void bark() {
        System.out.println("macmac");
    }
}
