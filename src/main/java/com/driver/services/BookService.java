package com.driver.services;

import com.driver.Convertors.BookConvertor;
import com.driver.RequestDto.BookRequestDto;
import com.driver.models.Author;
import com.driver.models.Book;
import com.driver.repositories.AuthorRepository;
import com.driver.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {


    @Autowired
    BookRepository bookRepository2;

    @Autowired
    AuthorRepository authorRepository1;

    public void createBook(BookRequestDto bookRequestDto){

        Book book = BookConvertor.ConvertToEntity(bookRequestDto);

        int authorId = bookRequestDto.getAuthorId();

        Author author = authorRepository1.findById(authorId).get();

        book.setAuthor(author);

        bookRepository2.save(book);
    }

    public List<Book> getBooks(String genre, boolean available, String author){
        List<Book> books = new ArrayList<>(); //find the elements of the list by yourself

        if(genre != null && author != null){
            return bookRepository2.findBooksByGenreAuthor(genre,available,author);
        }
        else if(genre != null){
            return bookRepository2.findBooksByGenre(genre,available);
        } else if (author != null){
            return bookRepository2.findBooksByAuthor(author,available);
        }
        else {
            return bookRepository2.findByAvailability(available);
        }
    }
}
