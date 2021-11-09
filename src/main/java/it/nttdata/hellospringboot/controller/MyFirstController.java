package it.nttdata.hellospringboot.controller;
//le classi controller in spring boot devono essere marcate con l'annotazione @controller
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
@Controller
@ResponseBody
public class MyFirstController {
    @RequestMapping("/hello")
    public String helloworld(){
        return "Hello WOORLD! This is my controller";
    }
}
