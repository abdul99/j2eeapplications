package com.bosch.dicv.server;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class GPSDataFormatter {
	
	public String gpsurl;
	public static String gpsmapper = 
			
			"gpsDateISO,gpsTimeISO[gpsDate,gpsTime,gpsLat,gpsLng,gpsSpkm,"
			       + "gpsAlt,gpsCog,gpsHdop,gpsNsat],gpsVolt,gpsIgnition,gpsUptime"; 
	
	public static String delims = "[\\[\\],]+";
	public static String[] gpsurlparams;
	public  String[] gpsurlvalues;
	
	//13/03/15,13:26:10+00  [130315,13262500,48,    208019,16.196690,0.19,  136.10,120,6],11.87,1,12
	// gpsDateISO,gpsTimeISO[gpsDate,gpsTime,gpsLat,gpsLng,gpsSpkm,  gpsAlt,gpsCog,gpsHdop,gpsNsat],gpsVolt,gpsIgnition,gpsUptime
	 
	 
 

	static {
		
		gpsurlparams = gpsmapper.split(delims);
	}
	
	
	      GPSDataFormatter(String uri){
	    	  
	    	  this.gpsurl = uri;
	    	  gpsurlvalues = gpsurl.split(delims);
	    	   
	    	  
	    	  
	      }
	     
	     
	      
	      public void createJsonObject(GPSReqObj bean) throws IllegalAccessException, InvocationTargetException{
	    	  
	    	    for (int i = 0; i < gpsurlvalues.length; i++) {
	    	    	
	    	    	System.out.println(gpsurlparams[i] + ":" + gpsurlvalues[i]);
	    	    	System.out.println(gpsurlvalues[i]);
	    	    	BeanUtils.setProperty(bean, gpsurlparams[i], gpsurlvalues[i]);
	    	    }
	    	    	
	    	    }
	     
	      
	      
	      
	      
	  

}


