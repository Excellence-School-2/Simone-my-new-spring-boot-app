package it.nttdata.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import it.nttdata.hellospringboot.repository.AuthorRepository;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;
    
    public AuthorController(AuthorRepository authorRepository){
            this.authorRepository=authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthor(Model model){
        model.addAttribute("authors",authorRepository.findAll());
        return "authors"; //nome del file che passiamo all'html
    }
}
