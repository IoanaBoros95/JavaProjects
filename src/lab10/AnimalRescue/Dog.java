package lab10.AnimalRescue;

public class Dog {

    private String name;
    private int age;
    private int levelOfHealth;
    private int levelOfFeelingHungry;
    private int levelOfMood;
    private String favoriteFoodName;
    private String favoriteRecreationActivity;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getLevelOfHealth() {
        return levelOfHealth;
    }

    public void setLevelOfHealth(int levelOfHealth) {
        this.levelOfHealth = levelOfHealth;
    }

    public int getLevelOfFeelingHungry() {
        return levelOfFeelingHungry;
    }

    public void setLevelOfFeelingHungry(int levelOfFeelingHungry) {
        this.levelOfFeelingHungry = levelOfFeelingHungry;
    }

    public int getLevelOfMood() {
        return levelOfMood;
    }

    public void setLevelOfMood(int levelOfMood) {
        this.levelOfMood = levelOfMood;
    }

    public String getFavoriteFoodName(){
        return favoriteFoodName;
    }

    public void setFavoriteFoodName(String favoriteFoodName){
        this.favoriteFoodName = favoriteFoodName;
    }

    public String getFavoriteRecreationActivity(){
        return favoriteRecreationActivity;
    }

    public void setFavoriteRecreationActivity(String favoriteRecreationActivity){
        this.favoriteRecreationActivity = favoriteRecreationActivity;
    }
}
