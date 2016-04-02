package com.bosch.dicv.server;

 
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class GPSReqObj {
	
//	"gpsDateISO,gpsTimeISO[gpsDate,gpsTime,gpsLat,gpsLng,gpsSpkm,"
	//	       + "gpsAlt,gpsCog,gpsHdop,gpsNsat],gpsVolt,gpsIgnition,gpsU
	
	
	
	   @XmlAttribute(name = "gpsImei")
	    private String gpsImei;
	 
	    @XmlElement(name = "gpsKey")
	    private String gpsKey;
	 
	   
	    
	    @XmlElement(name = "gpsDateISO")
	    private String gpsDateISO;
	     
	    @XmlElement(name = "gpsTimeISO")
	    private String gpsTimeISO;
	    
	    
	    @XmlElement(name = "gpsDate")
	    private String gpsDate;
	    
	    @XmlElement(name = "gpsTime")
	    private String gpsTime;
	    
	    @XmlElement(name = "gpsLat")
	    private String gpsLat;
	    
	    @XmlElement(name = "gpsLng")
	    private String gpsLng;
	    
	    @XmlElement(name = "gpsSpkm")
	    private String gpsSpkm;
	    
	    @XmlElement(name = "gpsAlt")
	    private String gpsAlt;
	    
	    @XmlElement(name = "gpsCog")
	    private String gpsCog;
	    
	    @XmlElement(name = "gpsHdop")
	    private String gpsHdop;
	    
	    @XmlElement(name = "gpsNsat")
	    private String gpsNsat;
	    
	    @XmlElement(name = "gpsVolt")
	    private String gpsVolt;
	    
	    @XmlElement(name = "gpsIgnition")
	    private String gpsIgnition;
	    
	    @XmlElement(name = "gpsUptime")
	    private String gpsUptime;

		public String getGpsImei() {
			return gpsImei;
		}

		public void setGpsImei(String gpsImei) {
			this.gpsImei = gpsImei;
		}

		public String getGpsKey() {
			return gpsKey;
		}

		public void setGpsKey(String gpsKey) {
			this.gpsKey = gpsKey;
		}

		public String getGpsDateISO() {
			return gpsDateISO;
		}

		public void setGpsDateISO(String gpsDateISO) {
			this.gpsDateISO = gpsDateISO;
		}

		public String getGpsTimeISO() {
			return gpsTimeISO;
		}

		public void setGpsTimeISO(String gpsTimeISO) {
			this.gpsTimeISO = gpsTimeISO;
		}

		public String getGpsDate() {
			return gpsDate;
		}

		public void setGpsDate(String gpsDate) {
			this.gpsDate = gpsDate;
		}

		public String getGpsTime() {
			return gpsTime;
		}

		public void setGpsTime(String gpsTime) {
			this.gpsTime = gpsTime;
		}

		public String getGpsLat() {
			return gpsLat;
		}

		public void setGpsLat(String gpsLat) {
			this.gpsLat = gpsLat;
		}

		public String getGpsLng() {
			return gpsLng;
		}

		public void setGpsLng(String gpsLng) {
			this.gpsLng = gpsLng;
		}

		public String getGpsSpkm() {
			return gpsSpkm;
		}

		public void setGpsSpkm(String gpsSpkm) {
			this.gpsSpkm = gpsSpkm;
		}

		public String getGpsAlt() {
			return gpsAlt;
		}

		public void setGpsAlt(String gpsAlt) {
			this.gpsAlt = gpsAlt;
		}

		public String getGpsCog() {
			return gpsCog;
		}

		public void setGpsCog(String gpsCog) {
			this.gpsCog = gpsCog;
		}

		public String getGpsHdop() {
			return gpsHdop;
		}

		public void setGpsHdop(String gpsHdop) {
			this.gpsHdop = gpsHdop;
		}

		public String getGpsNsat() {
			return gpsNsat;
		}

		public void setGpsNsat(String gpsNsat) {
			this.gpsNsat = gpsNsat;
		}

		public String getGpsVolt() {
			return gpsVolt;
		}

		public void setGpsVolt(String gpsVolt) {
			this.gpsVolt = gpsVolt;
		}

		public String getGpsIgnition() {
			return gpsIgnition;
		}

		public void setGpsIgnition(String gpsIgnition) {
			this.gpsIgnition = gpsIgnition;
		}

		public String getGpsUptime() {
			return gpsUptime;
		}

		public void setGpsUptime(String gpsUptime) {
			this.gpsUptime = gpsUptime;
		}

		 
	 
	  //13/03/15,13:26:10+00[130315,13262500,48,208019,16.196690,0.19,136.10,0.00,120,6],11.87,1,12
	  	// gpsDateISO,gpsTimeISO[gpsDate,gpsTime,gpsLat,gpsLng,gpsSpkm,gpsAlt,gpsCog,gpsHdop,gpsNsat],gpsVolt,gpsIgnition,gpsUptime

}
