package com.example.sickle_cell_project.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Patient {

    private String SicklecellType;
}
