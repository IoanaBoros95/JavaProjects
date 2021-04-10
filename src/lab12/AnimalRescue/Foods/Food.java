package lab12.AnimalRescue.Foods;

public class Food {
    private String name;
    private double price;
    private int quantity;
    private int stockAvailability;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getStockAvailability(){
        return stockAvailability;
    }

    public void setStockAvailability(int stockAvailability){
        this.stockAvailability = stockAvailability;
    }

    public void taste() {
        System.out.println("It's salty!!!");
    }

    public void smell() {
        System.out.println("It smells so good!");
    }

    public void consistency() {
        System.out.println("");
    }
}
