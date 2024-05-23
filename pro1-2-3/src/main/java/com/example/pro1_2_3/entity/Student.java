package com.example.pro1_2_3.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String roll;
    private String section;
    private String studentClass;
    @Column(unique = true)
    private String email;
    private LocalDate dateOfBirth;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Subject> subjects = new ArrayList<>();


}

