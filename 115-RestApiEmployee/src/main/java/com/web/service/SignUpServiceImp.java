package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.SignUp;
import com.web.repositpry.SignUpRepo;

@Service
public class SignUpServiceImp implements SignUpService {
@Autowired
private SignUpRepo repo;

@Override
public SignUp saveData(SignUp signup) {
	// TODO Auto-generated method stub
	return repo.save(signup);
}

@Override
public List<SignUp> getData() {
	List<SignUp> g=repo.findAll();
	return g;
}

}
