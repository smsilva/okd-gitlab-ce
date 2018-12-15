package com.github.smsilva.ping.config;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("time")
@Produces(MediaType.APPLICATION_JSON)
public class PingResource {
    
    @GET
    public Response get() {
	JsonObject json = Json.createObjectBuilder()
		.add("timemillis-modified", System.currentTimeMillis())
		.build();
	
	return Response
		.ok(json)
		.build();
    }

}
