package main;

public class Client {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade(new Invoice(), new ProductDAO(), new Payment(),
                new SendNotification());
        orderFacade.createOrder();
    }
}
