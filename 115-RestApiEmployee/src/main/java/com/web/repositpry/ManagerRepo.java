package com.web.repositpry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Manager;
@Repository
public interface ManagerRepo extends JpaRepository<Manager, Integer> {

}
