public class Reservation
{
	private String guestName;
	private int roomNumber;

	public Reservation(String guestName, int roomNumber)
	{
		this.guestName = guestName;
		this.roomNumber = roomNumber;
	}

	int getRoomNumber() { return this.roomNumber; }

	String getName() { return this.guestName; }
}