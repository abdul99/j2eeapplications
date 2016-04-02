package com.daimler;

import java.util.StringTokenizer;

public class Demo1 {

	 
	   static String in2 = "2345,100+00[567.00,789.90,jkl,mkl],20,200.00,400"
			   
			   ;
		
		static String in = "title=Java-Samples;" + 
				"author=Emiley J;" + 
				"publisher=java-samples.com;" ;

		private static int[] intArray;
			//	"copyright=2007;"; 
				public static void main(String args[]) { 
				StringTokenizer st = new StringTokenizer(in2, "[]"); 
				while(st.hasMoreTokens()) { 
			//	String key = st.nextToken(); 
				String val = st.nextToken(); 
				System.out.println("key" + "\t" + val); 
				getValues(val);
				} 
				} 

			public static void	   getValues(String st2)  {
				
				StringTokenizer st = new StringTokenizer(st2, ",");
				
				while(st.hasMoreTokens()) { 
					//	String key = st.nextToken(); 
						String val = st.nextToken(); 
						System.out.println("key" + "\t" + val); 
				
			}
			
				
				String str = "This is a sentence.  This is a question, right?  Yes!  It is.";
				String delims = "[\\[\\],\\+]+";
				String[] tokens = in2.split(delims);
				System.out.println(tokens.toString());
				for (int i = 0; i < tokens.length; i++) {
			         
			         System.out.println(tokens[i]);
			      }
				
			}
	

}
