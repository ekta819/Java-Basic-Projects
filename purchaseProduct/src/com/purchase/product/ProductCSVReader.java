package com.purchase.product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductCSVReader {
	List<Product> pList = new ArrayList<Product>();
	int count2 = 0;

	public List<Product> getAllProducts() throws IOException {
		String pCsv = "D:\\Example Project Docs\\Product Purchase\\Product.csv";
		String line2;
		String[] temp2;
		BufferedReader br2 = null;
		try {
			br2 = new BufferedReader(new FileReader(pCsv));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		br2.readLine();
		while ((line2 = br2.readLine()) != null) {
			Product p = new Product();
			temp2 = line2.split(",");
			p.setProductId(temp2[0]);
			p.setProductName(temp2[1]);
			p.setProductCategory(temp2[2]);
			p.setPrice(Double.parseDouble(temp2[3]));
			p.setAvailableCity(Arrays.asList(temp2[4]));
			pList.add(p);
			count2++;
			// System.out.println(p);
		}
		//System.out.println("Product count : " + count2);
		return pList;

	}

}
