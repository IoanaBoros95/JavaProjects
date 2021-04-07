package lab10.AnimalRescue;

public class PetFood {

    String name;
    double price;
    int quantity;
    int stockAvailability;

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
}
