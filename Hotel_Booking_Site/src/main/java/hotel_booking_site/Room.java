package hotel_booking_site;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="rooms")
//custom queries: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference
@NamedQuery(name = "Room.findById",
	query = "SELECT r FROM Room r WHERE room_id = ?1"
)
public class Room {
	
	@Id
	private int room_id;
	private double price_per_night;
	private int max_occupants;
	private String bed_type;
	private int number_of_beds;
	
	//These values come from the hotels_table and refer to the hotel associated
	//with the room
	/*
	private String name;
	private String street_address;
	private String city;
	private String state;
	private String country;
	private String zip_code;
	private String phone;
	*/
	
	public Room () { }

	public Room(int room_id, double price_per_night, int max_occupants, String bed_type, int number_of_beds)
	{
		super();
		this.room_id = room_id;
		this.price_per_night = price_per_night;
		this.max_occupants = max_occupants;
		this.bed_type = bed_type;
		this.number_of_beds = number_of_beds;
	}

	public int getRoom_id()
	{
		return room_id;
	}

	public void setRoom_id(int room_id)
	{
		this.room_id = room_id;
	}

	public double getPrice_per_night()
	{
		return price_per_night;
	}

	public void setPrice_per_night(double price_per_night)
	{
		this.price_per_night = price_per_night;
	}

	public int getMax_occupants()
	{
		return max_occupants;
	}

	public void setMax_occupants(int max_occupants)
	{
		this.max_occupants = max_occupants;
	}

	public String getBed_type()
	{
		return bed_type;
	}

	public void setBed_type(String bed_type)
	{
		this.bed_type = bed_type;
	}

	public int getNumber_of_beds()
	{
		return number_of_beds;
	}

	public void setNumber_of_beds(int number_of_beds)
	{
		this.number_of_beds = number_of_beds;
	};
}
