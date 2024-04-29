public class RestaurantApp {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Sample Restaurant", "Sample Location", 50);
        
        // Adding and removing customers example
        restaurant.addCustomers(10);
        restaurant.addCustomers(20);
        restaurant.removeCustomers(15);
    }
}
