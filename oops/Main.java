class Order {


    public int orderId;
    public OrderStatus orderStatus;
    private double orderPrice;

    public Order(int orderId, OrderStatus orderStatus, double orderPrice) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.orderPrice = orderPrice;
    }



    public Order(int orderId) {
        this.orderId = orderId;
    }

    public Order(int orderId, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }


    public double getOrderPrice() {
        return orderPrice;
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
        System.out.println("Order status: " + order.orderStatus);


        Order order3 = new Order(3, OrderStatus.SHIPPED, 999);
//        order3.orderPrice=12;
//        order3.setOrderPrice(12);
        System.out.println("Order price: " + order3.getOrderPrice());


    }
}






