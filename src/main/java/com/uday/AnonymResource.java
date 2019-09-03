package com.uday;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("anonyms")
public class AnonymResource
{
    AnonymRepository ar = new AnonymRepository();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Anonym> getAnonym()
    {
        System.out.println("GET Method Called");
        return ar.getAnonymsList();
    }

    @GET
    @Path("anonym/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Anonym getAnonym(@PathParam("id") String id)
    {
        return ar.getAnonym(id);
    }

    @POST
    @Path("anonym")
    public Anonym createAnonym(Anonym an)
    {
        System.out.println(an);
        ar.create(an);
        return an;
    }
}
