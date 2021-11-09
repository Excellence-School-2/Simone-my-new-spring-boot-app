package it.nttdata.hellospringboot.bootstrap;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import it.nttdata.hellospringboot.repository.AuthorRepository;
import it.nttdata.hellospringboot.repository.BookRepository;

import org.springframework.boot.CommandLineRunner;

import it.nttdata.hellospringboot.Model.Author;

import it.nttdata.hellospringboot.Model.Book;

@Component
public class DataBootstrap implements CommandLineRunner{
    
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    //@Autowired //mi serve un oggetto che implementa quest'interfacia. Questo dico a spring. POsso anche non scriverlo perché SPring è configurato per cercare di farlo in automatico
    public DataBootstrap(AuthorRepository authorRepository,BookRepository bookRepository){
        this.authorRepository=authorRepository;
        this.bookRepository=bookRepository;
    }


    @Override
    public void run(String...args) throws Exception{
        Author carlo = new Author("Carlo","Carlo1");

        Book book1 = new Book("Il mio primo libro","123-abc");
        //associo al libro un autore

        book1.setAuthor(carlo);
        Book book2 = new Book("Il mio secondo libro","124-asd");
        book2.setAuthor(carlo);
        //SALVO NEL DB. UTILIZZO IL REPOSITORY.Lo crea spring 
        //nell'operazione di save, l'ordine è importante. Perchè tra le due entita c'è ne sta una piu forte. L'autore in questo caso è piu forte perché il libro non puo esistere senza l'autore (per come l'abbiamo modellato)
        authorRepository.save(carlo); //gli passo una entity da salvare
        //devo salvare anche il libro
        bookRepository.save(book1);
        bookRepository.save(book2);

        //H2 DATABASE  ci offre anche una browser-based console application
        //abilitiamo la console di gestione nel file application properties
    
        //authorRepository.findById(1); ricerca del db
    }
}
