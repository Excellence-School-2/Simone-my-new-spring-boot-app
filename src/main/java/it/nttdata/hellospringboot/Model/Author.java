package it.nttdata.hellospringboot.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;
import java.util.HashSet;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;
    private String lastName;

    @OneToMany(mappedBy = "author")  //entity ingloba il bean ,avremmo dovuto mettere il bean ma entity fa da solo e quindi inseriamo mappedyby = "author" author è il nome del bean
    private Set<Book> bookSet = new HashSet<>();


    //costruttori: vuoto e con parametri

    public Author(){}

    public Author(String name,String lastName)
    {
        this.name=name;
        this.lastName=lastName;
    }


    public Long getId()
    {
        return this.id;
    }

    public Set<Book> getBookSet(){
        return this.bookSet;
    }

    public String getName()
    {
        return name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }

    public void setId(Long id)
    {
        this.id=id;
    }

    public void setBookSet(Set<Book> bookSet)
    {
        this.bookSet=bookSet;
    }
}
