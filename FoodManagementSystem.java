package foodmanagement;

public abstract class FoodManagementSystem {
    public abstract void addFoodItem(FoodItem foodItem);
    public abstract void displayFoodItems();
    public abstract FoodItem searchFoodItemById(String foodId);
    public abstract void updateFoodItem(String foodId, String name, double price);
    public abstract void removeFoodItem(String foodId);
    public abstract void placeOrder(String foodId, int quantity, String customerUsername);
    public abstract void viewOrderHistory();
    public abstract double calculateTotalRevenue();
    public abstract void registerCustomer(String name, String username, String password, String phone);
    public abstract boolean loginCustomer(String username, String password);
}
