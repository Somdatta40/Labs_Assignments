package com.capgemini.lab9;

@FunctionalInterface
public interface AuthenticationOfUsernamePassword {


	public boolean authenticate(String userName,String passWord);
}
