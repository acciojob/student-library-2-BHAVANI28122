package com.driver.RequestDto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class AuthorRequestDto {
    private String name;

    @Column(unique = true)
    private String email;

    private int age;
    private String country;
}
