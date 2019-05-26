package com.edu.isp;

public interface Configuration extends LoginInformation {

	void removeUser(String userNames);

	boolean isValideUser(String userName);
}
