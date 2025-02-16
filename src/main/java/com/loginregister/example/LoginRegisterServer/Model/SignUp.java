package com.loginregister.example.LoginRegisterServer.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity(name = "sign_up")
public class SignUp {
    @Id
    @Column
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "phone_no")
    private String phoneNo;
}
