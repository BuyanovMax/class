package class1;

public class NewMain {
    public static void main(String[] args) {

        Author author = new Author("Марк", "Твен");
        Author author1 = new Author("Лев", "Толстой");


        Book ThomSoier = new Book("Том Сойер", author, 1976);
        ThomSoier.setYearOfIssue(1876);
        Book WarAndPiace = new Book("Война и Мир", author1, 1867);
        System.out.println("WarAndPiace.getName() = " + WarAndPiace.getNameBook());
        System.out.println("WarAndPiace.getAuthor() = " + WarAndPiace.getAuthor().getNameAuthor());
        System.out.println("WarAndPiace.getAuthor() = " + WarAndPiace.getAuthor().getSernameAuthor());
        System.out.println("WarAndPiace.getYearOfIssue() = " + WarAndPiace.getYearOfIssue());


    }

}
