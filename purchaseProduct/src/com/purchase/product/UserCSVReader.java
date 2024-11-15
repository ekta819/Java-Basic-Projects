package com.purchase.product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserCSVReader {
	List<User> uList = new ArrayList<User>();
	int count1 = 0;

	public List<User> getAllUsers() throws IOException {
		String uCsv = "D:\\Example Project Docs\\Product Purchase\\User.csv";
		BufferedReader br1 = null;
		String line1 = null;
		String[] temp1 = null;
		try {
			br1 = new BufferedReader(new FileReader(uCsv));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		line1 = br1.readLine();
		while ((line1 = br1.readLine()) != null) {
			temp1 = line1.split(",");
			User u = new User();
			u.setUserId(temp1[0]);
			u.setUserName(temp1[1]);
			u.setEmail(temp1[2]);
			u.setPhoneNumber(temp1[3]);
			u.setCity(temp1[4]);
			uList.add(u);
			count1++;

		}
		// System.out.println("User count : " + count1);
		return uList;

	}

}
