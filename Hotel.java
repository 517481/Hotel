import java.util.*;

public class Hotel
{
	private Reservation[] rooms;
	private ArrayList<String> waitList;


	public Hotel(int roomCount)
	{
		rooms = new Reservation[roomCount];
		waitList = new ArrayList<String>();
	}
	
	public Reservation requestRoom(String guestName)
	{
		for (int i = 0; i < rooms.length; ++i)
		{
			if (rooms[i] == null)
			{
				Reservation reservation = new Reservation(guestName, i);
				rooms[i] = reservation;
				return reservation;
			}
		}
		waitList.add(guestName);
		return null;
	}

	public Reservation cancelAndReassign(Reservation res)
	{
 		rooms[res.getRoomNumber()] = null;
		if (!waitList.isEmpty())
		{
			rooms[res.getRoomNumber()] = new Reservation(waitList.get(0), res.getRoomNumber());
			waitList.remove(0);
		}
		return null;
	}

	void printRooms()
	{
		for (int i = 0; i < rooms.length; ++i)
		{
			if (rooms[i] == null)
				System.out.println(i + ": ");
			else
				System.out.println(i + ": " + rooms[i].getName() + ", " + rooms[i].getRoomNumber());
		}
	}

	void printWaitlist()
	{
		System.out.println("Waitlist:");
		for (String name : waitList)
		{
			System.out.println(name);		
		}

	}

	Reservation[] getRooms()
	{
		return rooms;
	}
	
}