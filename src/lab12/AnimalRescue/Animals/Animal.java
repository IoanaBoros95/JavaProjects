package lab12.AnimalRescue.Animals;

public class Animal {
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

    public void eat(){
        System.out.println("Yummy");
    }

    public void sleep(){
        System.out.println("ZzzZZzz snores");
    }
}
