import com.kodilla.exception.homework.Order;
import com.kodilla.exception.homework.OrderDoesntExistException;
import com.kodilla.exception.homework.Warehouse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarehouseTestSuite {
    @Test
    public void testGetOrderException() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));

        Assertions.assertThrows(OrderDoesntExistException.class, () -> {
            warehouse.getOrder("456");
        });
    }
}

