public class Restaurant {
    private String name;
    private String location;
    private int capacity;
    private int currentOccupancy;

    public Restaurant(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.currentOccupancy = 0;
    }

    // Getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentOccupancy() {
        return currentOccupancy;
    }

    public void setCurrentOccupancy(int currentOccupancy) {
        this.currentOccupancy = currentOccupancy;
    }

    // Method to check if restaurant is full
    public boolean isFull() {
        return currentOccupancy >= capacity;
    }

    // Method to add customers
    public void addCustomers(int numberOfCustomers) {
        if (currentOccupancy + numberOfCustomers <= capacity) {
            currentOccupancy += numberOfCustomers;
            System.out.println(numberOfCustomers + " customers added to " + name);
        } else {
            System.out.println("Sorry, " + name + " is full.");
        }
    }

    // Method to remove customers
    public void removeCustomers(int numberOfCustomers) {
        if (currentOccupancy >= numberOfCustomers) {
            currentOccupancy -= numberOfCustomers;
            System.out.println(numberOfCustomers + " customers removed from " + name);
        } else {
            System.out.println("There are not enough customers in " + name);
        }
    }
}
