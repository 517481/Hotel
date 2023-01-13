class Main {

	public static void main(String[] args) {
		Hotel hotel = new Hotel(3);

		Reservation thor = hotel.requestRoom("thor");
		Reservation daub = hotel.requestRoom("daub");
		Reservation bob = hotel.requestRoom("bob");
		hotel.requestRoom("joe");
		hotel.requestRoom("biden");

		hotel.printWaitlist();

		hotel.cancelAndReassign(daub);
		hotel.cancelAndReassign(bob);
		hotel.printRooms();

	}
}