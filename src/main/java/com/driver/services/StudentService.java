package com.driver.services;

import com.driver.Convertors.StudentConvertor;
import com.driver.RequestDto.StudentRequestDto;
import com.driver.models.Card;
import com.driver.models.CardStatus;
import com.driver.models.Student;
import com.driver.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {


    @Autowired
    CardService cardService4;

    @Autowired
    StudentRepository studentRepository4;

    public Student getDetailsByEmail(String email){
        Student student = studentRepository4.findByEmailId(email);
        return student;
    }

    public Student getDetailsById(int id){

        Student student = studentRepository4.findById(id).get();
                return student;
    }

    public void createStudent(StudentRequestDto studentRequestDto){
        Student student = StudentConvertor.ConvertToStudentEntity(studentRequestDto);
        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setStudent(student);

        studentRepository4.save(student);

    }

    public void updateStudent(Student student){

        studentRepository4.save(student);
    }

    public void deleteStudent(int id){
        //Delete student and deactivate corresponding card
        studentRepository4.deleteById(id);
    }
}
