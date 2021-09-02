import org.junit.jupiter.api.*;

import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class OrderServiceTest {


    RestaurantService service = new RestaurantService();

    LocalTime openingTime = LocalTime.parse("10:30:00");
    LocalTime closingTime = LocalTime.parse("22:00:00");
    Restaurant restaurant = new Restaurant("Amelie's cafe", "Chennai", openingTime, closingTime);

    OrderService orderService= new OrderService(restaurant);




    @Test
    public void getOrderValue_method_should_return_sum_of_price_of_items()
    {
        restaurant.addToMenu ("Sweet corn soup", 119);
        restaurant.addToMenu("Vegetable lasagne", 269);
        restaurant.addToMenu("Vegetable soup", 50);
        restaurant.addToMenu("Chicken Tikka", 300);

        orderService.addAnItemInOrder("Sweet corn soup");
        orderService.addAnItemInOrder("Vegetable lasagne");
        assertEquals(388,orderService.getOrderValue() );



    }

}
