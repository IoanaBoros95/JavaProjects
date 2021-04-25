package lab14.AnimalRescue;

import lab14.AnimalRescue.Foods.PeopleFood;
import lab14.AnimalRescue.Foods.PetFood;
import lab14.AnimalRescue.Peoples.Adopter;
import lab14.AnimalRescue.Peoples.Veterinarian;

public class AppMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        dog.sleep();

        Cat cat = new Cat();
        cat.bark();
        cat.eat();
        cat.sleep();

        Duck duck = new Duck();
        duck.bark();
        duck.eat();
        duck.sleep();

        Adopter adopter = new Adopter();
        adopter.dreams();
        adopter.eat();
        adopter.sleep();

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.eat();
        veterinarian.sleep();
        veterinarian.dreams();

        PetFood petfood = new PetFood();
        petfood.smell();
        petfood.consistency();
        petfood.taste();

        PeopleFood pf = new PeopleFood();
        pf.taste();
        pf.consistency();
        pf.smell();
    }
}
