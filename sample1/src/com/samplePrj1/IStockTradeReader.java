package com.samplePrj1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IStockTradeReader {

	int count = 0;
	String line;
	String[] temp = null;
	List<StockTrade> domainList = new ArrayList<>();

	public List<StockTrade> readStockTrades() throws StockTradeInValidFormatException, Exception {
		// To Read File
		String csv = "C:\\\\Users\\\\91629\\\\Downloads\\\\CISCO2.csv";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(csv));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		line = br.readLine();
		while ((line = br.readLine()) != null) {
			temp = line.split(",");// gives string array
			StockTrade d = new StockTrade();
			d.setSec(temp[0]);
			Date date = new SimpleDateFormat("MM/dd/yyyy").parse(temp[1]);
			d.setDate(date);
			d.setOpen(Double.parseDouble(temp[2]));
			d.setHigh(Double.parseDouble(temp[3]));
			d.setLow(Double.parseDouble(temp[4]));
			d.setClose(Double.parseDouble(temp[5]));
			d.setVol(Double.parseDouble(temp[6]));
			d.setAdjClose(Double.parseDouble(temp[7]));
			domainList.add(d);
			// System.out.println(d);
			// System.out.println();
			count++;

		}
		System.out.println(domainList.size());
		// System.out.println("Total number of rows = " + count);
		br.close();
		return domainList;
	}

	public StockTrade getMaxVolumeTrade(List<StockTrade> domainList) {
		double volMax = 0;
		StockTrade maxList = new StockTrade();
		for (StockTrade l : domainList) {
			if (l.getVol() > volMax) {
				volMax = l.getVol();
				maxList = l;
			}
		}
		// System.out.println("Object having maximum volume : \n" + maxList);
		return maxList;
	}

	public StockTrade getMinVolumeTrade(List<StockTrade> domainList) {
		double volMin = domainList.get(0).getVol();
		StockTrade minList = new StockTrade();
		for (StockTrade l : domainList) {
			if (l.getVol() < volMin) {
				volMin = l.getVol();
				minList = l;
			}
		}
		return minList;

	}

	public Map<Date, Double> getDailyTradingDifferential(List<StockTrade> domainList) {
		Map<Date, Double> m = new HashMap<>();
		double diff = 0;
		// StockTrade st = new StockTrade();
		for (StockTrade l : domainList) {
			diff = (l.getHigh() - l.getOpen());
			m.put(l.getDate(), diff);
		}
		System.out.println("Size of Map is : " + m.size());
		// System.out.println(m);
		return m;
	}

}