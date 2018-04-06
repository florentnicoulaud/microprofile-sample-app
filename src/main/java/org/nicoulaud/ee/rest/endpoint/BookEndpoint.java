package org.nicoulaud.ee.rest.endpoint;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.nicoulaud.ee.rest.domain.Book;

@Path("books")
@Produces(MediaType.APPLICATION_JSON)
public class BookEndpoint {

    @GET
    public Response all() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Carrie"));
        books.add(new Book("Christine"));
        books.add(new Book("Misery"));
        books.add(new Book("It"));
        books.add(new Book("The Shining"));
        books.add(new Book("The Long Walk"));
        return Response.ok(books).build();
    }

}
