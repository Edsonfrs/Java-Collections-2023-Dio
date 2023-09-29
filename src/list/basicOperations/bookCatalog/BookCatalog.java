package list.basicOperations.bookCatalog;

import list.basicOperations.bookCatalog.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {

    private List<Book> bookList;

    public BookCatalog(){
        this.bookList = new ArrayList<>();
    }

    public void addBookToCatalog(String title, String author, int yearOfPublication) {
        Book book = new Book(title, author, yearOfPublication);
        this.bookList.add(book);
    }

    public void removeBookFromCatalog(String title) {
        List<Book> booksToRemove = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                booksToRemove.add(b);
            }
        }
        bookList.removeAll(booksToRemove);
    }

    public int getTotalNumberOfBooks(){
        return  bookList.size();
    }

    public void showCatalogItens() {
        if (!bookList.isEmpty()){
            System.out.println(this.bookList);
        } else {
            System.out.println("The catalog is empty");
        }
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(b);
                }
            }
        }
        return booksByAuthor;
    }

    public List<Book> searchByYearRange(int startYear, int finalYear) {
        List<Book> booksByYearRange = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getYearOfPublication() >= startYear && b.getYearOfPublication() <= finalYear ) {
                    booksByYearRange.add(b);
                }
            }
        }
        return booksByYearRange;
    }

    public Book searchByTitle(String title) {
        Book bookByTitle = null;
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    bookByTitle = b;
                    break;
                }
            }
        }
        return bookByTitle;
    }

    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();

        bookCatalog.addBookToCatalog("Dracula", "Bram Stoker", 1897);
        bookCatalog.addBookToCatalog("Frankstein", "Mary Shelley", 1818);
        bookCatalog.addBookToCatalog("The Raven", "Edgar Allan Poe", 1845);
        bookCatalog.addBookToCatalog("Os Lusíadas", "Luís de Camões", 1572);
        bookCatalog.addBookToCatalog("Paradise Lost", "John Milton", 1667);
        bookCatalog.addBookToCatalog("O poeta na ponte 2...", "José Ninguém", 2003);
        bookCatalog.addBookToCatalog("Guerra e Paz", "Lev Tolstói", 1865);
        bookCatalog.addBookToCatalog("Guerra e Paz", "Lev Tolstói", 1866);
        bookCatalog.addBookToCatalog("O poeta na ponte 2...", "João Algum", 2003);
        bookCatalog.addBookToCatalog("1984", "George Orwell", 1949);
        bookCatalog.addBookToCatalog("Don Quixote De La Mancha", "Miguel de Cervantes", 1605);
        bookCatalog.addBookToCatalog("Fausto", "Johann Wolfgang von Goethe", 1832);
        bookCatalog.addBookToCatalog("O poeta na ponte...", "João Algum", 2000);

        //System.out.println(bookCatalog.searchByAuthor("Lev Tolstói"));
        //System.out.println(bookCatalog.searchByAuthor("João Algum"));


        //System.out.println(bookCatalog.getTotalNumberOfBooks());

        //System.out.println(bookCatalog.searchByYearRange(1800, 1900));
        System.out.println(bookCatalog.searchByTitle("Guerra e Paz"));

        //bookCatalog.removeBookFromCatalog("O poeta na ponte 2...");
        //bookCatalog.removeBookFromCatalog("O poeta na ponte 2...");


        //bookCatalog.showCatalogItens();
        System.out.println("Total books in the catalog: " + bookCatalog.getTotalNumberOfBooks());






    }

}
