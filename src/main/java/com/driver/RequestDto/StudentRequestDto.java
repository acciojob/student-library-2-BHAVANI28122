package com.driver.RequestDto;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import java.util.Date;

@Data
public class StudentRequestDto {

    @Column(unique = true)
    private String emailId;
    private String name;
    private int age;

    private String country;

}
