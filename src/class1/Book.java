package class1;

import java.util.Objects;

public class Book {

    private String nameBook;

    private Author author;

    private int yearOfIssue;

    public Book(String nameBook, Author author, int yearOfIssue) {

        this.nameBook = nameBook;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }

    public String getNameBook() {
        return nameBook;

    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public boolean equals(Object A) {
        if (this == A) {
            return true;
        }
        if (A == null || getClass() != A.getClass()) {
            return false;
        }
        Book book = (Book) A;
        return nameBook.equals(book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook);
    }

    @Override
    public String toString() {
        return "Название книги: " + nameBook + " Ф.И.О: " + author + " Год издания: " + yearOfIssue;
    }


}
