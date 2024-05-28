package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
private	int roomNumber;
private	LocalDate checkIn;
private LocalDate checkOut;
DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");


public Reservation() {
}

public Reservation(int roomNumber, LocalDate checkIn, LocalDate checkOut) {
	this.roomNumber = roomNumber;
	this.checkIn = checkIn;
	this.checkOut = checkOut;
}
public int getRoomNumber() {
	return roomNumber;
}
public void setRoomNumber(int roomNumber) {
	this.roomNumber = roomNumber;
}
public LocalDate getCheckIn() {
	return checkIn;
}

public LocalDate getCheckOut() {
	return checkOut;
}


@Override
public String toString(){
	return "Reservation: Room "+getRoomNumber() + ", check-in: "+ checkIn.format(fmt1) + 
			", Check-out: "+ getCheckOut().format(fmt1) +", "+ duration()+" nights";
}

public long duration() {
	long diff = ChronoUnit.DAYS.between(checkIn, checkOut);
	
	return diff;
}

public void updateDates(LocalDate checkIn,LocalDate checkOut) {
	this.checkIn = checkIn;
	this.checkOut = checkOut;
}

}
