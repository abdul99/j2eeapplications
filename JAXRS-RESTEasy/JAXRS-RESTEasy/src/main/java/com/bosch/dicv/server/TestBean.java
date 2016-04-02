package com.bosch.dicv.server;

import java.lang.reflect.InvocationTargetException;

public class TestBean {

	public static void main(String[] args) {
		  String uri = "13/03/15,13:26:10+00[130315,13262500,48,208019,16.196690,0.19,136.10,120,6],11.87,1,12";
		 
          GPSDataFormatter gps = new GPSDataFormatter(uri);
          GPSReqObj bean = new GPSReqObj();
          bean.setGpsImei("imei"); bean.setGpsKey("key");
          try {
			gps.createJsonObject(bean);
			System.out.println(bean.getGpsUptime());
			System.out.println(bean.getGpsLat());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
          
	}

}
