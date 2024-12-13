package foodmanagement;

public class FoodItem {
    private String foodId;
    private String name;
    private double price;
    private int quantityAvailable;

    public FoodItem(String foodId, String name, double price, int quantityAvailable) {
        this.foodId = foodId;
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    public String getFoodId() { return foodId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantityAvailable() { return quantityAvailable; }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "ID: " + foodId + ", Name: " + name + ", Price: $" + price + ", Quantity: " + quantityAvailable;
    }
}
