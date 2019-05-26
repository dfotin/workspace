package com.edu.isp;

public class RegisterService {

	public static void main(String[] args) {
		RegisterService rs = new RegisterService();
		rs.registerUser(implementConfiguration());

		rs.registerUser(implementLoginInformation());
	}


	public void registerUser(LoginInformation configuration) {

		System.out.println("Account: " + configuration.getAccount());
		System.out.println("User name: " + configuration.getName());

	}

	private static Configuration implementConfiguration() {
		return new Configuration() {
			@Override
			public String getAccount() {
				return "TestAccount";
			}

			@Override
			public String getName() {
				return "TestName";
			}

			@Override
			public String getPsw() {
				return "pwd";
			}

			@Override
			public void removeUser(String userNames) {

			}

			@Override
			public boolean isValideUser(String userName) {
				return false;
			}
		};
	}

	private static LoginInformation implementLoginInformation() {
		return new LoginInformation() {
			@Override
			public String getAccount() {
				return "TestAccount";
			}

			@Override
			public String getName() {
				return "TestName";
			}

			@Override
			public String getPsw() {
				return "pwd";
			}
		};
	}
}
