package it.nttdata.hellospringboot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titolo;
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "author_id") //Questa modifica ci consente di gestire la navigabilità dall'altro lato
    private Author author;

    //implemento costruttori: vuoto e con parametri

    public Book(){

    }

    public Book(String titolo, String isbn){
        this.titolo=titolo;
        this.isbn=isbn;
    }

    public Author getAuthor()
    {
        return this.author;
    }

    public String getTitolo()
    {
        return titolo;
    }
    public String getIsbn(){
        return isbn;
    }

    public Long getId(){
        return this.id;
    }

    public void setTitolo(String titolo)
    {
        this.titolo=titolo;
    }

    public void setIsbn(String isbn)
    {
        this.isbn=isbn;
    }

    public void setAuthor(Author author)
    {
        this.author=author;
    }

    public void setId(Long id){
        this.id=id;
    }
}
