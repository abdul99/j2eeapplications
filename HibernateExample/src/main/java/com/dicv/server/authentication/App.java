package com.dicv.server.authentication;

import java.util.Date;
import java.util.List;

 



import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import com.dicv.server.authentication.model.DBUser;
import com.dicv.server.authentication.model.DicvPermissions;
import com.dicv.server.authentication.model.DicvUsers;
import com.dicv.server.authentication.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		/*DBUser user = new DBUser();

		user.setUserId(103);
		user.setUsername("superman2");
		user.setCreatedBy("system2");
		user.setCreatedDate(new Date());*/
		
	    Query auth =   session.getNamedQuery("Users.findByuserName").setString("userName", "XYZNANE");
	   
	    
	    
	    List<DicvUsers> authUser = auth.list();
	    System.out.println(authUser.size());
	    System.out.println(authUser.get(0).getPassword());
	    
	    Query permissions =   session.getNamedQuery("Permissions.findAllPermByRoleId");
	    permissions.setInteger("roleId", authUser.get(0).getRoleId());
	    List<DicvPermissions> allpermissions = permissions.list();
	    
	    for(DicvPermissions perm: allpermissions){
	    	
	    	
	    	 System.out.println("role " + authUser.get(0).getRoleId() + " " + "permids are " + perm.getPermId());
	    	
	    }
	    
		//session.save(user);
	 
		session.getTransaction().commit();
		
		
		Login login = new Login();
		login.setUserName("JOHN");
		login.setPassword("xyz78s");
		
		VerifyUser verify = new VerifyUser();
		verify.getAuth(login);
		 Map<String, List<String>> userDb = verify.getUserDb();
		 
	}
	
	
	 
}
