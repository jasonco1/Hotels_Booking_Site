package hotel_booking_site;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotels_table")
public class Hotel {
	
	@Id
	private int id;
	private String name;
	private String street_address;
	private String city;
	private String state;
	private String country;
	private String zip_code;
	private String phone;
	private int number_of_stars;
	private String image;
	private double average_rating;
	private String amenities;
	private String landmarks;
	
	public Hotel() { }

	public Hotel(int id, String name, String street_address, String city, String state, String country, String zip_code,
	      String phone, int number_of_stars, String image, double average_rating, String amenities, String landmarks)
	{
		super();
		this.id = id;
		this.name = name;
		this.street_address = street_address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip_code = zip_code;
		this.phone = phone;
		this.number_of_stars = number_of_stars;
		this.image = image;
		this.average_rating = average_rating;
		this.amenities = amenities;
		this.landmarks = landmarks;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getStreet_address()
	{
		return street_address;
	}

	public void setStreet_address(String street_address)
	{
		this.street_address = street_address;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getZip_code()
	{
		return zip_code;
	}

	public void setZip_code(String zip_code)
	{
		this.zip_code = zip_code;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public int getNumber_of_stars()
	{
		return number_of_stars;
	}

	public void setNumber_of_stars(int number_of_stars)
	{
		this.number_of_stars = number_of_stars;
	}

	public String getImage()
	{
		return image;
	}

	public void setImage(String image)
	{
		this.image = image;
	}

	public double getAverage_rating()
	{
		return average_rating;
	}

	public void setAverage_rating(double average_rating)
	{
		this.average_rating = average_rating;
	}

	public String getAmenities()
	{
		return amenities;
	}

	public void setAmenities(String amenities)
	{
		this.amenities = amenities;
	}

	public String getLandmarks()
	{
		return landmarks;
	}

	public void setLandmarks(String landmarks)
	{
		this.landmarks = landmarks;
	}

}