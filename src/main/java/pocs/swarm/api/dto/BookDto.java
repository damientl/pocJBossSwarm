package pocs.swarm.api.dto;

public class BookDto {
    private Long id;

    public BookDto(Long id) {
        this.id = id;
    }

    public BookDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
