package com.mini.HospitalEmergencyPatientManagementSystem;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Patients : ");
		int n = sc.nextInt();

		PriorityQueue<Patient> queue = new PriorityQueue<Patient>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Patient Id, Name, Age and Priority : " + i);
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			int priority = sc.nextInt();

			queue.offer(new Patient(id, name, age, priority));
		}

		for (Patient p : queue) {
			
			System.out.println(p);
		}
		
		
	}
}
