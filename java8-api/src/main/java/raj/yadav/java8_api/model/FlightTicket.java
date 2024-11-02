package raj.yadav.java8_api.model;



import java.util.Date;

import common.RandomIdGenerator;
import raj.yadav.java8_api.controller.BookingStatus;

//@Entity
//@Table(name = "flight_tickets")
public class FlightTicket {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;
    private String passengerEmail;
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    
    //@Temporal(TemporalType.DATE)
    private Date departureDate;

    private Double price;

  //  @Enumerated(EnumType.STRING)
    private BookingStatus status;

    // Constructors
    public FlightTicket() {
    }

    public FlightTicket(String passengerName, String passengerEmail, String flightNumber,
                        String departureAirport, String arrivalAirport, Date departureDate,
                        Double price, BookingStatus confirmed) {
        this.passengerName = passengerName;
        this.passengerEmail = passengerEmail;
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDate = departureDate;
        this.price = price;
        this.status = confirmed;
     this.id= RandomIdGenerator.generateRandomId();   
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerEmail() {
        return passengerEmail;
    }

    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}


