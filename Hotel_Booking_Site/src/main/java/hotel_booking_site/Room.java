package hotel_booking_site;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="rooms")
//custom queries: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference
//https://www.javaguides.net/2018/11/spring-data-jpa-namednativequery-namednativequeries-example.html
@NamedNativeQuery(name = "Room.findByCityName",
	query = "SELECT r.id, r.hotel_id, r.price_per_night, r.max_occupants, r.bed_type, r.number_of_beds FROM rooms r JOIN hotels_table h ON r.hotel_id = h.id WHERE h.city = ?1 ORDER BY h.name",
			resultClass = Room.class)
			
public class Room {
	
	@Id
	private int id;
	private int hotel_id;
	private double price_per_night;
	private int max_occupants;
	private String bed_type;
	private int number_of_beds;
	
	public Room () { }

	public Room(int id, int hotel_id, double price_per_night, int max_occupants, String bed_type, int number_of_beds)
	{
		super();
		this.id = id;
		this.hotel_id = hotel_id;
		this.price_per_night = price_per_night;
		this.max_occupants = max_occupants;
		this.bed_type = bed_type;
		this.number_of_beds = number_of_beds;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getHotel_id()
	{
		return hotel_id;
	}

	public void setHotel_id(int hotel_id)
	{
		this.hotel_id = hotel_id;
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
	}

}
