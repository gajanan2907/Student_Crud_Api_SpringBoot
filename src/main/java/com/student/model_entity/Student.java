package com.student.model_entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Student_DTLS")
public class Student
{   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;


}
