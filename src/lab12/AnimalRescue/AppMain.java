package lab12.AnimalRescue;

import lab12.AnimalRescue.Activities.Activity;
import lab12.AnimalRescue.Animals.Animal;
import lab12.AnimalRescue.Foods.Food;
import lab12.AnimalRescue.Peoples.Adopter;
import lab12.AnimalRescue.Peoples.People;

public class AppMain {

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("Bella");
        cat.setAge(2);
        cat.setColor("neagra");
        cat.setHeight(23);

        People adopter = new Adopter();
        adopter.setName("Maria");
        adopter.setAge(16);

        Food petfood = new Food();
        petfood.setName("Whiskas junior");
        petfood.setPrice(12);

        Activity actv = new Activity();
        actv.setName("Joaca cu ghemul de ata");

        System.out.println("Numele persoanei care o va adopta pe pisica mea " + cat.getName() + "," + " este " +adopter.getName()
        + "." + "Ea trebuie sa stie ca pisica mea are " + cat.getAge() + " ani" + ", " + "iar mancarea ei preferata este " + petfood.getName()
        + ".");
    }
}
