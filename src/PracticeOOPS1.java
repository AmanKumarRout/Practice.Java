public class PracticeOOPS1 {
    public static void main(String[] args) {
        //Book book = new Book("The House in the Cerulean Sea","T.J. Klune",599,345678123);
        //Book book1 = new Book();
        //book1.author="T.J. Klune";
        //book1.title="This is a sample book";
        //book1.price=599.00;
        //System.out.println(book1.author);
        Book book2 = new Book("This is a Book","R.K. Laude",599.00);

        System.out.println(book2);


    }
}
class Book {
    String title;
    String author;
    Double price;
    Book() {
    }
    Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format(
                "Book: \ntitle='%s'\nauthor='%s'\nprice=%.2f",
                title, author, price
        );
    }
}