package com.purchase.product;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class myMain {

	public static void main(String[] args) throws IOException {

		/*
		 * UserCSVReader ur = new UserCSVReader(); List<User> user = ur.getAllUsers();
		 * for (User u : user) { System.out.println(u); } ProductCSVReader pr = new
		 * ProductCSVReader(); List<Product> product = pr.getAllProducts();
		 * 
		 * for (Product p : product) { System.out.println(p); }
		 */
		String uid, pCat;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserId : ");
		uid = sc.nextLine();
		System.out.println("Enter Product Category : ");
		pCat = sc.nextLine();
		ProductAvailabilityService pas = new ProductAvailabilityService();
		// List<Product> productsInCityOfUser = pas.getAllProductForUser(uid);
		// System.out.println("Size of productsInCityOfUser : " +
		// productsInCityOfUser.size());
		/*
		 * System.out.println("List of products in the City where the User lives : ");
		 * for (Product p : productsInCityOfUser) { System.out.println(p); }
		 */
		List<Product> productWithCategory = pas.getAllProductForUserForCategory(uid, pCat);
		System.out.println("List of products Matching the User's City and Category : ");
		for (Product p : productWithCategory) {
			System.out.println(p);
		}
	}

}
