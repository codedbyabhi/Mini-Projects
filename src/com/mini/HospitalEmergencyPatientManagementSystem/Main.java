package com.mini.HospitalEmergencyPatientManagementSystem;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Patients : ");
		int n = sc.nextInt();

		PriorityQueue<Patient> queue = new PriorityQueue<Patient>(new PatientPriorityComparator());

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter " + i + " Patient Id, Name, Age and Priority : ");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			int priority = sc.nextInt();

			queue.offer(new Patient(id, name, age, priority));
		}

		System.out.println("Next Patient : " + queue.peek());
		System.out.println("All Patient in-Order : ");
//		for (Patient p : queue) {
//
//			System.out.println(p);
//		}
		
		while(!queue.isEmpty()) {
			
			System.out.println(queue.poll());
		}

	}
}
