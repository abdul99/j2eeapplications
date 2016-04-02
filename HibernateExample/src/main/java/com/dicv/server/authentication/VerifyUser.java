package com.dicv.server.authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

 


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

 






import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import com.dicv.server.authentication.model.DBUser;
import com.dicv.server.authentication.model.DicvPermissions;
import com.dicv.server.authentication.model.DicvUsers;
import com.dicv.server.authentication.util.HibernateUtil;

public class VerifyUser {
	
	 
	public Map<String, List<String>> userDb = new HashMap<>();
			
	
	public Map<String, List<String>> getUserDb() {
		return userDb;
	}


	public  void getAuth(Login login){
		
		List<String> userPermisssions = new ArrayList();
		
		System.out.println("Fetching the credentials from database");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		
		Query auth =   session.getNamedQuery("Users.findByuserName").setString("userName", login.getUserName());
		if(auth!=null){
			
			List<DicvUsers> authUser = auth.list();
			if(login.getPassword().equals(authUser.get(0).getPassword()) 
					&&  login.getUserName().equals(authUser.get(0).getUserName())
				){   
				
				Query permissions =   session.getNamedQuery("Permissions.findAllPermByRoleId");
			    permissions.setInteger("roleId", authUser.get(0).getRoleId());
			    List<DicvPermissions> allpermissions = permissions.list();
			    
			//    userDb.put(authUser.get(0).getUserName(), value)
			    
			    for(DicvPermissions perm: allpermissions){
			    	
			    	
			    	 System.out.println("role " + authUser.get(0).getRoleId() + " " + "permids are " + perm.getPermId());
			    	 userPermisssions.add(perm.getPermId());
			    }
			    
			    
			    userDb.put(authUser.get(0).getUserName(), userPermisssions);
				generateToken(authUser.get(0).getUserName());
			}
			
		  else {throw new IllegalArgumentException("INVALID CREDENTIALS");  }
	


		
	       }
		
		
		session.getTransaction().commit();
	
	}
	
	
	public void generateToken(String userName){
		
		String token = Jwts.builder().setSubject(userName)
        .claim("permissions", userDb.get(userName)).setIssuedAt(new Date())
        .signWith(SignatureAlgorithm.HS256, "secretkey").compact();
		System.out.println("token generated " + token);
	}
	
	 
	
}
