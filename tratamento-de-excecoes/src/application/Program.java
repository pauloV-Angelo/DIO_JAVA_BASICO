package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Reservation;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Room number: ");
		int room = sc.nextInt();
		sc.nextLine();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate d01 = LocalDate.parse(sc.nextLine(),fmt1);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate d02 = LocalDate.parse(sc.nextLine(),fmt1);
		
		Reservation reservation = new Reservation(room,d01,d02);
		System.out.println(reservation);
		
		System.out.println();
		
		System.out.println("Enter data to update the reservation:");
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate d03 = LocalDate.parse(sc.nextLine(),fmt1);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate d04 = LocalDate.parse(sc.nextLine(),fmt1);
		
		reservation.updateDates(d03,d04);
		System.out.println(reservation);

		sc.close();
	}

}
