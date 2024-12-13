package foodmanagement;

public class Customer {
    private String name;
    private String username;
    private String password;
    private String phone;

    public Customer(String name, String username, String password, String phone) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    // Getters and Setters
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "Name: " + name + ", Username: " + username + ", Phone: " + phone;
    }
}


