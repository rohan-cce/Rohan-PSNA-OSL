class Order {
    public int orderId;
    public String orderStatus;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public Order(int orderId, String orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }
}

public class Main {
    static void main() {
        Order order = new Order(1);
        System.out.println("Order ID: " + order.orderId);

        Order order = new Order(2, "Shipped");
        System.out.println("Order ID: " + order.orderStatus);


    }
}






