package com.driver.Convertors;

import com.driver.RequestDto.AuthorRequestDto;
import com.driver.models.Author;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
public class AuthorConvertor {

    public static Author ConvertToEntity(AuthorRequestDto authorRequestDto){
        Author author = Author.builder().
                name(authorRequestDto.getName())
                .age(authorRequestDto.getAge())
                .country(authorRequestDto.getCountry())
                .email(authorRequestDto.getEmail()).build();
        return author;

    }
}
