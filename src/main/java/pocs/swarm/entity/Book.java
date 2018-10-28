package pocs.swarm.entity;

public class Book {
    private Long id;

    public Book(Long id) {
        this.id = id;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
