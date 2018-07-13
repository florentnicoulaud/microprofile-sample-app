package org.nicoulaud.java.ee.rest.endpoint;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.nicoulaud.java.ee.domain.Book;
import org.nicoulaud.java.ee.repository.BookRepository;
import org.slf4j.Logger;

@Stateless
@Path("books")
@Produces(MediaType.APPLICATION_JSON)
public class BookEndpoint {

    @Inject
    private Logger logger;

    @Inject
    private BookRepository bookRepository;

    @GET
    public Response all() {
        List<Book> results = this.bookRepository.findAll();
        logger.info("get all: " + results.size());
        return Response.ok(results).build();
    }

    @GET
    @Path("{id}")
    public Response one(@PathParam("id") int id) {
        logger.info("get one: " + id);
        return Response.ok(this.bookRepository.getOne(id)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Book book) {
        this.bookRepository.save(book);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") int id) {
      this.bookRepository.delete(this.bookRepository.getOne(id));
      return Response.status(Response.Status.NO_CONTENT).build();
    }

}
