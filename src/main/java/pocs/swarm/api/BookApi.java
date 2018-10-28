package pocs.swarm.api;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger logger = LoggerFactory.getLogger(BookApi.class);

    @Path("{id:\\d+}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public BookDto buscaPorId(@PathParam("id") Long id){
        logger.info("Recebida requisicao id: {}", id);

        return modelMapper.map( bookBO.findBook(id), BookDto.class);
    }
}
