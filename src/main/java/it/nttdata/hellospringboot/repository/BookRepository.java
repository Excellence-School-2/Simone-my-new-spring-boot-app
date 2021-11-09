package it.nttdata.hellospringboot.repository;
import org.springframework.data.repository.CrudRepository;

import it.nttdata.hellospringboot.Model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
    
}
