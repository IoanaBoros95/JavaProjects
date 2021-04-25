package lab14.AnimalRescue.Foods;

public abstract class Food {
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

    public abstract void taste();

    public abstract void smell();

    public abstract void consistency();
}
