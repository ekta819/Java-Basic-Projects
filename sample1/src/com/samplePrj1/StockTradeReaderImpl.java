package com.samplePrj1;

interface IStockTradeReaderInterface {

	public default void method() {
		parseStockCSVLine();
	}

	private void parseStockCSVLine() {
		System.out.println("From inside interface");

	}

}

public class StockTradeReaderImpl implements IStockTradeReaderInterface {
	// IStockTradeReaderInterface.method();
}
