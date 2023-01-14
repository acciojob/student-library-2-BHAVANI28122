package com.driver.Convertors;

import com.driver.RequestDto.BookRequestDto;
import com.driver.models.Book;
import lombok.Builder;
import lombok.Data;

import static io.swagger.models.properties.PropertyBuilder.build;

@Data
public class BookConvertor {

    public static Book ConvertToEntity(BookRequestDto bookRequestDto) {
        Book book = Book.builder().name(bookRequestDto.getName()).genre(bookRequestDto.getGenre()).build();
        return book;
    }

}
