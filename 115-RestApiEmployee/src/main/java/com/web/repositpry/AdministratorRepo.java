package com.web.repositpry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Administrator;
@Repository
public interface AdministratorRepo extends JpaRepository<Administrator, Integer> {

}
