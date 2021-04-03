package lab10.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        //DOG
        Dog dog1 = new Dog();
        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.levelOfHealth[0]);
        System.out.println(dog1.levelOfFeelingHungry[5]);
        System.out.println(dog1.levelOfMood[6]);
        System.out.println(dog1.favoriteFoodName);
        System.out.println(dog1.favoriteRecreationActivity);

        //ADOPTER
        Adopter adopt1 = new Adopter();
        System.out.println(adopt1.name);
        System.out.println(adopt1.amountMoneyAvailable);

        //PET FOOD
        PetFood food1 = new PetFood();
        System.out.println(food1.name);
        System.out.println(food1.price);
        System.out.println(food1.stockAvailability);

        //RECREATION ACTIVITY
        RecreationActivity activity1 = new RecreationActivity();
        System.out.println(activity1.name);

        //VETERINARIAN
        Veterinarian veterinarian1 = new Veterinarian();
        System.out.println(veterinarian1.name);
        System.out.println(veterinarian1.specialization);
    }

}
