package foodmanagement;
import java.util.ArrayList;
import java.util.List;

public abstract class FoodManagement extends FoodManagementSystem {
    private List<Customer> customers = new ArrayList<>();
    private List<FoodItem> foodItems = new ArrayList<>();
    private List<String> orderHistory = new ArrayList<>();
    private double totalRevenue = 0;

    @Override
    public void registerCustomer(String name, String username, String password, String phone) {
        customers.add(new Customer(name, username, password, phone));
        System.out.println("Customer registered successfully!");
    }

    @Override
    public boolean loginCustomer(String username, String password) {
        for (Customer customer : customers) {
            if (customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void displayFoodItems() {
        for (FoodItem item : foodItems) {
            System.out.println(item);
        }
    }

    @Override
    public void placeOrder(String foodId, int quantity, String username) {
        // Check if the user is registered
        for (Customer customer : customers) {
            if (customer.getUsername().equals(username)) {
                for (FoodItem item : foodItems) {
                    if (item.getFoodId().equals(foodId)) {
                        if (item.getQuantityAvailable() >= quantity) {
                            item.setQuantityAvailable(item.getQuantityAvailable() - quantity);
                            double cost = quantity * item.getPrice();
                            totalRevenue += cost;

                            String order = "Customer: " + username + ", Food: " + item.getName() + 
                                           ", Quantity: " + quantity + ", Cost: " + cost;
                            orderHistory.add(order);
                            System.out.println("Order placed successfully: " + order);
                            return;
                        } else {
                            System.out.println("Insufficient stock.");
                        }
                    }
                }
                System.out.println("Food item not found.");
                return;
            }
        }
        System.out.println("User not registered. Please register first.");
    }

    @Override
    public void viewOrderHistory() {
        for (String order : orderHistory) {
            System.out.println(order);
        }
    }

    // Implement other methods as required...
}
