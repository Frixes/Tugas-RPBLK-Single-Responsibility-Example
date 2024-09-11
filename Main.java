
public class Main {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("Kumpulan Dongeng Si Kancil", "Budi", 2015, 5, "978-0743273565");

        // Create an Invoice object
        Invoice invoice = new Invoice(book, 3, 0.10, 0.05);

        // Print the invoice
        InvoicePrinter printer = new InvoicePrinter(invoice);
        printer.print();


        // Save the invoice to a file
        //InvoicePersistence persistence = new InvoicePersistence(invoice);
        //persistence.saveToFile("invoice.txt");
    }
}

