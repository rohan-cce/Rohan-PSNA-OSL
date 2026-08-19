class Order {
    public int orderId;
    public OrderStatus orderStatus;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public Order(int orderId, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }
}

enum OrderStatus{
    PENDING,
    SHIPPED,
    DELIVERED,
    CANCELLED
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1);
        System.out.println("Order ID: " + order.orderId);

        Order order1 = new Order(2, OrderStatus.PENDING);

        Order order2 = new Order(2, OrderStatus.PENDING);
//        Order order2 = new Order(2, OrderStatus.PENDING);


        System.out.println("Order status: " + order.orderStatus);


    }
}






