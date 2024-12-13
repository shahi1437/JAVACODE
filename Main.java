package foodmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FOODMAGEMENT system = new FOODMAGEMENT(); // Correct the typo and ensure `FoodManagement` is a concrete class.
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the Food Management System Menu");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Display Food Items");
            System.out.println("4. Place an Order");
            System.out.println("5. View Order History");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Clear the buffer
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();
                    System.out.print("Enter Phone Number (max 11 digits): ");
                    String phone = scanner.nextLine();

                    if (phone.length() <= 11 && phone.matches("\\d+")) { // Validate phone number
                        system.registerCustomer(name, username, password, phone);
                    } else {
                        System.out.println("Invalid phone number! Please try again.");
                    }
                    break;

                case 2:
                    scanner.nextLine(); // Clear the buffer
                    System.out.print("Enter Username: ");
                    String loginUser = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String loginPass = scanner.nextLine();

                    if (system.loginCustomer(loginUser, loginPass)) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;

                case 3:
                    system.displayFoodItems();
                    break;

                case 4:
                    scanner.nextLine(); // Clear the buffer
                    System.out.print("Enter Username: ");
                    String orderingUser = scanner.nextLine(); // Ask for username again
                    System.out.print("Enter Food ID: ");
                    String foodId = scanner.next();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();

                    system.placeOrder(foodId, quantity, orderingUser);
                    break;

                case 5:
                    system.viewOrderHistory();
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
