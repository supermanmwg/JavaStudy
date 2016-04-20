package com.example;

public enum PAY_STATUS {
	NO_PAID("未付款"), HAVE_PAID("已付款"),REFUNDING("退款中"),REFUNDED("已退款");
	
	public String status;
	

	PAY_STATUS(String s) {
		status = s;
	}

}
