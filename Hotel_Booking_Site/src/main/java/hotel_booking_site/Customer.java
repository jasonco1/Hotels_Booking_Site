package hotel_booking_site;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	
	@Id
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private double current_balance;
	
	public Customer () { }

	public Customer(String first_name, String last_name, String email, String password, double current_balance)
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.current_balance = current_balance;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getFirst_name()
	{
		return first_name;
	}

	public void setFirst_name(String first_name)
	{
		this.first_name = first_name;
	}

	public String getLast_name()
	{
		return last_name;
	}

	public void setLast_name(String last_name)
	{
		this.last_name = last_name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public double getCurrent_balance()
	{
		return current_balance;
	}

	public void setCurrent_balance(double current_balance)
	{
		this.current_balance = current_balance;
	}
	
}
