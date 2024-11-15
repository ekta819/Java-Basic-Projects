package com.purchase.product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductAvailabilityService {

	private List<Product> productList;
	private List<User> userList;

	// constructor
	ProductAvailabilityService() throws IOException {
		// 1.) Call UserCSVReader.getAllUsers and set the returned List<User> in the
		// userList instance variable
		UserCSVReader ur = new UserCSVReader();
		userList = ur.getAllUsers();
		// 2.) Call ProductCSVReader.getAllProducts and set the returned List<Product>
		// in the productList instance variable
		ProductCSVReader pr = new ProductCSVReader();
		productList = pr.getAllProducts();

	}

	public List<Product> getAllProductForUser(String uid) {
		// get the user from the instance variable userList for the given userId
		String ucity = null;
		int c1 = 0, c2 = 0;
		List<Product> prodListCity = new ArrayList<Product>();
		for (User u : userList) {
			if (uid.equals(u.getUserId())) {
				// get the city of the Selected User
				ucity = u.getCity();
				break;

			}
			c1++;
		}
		// Iterate over the productList and find all those products that are available
		// in city of the user
		System.out.println("User City is : " + ucity);
		for (Product p : productList) {
			List<String> line = p.getAvailableCity();
			String str = line.get(0);
			String[] arr = str.split("/");
			for (int i = 0; i < arr.length; i++) {
				if (ucity.equals(arr[i])) {
					prodListCity.add(p);
				}
			}

		}
		// System.out.println("Value of C1 : " + c1 + "\nValue of C2 : " + c2);
		return prodListCity;

	}

	public List<Product> getAllProductForUserForCategory(String userId, String productCategory) {
		// call getAllProductForUser(userId) this will give all the product in the user
		// city
		List<Product> userProductList = getAllProductForUser(userId);
		List<Product> categoryProductList = new ArrayList<Product>();

		// iterate over the list and find those product which matches the given category
		for (Product p : userProductList) {
			if (productCategory.equals(p.getProductCategory())) {
				categoryProductList.add(p);
			}
		}
		return categoryProductList;
	}

}
