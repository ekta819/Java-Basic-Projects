package com.samplePrj1;

import java.util.Map;

public class Stk {

	public static void main(String[] args) throws StockTradeInValidFormatException, Exception {
		IStockTradeReader istr = new IStockTradeReader();
		Map m;
		istr.readStockTrades();
		StockTrade maxVolList = istr.getMaxVolumeTrade(istr.domainList);
		System.out.println("Stock having maximum volume : \n" + maxVolList);
		StockTrade minVolList = istr.getMinVolumeTrade(istr.domainList);
		System.out.println("Stock having minimum volume : \n" + minVolList);
		m = istr.getDailyTradingDifferential(istr.domainList);
		System.out.println(m);
		// StockTradeReaderImpl impl = new StockTradeReaderImpl();
		// impl.parseStockCSVLine();

	}

}
