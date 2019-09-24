package org.jb.stockpile;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class StockpileResource {

    @GET
    //@Path("/hel")
    @Produces(MediaType.TEXT_PLAIN)
    public String getDocuments() {
        return "hello";
    }
}