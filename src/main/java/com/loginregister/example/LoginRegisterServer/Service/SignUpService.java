package com.loginregister.example.LoginRegisterServer.Service;

import com.loginregister.example.LoginRegisterServer.Model.*;
import com.loginregister.example.LoginRegisterServer.Repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class SignUpService {
    @Autowired
    SignUpRepository signUpRepository;

    public void saveSignUpData(SignUp signUp){
        signUpRepository.save(signUp);
    }

    public Optional<SignUp> getSignUpData(String email){
        return signUpRepository.findById(email);
    }

    public List<SignUp> getAllSignUpData(){
        return signUpRepository.findAll();
    }
}
