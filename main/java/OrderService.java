import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private static List<Item> order = new ArrayList<>();
    private Restaurant restaurant;
    private int orderValue;

    OrderService(Restaurant restaurant)
    {
        this.restaurant=restaurant;
        orderValue=0;
    }




    public void addAnItemInOrder(String itemName)
    {
        order.add(restaurant.findItemByName(itemName));
    }
    public void removeAnItemFromOrder(String itemName)
    {
        order.remove(restaurant.findItemByName(itemName));
    }
    public int getOrderValue()
    {
        for (Item temp: order) {
            orderValue += temp.getPrice();
        }
        return orderValue;
    }

    public static List<Item> getOrder() {
        return order;
    }


}
