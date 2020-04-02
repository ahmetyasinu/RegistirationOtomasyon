package com.api.system.registration.Controller;

import com.api.system.registration.Entity.Login;
import com.api.system.registration.Service.Interface.LoginService;
import com.api.system.registration.Service.LoginDTO.LoginDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
    public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public LoginDTO loginDTO(@RequestBody LoginDTO loginDTO){
        LoginDTO loginDto =loginService.findByUserNameAndPassword(loginDTO.getUserName(),loginDTO.getUserName());
        if (loginDto==null){
            throw new RuntimeException("Şifre veya Parola hatalı.");
        }
        return loginDto;
    }

}
