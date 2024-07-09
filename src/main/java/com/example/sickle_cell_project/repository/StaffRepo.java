package com.example.sickle_cell_project.repository;

import com.example.sickle_cell_project.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepo extends JpaRepository<Staff,Integer> {

}
