

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice i = new Invoice(
                "101",
                "Keyboard",
                2,
                500
        );

        System.out.println("Part Number: " + i.getPartNumber());
        System.out.println("Description: " + i.getPartDescription());
        System.out.println("Quantity: " + i.getQuantity());
        System.out.println("Price: " + i.getPricePerItem());
        System.out.println("Invoice Amount: " + i.getInvoiceAmount());
    }
}