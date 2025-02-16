package com.loginregister.example.LoginRegisterServer.Controller;

import com.loginregister.example.LoginRegisterServer.Model.*;
import com.loginregister.example.LoginRegisterServer.Service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class SignUpController {

    @Autowired
    SignUpService signUpService;

    @GetMapping("/signUpDetails/{email}")
    public SignUp getSignUpData(@PathVariable String email ){
        return signUpService.getSignUpData(email).orElseThrow();
    }

    @GetMapping("/signUpDetails")
    public List<SignUp> getAllSignUpData(){
        return signUpService.getAllSignUpData();
    }

    @PostMapping("/signUpDetails")
    public HttpStatus postSignUpData(@RequestBody SignUp signUp){
        signUpService.saveSignUpData(signUp);
        return HttpStatus.OK;
    }
}
