package lab14.AnimalRescue;

public abstract class Animal {
    private String name;
    private int age;
    private String color;
    private float height;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void bark();
}
