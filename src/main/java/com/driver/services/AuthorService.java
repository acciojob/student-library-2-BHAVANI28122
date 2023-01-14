package com.driver.services;

import com.driver.Convertors.AuthorConvertor;
import com.driver.RequestDto.AuthorRequestDto;
import com.driver.models.Author;
import com.driver.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {


    @Autowired
    AuthorRepository authorRepository1;

    public void create(AuthorRequestDto authorRequestDto){

        Author author = AuthorConvertor.ConvertToEntity(authorRequestDto);
        authorRepository1.save(author);
    }
}
