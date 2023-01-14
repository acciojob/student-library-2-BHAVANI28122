package com.driver.Convertors;

import com.driver.RequestDto.StudentRequestDto;
import com.driver.models.Author;
import com.driver.models.Card;
import com.driver.models.CardStatus;
import com.driver.models.Student;
import lombok.Builder;
import lombok.Data;

@Data
public class StudentConvertor {
    public static Student ConvertToStudentEntity(StudentRequestDto studentRequestDto){
        Student student = Student.builder().
                name(studentRequestDto.getName())
                .age(studentRequestDto.getAge()).country(studentRequestDto.getCountry())
                .emailId(studentRequestDto.getEmailId()).build();

        return student;

    }

    }

