package raj.yadav.java8_api.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import DTO.FlightTicketRequest;


@Service
@ComponentScan
public class FlightTicketService {
    private LinkedList<FlightTicketRequest> ticketRequests = new LinkedList<>();

    public void addTicketRequest(FlightTicketRequest request) {
        ticketRequests.add(request);
    }

    public LinkedList<FlightTicketRequest> getAllTicketRequests() {
        return ticketRequests;
    }


    public List<FlightTicketRequest> filterPassengers(double minPrice, String destination) {
        return ticketRequests.stream()
                .filter(request -> request.getPrice() > minPrice &&
                                  destination.equalsIgnoreCase(request.getArrivalAirport()))
                .collect(Collectors.toList());
    }
}
