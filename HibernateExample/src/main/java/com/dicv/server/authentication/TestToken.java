package com.dicv.server.authentication;

public class TestToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VerifyToken tokensign = new VerifyToken();
		tokensign.decodeToken("token");

	}

}
