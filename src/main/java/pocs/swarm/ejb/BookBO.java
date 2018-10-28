package pocs.swarm.ejb;

import pocs.swarm.entity.Book;

import javax.ejb.Stateless;

@Stateless
public class BookBO {
    public Book findBook(Long id){
        return new Book(id);
    }
}
