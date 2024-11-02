package raj.yadav.java8_api.controller;

import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import DTO.FlightTicketRequest;
import raj.yadav.java8_api.model.FlightTicket;
import raj.yadav.java8_api.service.FlightTicketService;
import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class Controller {

	@Autowired
	private FlightTicketService flightTicketService ;//= new FlightTicketService();

	@PostMapping("/book")
	public FlightTicket bookFlightTicket(@RequestBody FlightTicketRequest request) {
		FlightTicket flightTicket = new FlightTicket(
				request.getPassengerName(),
				request.getPassengerEmail(),
				request.getFlightNumber(),
				request.getDepartureAirport(),
				request.getArrivalAirport(),
				request.getDepartureDate(),
				request.getPrice(),
				BookingStatus.CONFIRMED // Set the status as needed
				);

		// Save flightTicket to the database (omitted for brevity)
		return flightTicket;
	}

	@PostMapping("/addBooking")
	public void bookTicket(@RequestBody FlightTicketRequest request) {
		flightTicketService.addTicketRequest(request);
	}

	@GetMapping("/passList")
	public LinkedList<FlightTicketRequest> getAllTickets() {
		return flightTicketService.getAllTicketRequests();
	}

	@GetMapping("/priceList")
	public List<FlightTicketRequest> getFilteredTickets(
			@RequestParam double minPrice,
			@RequestParam String destination) {
		return flightTicketService.filterPassengers(minPrice, destination);
	}


	@GetMapping("/test")
	public String testApi() {
		System.out.println("Hello test...");

		return "Hello";
	}

}
