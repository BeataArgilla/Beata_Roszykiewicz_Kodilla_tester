public class SimpleArray {
    public static void main(String[] args) {
        String[] book = new String[5];
        book[0] = "Terry Haey";
        book[1] = "Murakami";
        book[2] = "Emanuel Smith";
        book[3] = "Jadowska";
        book[4] = "Himalaizm";
        String books = book[3];
        System.out.println(book[3]);
        int numberOfElements = book.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");


    }
}
