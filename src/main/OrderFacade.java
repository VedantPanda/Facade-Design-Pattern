package main;

public class OrderFacade {
    private final Invoice invoice;
    private final ProductDAO productDAO;
    private final Payment payment;
    private final SendNotification sendNotification;

    public OrderFacade(Invoice invoice, ProductDAO productDAO, Payment payment, SendNotification sendNotification) {
        this.invoice = invoice;
        this.productDAO = productDAO;
        this.payment = payment;
        this.sendNotification = sendNotification;
    }

    public void createOrder(){
        productDAO.getProduct(1);
        payment.makePayment();
        sendNotification.sendNotification();
        invoice.generateInvoice();
        System.out.println("Order created successfully");
    }

}
