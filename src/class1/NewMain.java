package class1;

public class NewMain {
    static Book[] allBook = new Book[2];

    public static void main(String[] args) {

        Author author = new Author("Марк", "Твен");
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Марк", "Толстой");

        System.out.println(author.equals(author2));
        System.out.println(author.hashCode());
        System.out.println(author2.hashCode());


        allBook[0] = new Book("Том Сойер", author, 1976);
        allBook[0].setYearOfIssue(1876);
        allBook[1] = new Book("Война и Мир", author1, 1867);
        printAllList();
        Book a = new Book("aaaaa", author, 6464);
        Book b = new Book("aaaaa", author1, 5456);
        System.out.println(a.equals(b));


    }

    public static void printAllList() {
        for (int i = 0; i < allBook.length; i++) {
            System.out.println(allBook[i]);

        }
    }


}
