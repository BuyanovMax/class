package class1;

import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;

    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }


    @Override
    public boolean equals(Object B) {
        if (this == B) {
            return true;
        }
        if (B == null || getClass() != B.getClass()) {
            return false;
        }
        Author author = (Author) B;
        return nameAuthor.equals(author.nameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor);
    }

    @Override
    public String toString() {
        return nameAuthor + " " + surnameAuthor;
    }
}

