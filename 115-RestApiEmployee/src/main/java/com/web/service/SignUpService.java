package com.web.service;

import java.util.List;

import com.web.model.SignUp;

public interface SignUpService {
public SignUp saveData(SignUp signup);
public List<SignUp> getData();
}
