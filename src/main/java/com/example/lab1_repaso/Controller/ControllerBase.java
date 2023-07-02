package com.example.lab1_repaso.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ControllerBase {


    @GetMapping(value = "/login")
    private String abrirLogin(){


        return "login";
    }


    @GetMapping(value = "/inicio")
    private String inicio(){
        return "inicio";
    }



}
