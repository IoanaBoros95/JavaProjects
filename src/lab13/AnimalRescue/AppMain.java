package lab13.AnimalRescue;

import lab13.AnimalRescue.Activities.Activity;
import lab13.AnimalRescue.Foods.Food;
import lab13.AnimalRescue.Foods.PeopleFood;
import lab13.AnimalRescue.Foods.PetFood;
import lab13.AnimalRescue.Peoples.Adopter;
import lab13.AnimalRescue.Peoples.People;
import lab13.AnimalRescue.Peoples.Veterinarian;

public class AppMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.bark();

        Adopter adopter = new Adopter();
        adopter.dreams();

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.eat();

        PetFood petfood = new PetFood();
        petfood.smell();

        PeopleFood pf = new PeopleFood();
        pf.taste();
    }
}
