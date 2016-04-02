package com.dicv.server.authentication;

 

 

import java.util.Date;
import java.util.List;

 





import org.hibernate.Query;
import org.hibernate.Session;

import com.dicv.server.authentication.model.DBUser;
import com.dicv.server.authentication.model.DicvPermissions;
import com.dicv.server.authentication.model.DicvUsers;
import com.dicv.server.authentication.util.HibernateUtil;

public class GetToken {
	public static void main(String[] args) {
		System.out.println("Checking the user credentials from database");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		 
		
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
	}
}
