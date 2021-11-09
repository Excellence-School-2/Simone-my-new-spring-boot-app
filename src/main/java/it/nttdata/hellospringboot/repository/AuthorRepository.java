package it.nttdata.hellospringboot.repository;
import org.springframework.data.repository.CrudRepository;

import it.nttdata.hellospringboot.Model.Author;
//questa entity è un interfaccia che non definiamonoi totalemtne ma estende un qualcosa che si chiama CrudRepository
public interface AuthorRepository extends CrudRepository<Author, Long>{ //a crud passo il tipo dell'oggetto e il tipo dell'id e fa tutto solo
    
}
