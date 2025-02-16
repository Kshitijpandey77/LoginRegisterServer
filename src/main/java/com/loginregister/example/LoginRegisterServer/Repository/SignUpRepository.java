package com.loginregister.example.LoginRegisterServer.Repository;

import com.loginregister.example.LoginRegisterServer.Model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface SignUpRepository extends JpaRepository<SignUp,String> {
}
