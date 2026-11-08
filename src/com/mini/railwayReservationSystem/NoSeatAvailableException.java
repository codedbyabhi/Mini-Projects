package com.mini.railwayReservationSystem;

public class NoSeatAvailableException extends Exception {

	public NoSeatAvailableException() {
		super("No seats available");
	}
}
