package com.web.repositpry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.SignUp;
@Repository
public interface SignUpRepo extends JpaRepository<SignUp, Integer> {

}
