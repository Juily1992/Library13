import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Лев", "Толстой");
        Author author3 = new Author("Сергей", "Есенин");
        Author author4 = new Author("Михаил", "Шолохов");

        Book book1 = new Book("Евгений Онегин", author1, 1831);
        Book book2 = new Book("Война и мир", author2, 1897);
        Book book3 = new Book("Исповедь хулигана", author3, 1921);
        Book book4 = new Book("Поднятая целина", author4, 1959);

        System.out.println("Информация о книгах: ");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());
    }

}

class Book {
    private String title;
    private Author author;
    private int year;


    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public int setYear(int year) {
        this.year = year;
        return year;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return title.equals(b2.title) && author.equals(b2.author) && year == b2.year;
    }


    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, year);
    }

    @Override

    public String toString() {
        return "Название книги:" + title + ". \n Автор: " + author.toString() + ". Год издания: " + year;
    }
}

class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastNameName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a2 = (Author) other;
        return name.equals(a2.name) && lastName.equals(a2.lastName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, lastName);
    }

    @Override
    public String toString() {

        return name + " " + lastName;
    }
}
