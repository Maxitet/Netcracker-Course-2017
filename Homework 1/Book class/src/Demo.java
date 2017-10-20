public class Demo {
    public static void main(String[] args) {
        Author author1 = new Author("Ivan", "ivanov@mail.com", 'm');
        Author author2 = new Author("Diana", "dian@mail.com", 'f');

        Author[] m = {author1, author2};

        Book book = new Book("Very interesting book", m, 1200, 20);

        System.out.println(book);

        System.out.println(book.getName());

        System.out.println(book.getPrice());

        System.out.println(book.getQty());

        book.setPrice(500);

        book.setQty(90);

        System.out.println(book);

        System.out.println(book.getAuthorNames());
    }
}
