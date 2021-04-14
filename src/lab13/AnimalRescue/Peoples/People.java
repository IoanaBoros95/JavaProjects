package lab13.AnimalRescue.Peoples;

public class People {

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

    public void eat(){
        System.out.println("Yummy");
    }

    public void sleep(){
        System.out.println("Snoresss");
    }

    public void dreams() {
        System.out.println("HMMMM");
    }
}
