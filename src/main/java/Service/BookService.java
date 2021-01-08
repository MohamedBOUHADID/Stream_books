package Service;

import Entity.Author;
import Entity.Book;
import Entity.Publisher;

import java.util.Arrays;

public class BookService {



    public Book[] filterBooksByAuthor(final Author author, Book[] books) {
        if (author == null || books == null) {
			return new Book[0];
		}
        return Arrays.stream(books)
                .filter(book -> book.hasAuthor(author))
                .toArray(Book[]::new);
    }
    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
        if (publisher == null || books == null) {
			return new Book[0];
		}
        return Arrays.stream(books)
                .filter(book -> book.getPublisher().equals(publisher))
                .toArray(Book[]::new);
    }

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        if (books == null) {
			return new Book[0];
		}
        return Arrays.stream(books)
                .filter(book -> book.getPublishingYear() >= yearFromInclusively)
                .toArray(Book[]::new);
    }

}
