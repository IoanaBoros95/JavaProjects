package lab10.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        //DOG
        Dog dog = new Dog();
        dog.setName("Max");
        dog.setAge(5);
        dog.setLevelOfHealth(3);
        dog.setLevelOfFeelingHungry(5);
        dog.setLevelOfMood(8);
        dog.setFavoriteFoodName("Pedigree");
        dog.setFavoriteRecreationActivity("joaca cu mingea");

        System.out.println("Pe catelul meu il cheama "+ dog.getName() + " si are " + dog.getAge() + " ani" + ", " +
                "iar nivelul lui de sanatate este "+ dog.getLevelOfHealth() + "," + " nivelul sau de senzatie de foame este "
                + dog.getLevelOfFeelingHungry() + " si " + "nivelul starii de spirit este " + dog.getLevelOfMood()
                + ".\n" + "Mancarea lui preferata este " + dog.getFavoriteFoodName() + " si "
                + " activitatea sa de recreere este " + dog.getFavoriteRecreationActivity() + ".");

        //ADOPTER
        Adopter adopter = new Adopter();
        adopter.setName("Maria");
        adopter.setAmountMoneyAvailable(150.20);

        System.out.println("Numele persoanei adoptive este "+ adopter.getName() + " si dispune de "
                + adopter.getamountMoneyAvailable() + " RON pentru adoptie" + ".");

        //PET FOOD
        PetFood  food = new PetFood();
        food.setName("Pedigree");
        food.setPrice(12);
        food.setQuantity(100);
        food.setStockAvailability(20);

        System.out.println("Numele mancarii este "+ food.getName() + "," +
                " pretul acestui sortiment de mancare este " + food.getPrice() + " RON" + "," + " cantitatea este de"
                + food.getQuantity() + " de pachete" + "," + " iar momentan, in stoc sunt " +
                food.getStockAvailability() + " de pachete " + ".");

        //VETERINARIAN
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Paul");
        veterinarian.setSpecialization("Medicina interna");

        System.out.println("Numele medicului veterinar este "+ veterinarian.getName() + "," + " iar specializarea sa este "
                + veterinarian.getSpecialization() + ".");

        //RECREATION ACTIVITY
        RecreationActivity activity = new RecreationActivity();
        activity.setName("joaca cu mingea");

        System.out.println("Activitatea de recreere este "+ activity.getName() + ".");
    }
}
