package hotel_booking_site.domain;

public class BookingInfo {
	
	public Booking booking;
	public Room room;
	public Hotel hotel;
	
	public BookingInfo(Booking booking, Room room, Hotel hotel) {
		this.booking = booking;
		this.room = room;
		this.hotel = hotel;
	}

}
