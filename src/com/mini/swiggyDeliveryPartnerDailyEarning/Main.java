package com.mini.swiggyDeliveryPartnerDailyEarning;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Delivery partner Name : ");
		String partnerName = sc.nextLine();
		System.out.println("Enter Deliveries : ");
		int deliveries = sc.nextInt();
		System.out.println("Enter Earning per day : ");
		double earningPerDelivery = sc.nextDouble();
		double totalEarning = deliveries * earningPerDelivery;

		System.out.println("Delivery Partner: " + partnerName);
		System.out.println("Deliveries Completed: " + deliveries);
		System.out.println("Earning per Delivery: " + earningPerDelivery);
		System.out.println("Total Earnings: " + totalEarning);
	}

}
