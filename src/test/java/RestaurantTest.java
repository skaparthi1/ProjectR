import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testAddCustomers() {
        Restaurant restaurant = new Restaurant("Test Restaurant", "Test Location", 50);
        
        // Adding customers within capacity
        restaurant.addCustomers(10);
        assertEquals(10, restaurant.getCurrentOccupancy());

        // Adding customers exceeding capacity
        restaurant.addCustomers(50);
        assertEquals(10, restaurant.getCurrentOccupancy()); // Capacity should remain unchanged
    }

    @Test
    public void testRemoveCustomers() {
        Restaurant restaurant = new Restaurant("Test Restaurant", "Test Location", 50);
        
        // Adding customers
        restaurant.addCustomers(20);

        // Removing customers
        restaurant.removeCustomers(10);
        assertEquals(10, restaurant.getCurrentOccupancy());

        // Removing more customers than present
        restaurant.removeCustomers(15);
        assertEquals(10, restaurant.getCurrentOccupancy()); // Occupancy should remain unchanged
    }

    @Test
    public void testIsFull() {
        Restaurant restaurant = new Restaurant("Test Restaurant", "Test Location", 50);
        
        assertFalse(restaurant.isFull());

        restaurant.addCustomers(50);
        assertTrue(restaurant.isFull());
    }
}
