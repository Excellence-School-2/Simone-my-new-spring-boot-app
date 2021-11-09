package it.nttdata.hellospringboot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//controller per il book.html
import org.springframework.web.bind.annotation.RequestMapping;

import it.nttdata.hellospringboot.Model.Book;
import it.nttdata.hellospringboot.repository.BookRepository;

@Controller
public class BookController {
    
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository)
    {
        this.bookRepository=bookRepository;
    }


    @RequestMapping("/books")
    public String getBooks(Model model){ //il model è un oggetto di spring, un dizionario in cui andiamo a mettere le coppie chiave=valore
        model.addAttribute("books", bookRepository.findAll());//books è accessibile e possiamo passarlo al nostro book.html e ciclare tramite thymeleaf
        return "books";
    }
}
