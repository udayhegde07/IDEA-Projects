package com.uday;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("json")
public class AnonymResourceJson
{
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AnonymJson getJson()
    {
        System.out.println("(JSON) GET Method Called");
        AnonymJson a = new AnonymJson();
        a.setName("Michael");
        a.setPoint(30);

        return a;
    }
}
