##Database design

The database for Hotel_Booking_Site is designed with 5 tabled as follows:
  hotels_table: Contains all descriptive, location and contact data necessary for a hotel.
  rooms: Aside from necessary descriptive data, each room is associated with a hotel_id.
  customers:Upon account creation, customer information is added to the table.
  bookings: After finalizing a booking, all relevant search criteria, calculated total price, 
            associated customer_id and room_id are inserted to the table.
  package_bookings: Equivalent to bookings table, reserved for package bookings only.

#Database tables
Use the .sql script file to create tables and populate the starting database if needed

create a new database named hotels. Then use these scripts to create the tables

USE hotels; #create database as 'hotels'

CREATE TABLE rooms( 
	id INT NOT NULL AUTO_INCREMENT,
    hotel_id INT, 
    price_per_night DOUBLE, 
    max_occupants INT,
    bed_type VARCHAR(20),
    number_of_beds INT,
    PRIMARY KEY (id)
    )
    
CREATE TABLE hotels_table(
	id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
    street_address VARCHAR(200),
    city VARCHAR(50),
    state VARCHAR(20),
    country VARCHAR(50),
    zip_code VARCHAR(10),
    phone VARCHAR(15),
    number_of_stars INT,
    image VARCHAR(200),
    average_rating DOUBLE,
    amenities VARCHAR(200),
    landmarks VARCHAR(200),
    PRIMARY KEY (id)
    )

CREATE TABLE bookings (
	id INT NOT NULL AUTO_INCREMENT,
    room_id INT,
    customer_id INT,
    total_price DOUBLE,
    check_in_date DATE,
    check_out_date DATE,
    number_occupants INT,
    PRIMARY KEY (id)
    )

USE hotels; #create database as 'hotels'
CREATE TABLE package_bookings (
	id INT NOT NULL AUTO_INCREMENT,
    room_id INT,
    customer_id INT,
    total_price DOUBLE,
    check_in_date DATE,
    check_out_date DATE,
    number_occupants INT,
    PRIMARY KEY (id)
    )

USE hotels; #create database as 'hotels'
CREATE TABLE customers (
	id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100),
    current_balance INT,
    PRIMARY KEY (id)
    )

#Test data
INSERT INTO `hotels_table` VALUES 
(1,'Caesars Palace','3570 Las Vegas Boulevard South','Las Vegas','Nevada','USA','89109','(866) 227-5938',4,NULL,4,'Bathroom','Las Vegas Strip'),
(2,'The Cosmopolitan','3708 Las Vegas Vlvd','Las Vegas','Nevada','USA','89109','(702) 698-7000',5,NULL,5,'Casino','Las Vegas Strip');

INSERT INTO `rooms` VALUES 
(1,1,79,1,'Queen',1),
(2,1,99,3,'Queen',1),
(3,1,98,4,'Queen',2),
(4,1,105,4,'Queen',2),
(5,1,100,2,'Single',2),
(6,1,105,4,'King',1),
(7,2,99,3,'Queen',1),
(8,2,105,4,'Queen',2),
(9,2,100,2,'Single',2),
(10,2,100,2,'Single',2),
(11,2,110,4,'King',1),
(12,2,110,4,'King',1);

