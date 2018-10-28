package pocs.swarm.api;

import org.modelmapper.ModelMapper;
import pocs.swarm.api.dto.BookDto;
import pocs.swarm.ejb.BookBO;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("books")
@Stateless
public class BookApi {

    @EJB
    private BookBO bookBO;
    private ModelMapper modelMapper = new ModelMapper();

    @Path("{id:\\d+}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public BookDto buscaPorId(@PathParam("id") Long id){
        return modelMapper.map( bookBO.findBook(id), BookDto.class);
    }
}
