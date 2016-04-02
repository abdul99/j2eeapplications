package com.bosch.dicv.server;

 
 

import java.lang.reflect.InvocationTargetException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
 
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("gps")
public class GPSDataExtractor {
	
	
	
	@GET
	@Path("/load")
	@Produces("application/json")
	public Response responseMsg(
			  @QueryParam("imei") String gpsImei, @QueryParam("key") String gpsKey,@QueryParam("data") String uri) throws IllegalAccessException, InvocationTargetException {

	    	  GPSReqObj bean = new GPSReqObj();
	    	  GPSDataFormatter obj = new GPSDataFormatter(uri);
	    	  obj.createJsonObject(bean);
	    	  
		return Response.status(200).entity(bean).build();
	}
 
	
	
	
	

}
