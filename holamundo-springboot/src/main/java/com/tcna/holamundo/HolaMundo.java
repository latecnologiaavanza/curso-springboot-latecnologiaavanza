package com.tcna.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class HolaMundo {

    @GetMapping
    @ResponseBody
    public String mostrarMensaje3(){
        return "Hola Mundo por defecto";
    }

    @GetMapping("/holamundo1")
    @ResponseBody
    public String mostrarMensaje1(){
        return "Hola Mundo en Spring Boot 1";
    }

    @GetMapping("/holamundo2")
    @ResponseBody
    public String mostrarMensaje2(){
        return "Hola Mundo en Spring Boot 2";
    }

}
