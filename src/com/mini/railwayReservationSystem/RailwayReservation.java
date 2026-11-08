package com.mini.railwayReservationSystem;

public class RailwayReservation {
	public int availableSeats = 5;
	public int[] bookedSeats = new int[5];

	public synchronized void bookedSeat(int passengerId) {
		if (availableSeats > 0) {
			for (int i = 0; i <= bookedSeats.length - 1; i++) {
				if (bookedSeats[i] == 0) {
					bookedSeats[i] = passengerId;
					System.out.println("Seat no = " + i + " is booked By : " + passengerId);
					break;
				}
			}
			availableSeats -= 1;
		} 
		else {
			try {
				throw new NoSeatAvailableException();
			} catch (NoSeatAvailableException e) {
				System.out.println(e);
			}
		}
	}

	public synchronized void cancelSeat(int passengerId) {

		boolean isTicketBooked = false;
		for (int i = 0; i <= bookedSeats.length - 1; i++) {
			if (bookedSeats[i] == passengerId) {
				isTicketBooked = true;
				bookedSeats[i] = 0;
				System.out.println("Seat no = " + i + " is canceled By : " + passengerId);
				break;
			}
		}
		if (isTicketBooked == true) {
			availableSeats += 1;
		} 
		else {
			try {
				throw new BookingNotFoundException();
			} 
			catch (BookingNotFoundException e) {
				System.out.println(e);

			}
		}
	}
}