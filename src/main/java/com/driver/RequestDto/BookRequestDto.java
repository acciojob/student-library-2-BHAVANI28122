package com.driver.RequestDto;

import com.driver.models.Genre;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class BookRequestDto {

    private String name;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private int authorId;

}
