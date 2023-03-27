package com.brainmentors.banking.users;

public class UserRegisteration {
	void doRegister() {
		User user = new User();
		System.out.println(user.acc_no);
		System.out.println(user.name);
		System.out.println(user.email);
		System.out.println(user.date);
		System.out.println(user.balance);
		//System.out.println(user.password);
	}
}
