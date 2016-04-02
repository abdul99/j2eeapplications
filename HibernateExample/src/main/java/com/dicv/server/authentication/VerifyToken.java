package com.dicv.server.authentication;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;


public class VerifyToken {
	
	

	//Sample method to validate and read the JWT
	public void decodeToken(String token) {
	 
	Claims claims = Jwts.parser()         
	  // .setSigningKey(DatatypeConverter.parseBase64Binary(apiKey.getSecret()))
			.setSigningKey("secretkey")	
	   .parseClaimsJws(token).getBody();
	//System.out.println("ID: " + claims.getId());
	System.out.println("Subject: " + claims.getSubject());
	System.out.println("Permissions: " + claims.get("permissions").toString());
	System.out.println("Issuer: " + claims.getIssuer());
	System.out.println("Expiration: " + claims.getExpiration());
	}
	 
}
