package com.mini.railwayReservationSystem;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		RailwayReservation rr = new RailwayReservation();
		for (int i = 101; i <= 106; i++) {
			new Passenger(rr, i, "Book").start();
		}

		Passenger p1 = new Passenger(rr, 102, "Cancel");
		p1.start();
		Thread.sleep(2000);

		Passenger p2 = new Passenger(rr, 999, "Cancel");
		p1.start();
		Thread.sleep(2000);
		System.out.println("Available seates = " + rr.availableSeats);
	}
}
