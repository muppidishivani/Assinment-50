package com.web.repositpry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Staff;
@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer> {

}
