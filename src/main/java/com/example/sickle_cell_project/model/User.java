package com.example.sickle_cell_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int user_id;
    private String Fullname;
    private String email;
    private String gender;
    private String password;
    private int age;
    private String address;
}
