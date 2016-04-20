package com.example;

/**
 * 输出（output）
 * NO_PAID:未付款
 * HAVE_PAID:已付款
 * REFUNDING:退款中
 * REFUNDED:已退款
 */

public class Test {

	public static void main(String[] args) {
		for(int i = 0; i < PAY_STATUS.values().length; i ++) {
			System.out.println(PAY_STATUS.class.getDeclaredFields()[i].getName() + ":" + PAY_STATUS.values()[i].status);
		}
	}
}
