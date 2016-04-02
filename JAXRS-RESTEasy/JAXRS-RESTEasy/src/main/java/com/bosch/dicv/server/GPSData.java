package com.bosch.dicv.server;
 
import java.io.Serializable;
import java.util.Date;
import java.util.TimeZone;
import java.util.Timer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "gpsdata ")
public class GPSData implements Serializable {
 
    private static final long serialVersionUID = 1L;
    
    @XmlAttribute(name = "imei")
    private String gpsImei;
 
    @XmlElement(name = "key")
    private String gpsKey;
 
    @XmlElement(name = "dateISO")
    private String dateiso;
    
    private Date gpsDateISO;
     
    private Timer gpsTimeISO;
    
    private Date gpsDate;
    
    private Timer gpsTime;
    
    private double gpsLat;
    
    private double gpsLng;
    
    private double gpsSpkm;
    
    private double gpsAlt;
    
    private double gpsCog;
    
    private double gpsHdop;
    
    private double gpsNsat;
    
    private double gpsVolt;
    
    private double gpsIgnition;
    
    private double gpsUptime;
 
  //13/03/15,13:26:10+00[130315,13262500,48,208019,16.196690,0.19,136.10,0.00,120,6],11.87,1,12
  	// gpsDateISO,gpsTimeISO[gpsDate,gpsTime,gpsLat,gpsLng,gpsSpkm,gpsAlt,gpsCog,gpsHdop,gpsNsat],gpsVolt,gpsIgnition,gpsUptime
    
    public Date getGpsDateISO() {
		return gpsDateISO;
	}

	public void setGpsDateISO(Date gpsDateISO) {
		this.gpsDateISO = gpsDateISO;
	}

	public Timer getGpsTimeISO() {
		return gpsTimeISO;
	}

	public void setGpsTimeISO(Timer gpsTimeISO) {
		this.gpsTimeISO = gpsTimeISO;
	}

	public Date getGpsDate() {
		return gpsDate;
	}

	public void setGpsDate(Date gpsDate) {
		this.gpsDate = gpsDate;
	}

	public Timer getGpsTime() {
		return gpsTime;
	}

	public void setGpsTime(Timer gpsTime) {
		this.gpsTime = gpsTime;
	}

	public double getGpsLat() {
		return gpsLat;
	}

	public void setGpsLat(double gpsLat) {
		this.gpsLat = gpsLat;
	}

	public double getGpsLng() {
		return gpsLng;
	}

	public void setGpsLng(double gpsLng) {
		this.gpsLng = gpsLng;
	}

	public double getGpsSpkm() {
		return gpsSpkm;
	}

	public void setGpsSpkm(double gpsSpkm) {
		this.gpsSpkm = gpsSpkm;
	}

	public double getGpsAlt() {
		return gpsAlt;
	}

	public void setGpsAlt(double gpsAlt) {
		this.gpsAlt = gpsAlt;
	}

	public double getGpsCog() {
		return gpsCog;
	}

	public void setGpsCog(double gpsCog) {
		this.gpsCog = gpsCog;
	}

	public double getGpsHdop() {
		return gpsHdop;
	}

	public void setGpsHdop(double gpsHdop) {
		this.gpsHdop = gpsHdop;
	}

	public double getGpsNsat() {
		return gpsNsat;
	}

	public void setGpsNsat(double gpsNsat) {
		this.gpsNsat = gpsNsat;
	}

	public double getGpsVolt() {
		return gpsVolt;
	}

	public void setGpsVolt(double gpsVolt) {
		this.gpsVolt = gpsVolt;
	}

	public double getGpsIgnition() {
		return gpsIgnition;
	}

	public void setGpsIgnition(double gpsIgnition) {
		this.gpsIgnition = gpsIgnition;
	}

	public double getGpsUptime() {
		return gpsUptime;
	}

	public void setGpsUptime(double gpsUptime) {
		this.gpsUptime = gpsUptime;
	}

	
 
    public String getgpsImei() {
		return gpsImei;
	}

	public void setgpsImei(String imei) {
		this.gpsImei = imei;
	}

	public String getgpsKey() {
		return gpsKey;
	}

	public void setKey(String key) {
		this.gpsKey = key;
	}

	public String getDateiso() {
		return dateiso;
	}

	public void setDateiso(String dateiso) {
		this.dateiso = dateiso;
	}

	
     
}