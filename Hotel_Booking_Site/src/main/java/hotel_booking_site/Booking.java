package hotel_booking_site;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="bookings")
public class Booking {
	
	@Id
	private int id;
	private int room_id;
	private double total_price;
	private String check_in_date;
	private String check_out_date;
	private int number_occupants;
	
	public Booking () { }

	public Booking(int room_id, double total_price, String check_in_date, String check_out_date,
	      int number_occupants)
	{
		super();
		this.room_id = room_id;
		this.total_price = total_price;
		this.check_in_date = check_in_date;
		this.check_out_date = check_out_date;
		this.number_occupants = number_occupants;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getRoom_id()
	{
		return room_id;
	}

	public void setRoom_id(int room_id)
	{
		this.room_id = room_id;
	}

	public double getTotal_price()
	{
		return total_price;
	}

	public void setTotal_price(double total_price)
	{
		this.total_price = total_price;
	}

	public String getCheck_in_date()
	{
		return check_in_date;
	}

	public void setCheck_in_date(String check_in_date)
	{
		this.check_in_date = check_in_date;
	}

	public String getCheck_out_date()
	{
		return check_out_date;
	}

	public void setCheck_out_date(String check_out_date)
	{
		this.check_out_date = check_out_date;
	}

	public int getNumber_occupants()
	{
		return number_occupants;
	}

	public void setNumber_occupants(int number_occupants)
	{
		this.number_occupants = number_occupants;
	}

}
