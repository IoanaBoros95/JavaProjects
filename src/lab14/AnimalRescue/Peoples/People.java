package lab14.AnimalRescue.Peoples;

public abstract class People {

    private String name;
    private int age;
    private float height;
    private boolean gender;

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

    public float getHeight(){
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void dreams();
}
