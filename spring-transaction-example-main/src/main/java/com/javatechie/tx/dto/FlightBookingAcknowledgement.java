package com.javatechie.tx.dto;

import com.javatechie.tx.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class FlightBookingAcknowledgement {

    private String status;
    private double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
    
	public FlightBookingAcknowledgement(String status, double totalFare, String pnrNo, PassengerInfo passengerInfo) {
		super();
		this.status = status;
		this.totalFare = totalFare;
		this.pnrNo = pnrNo;
		this.passengerInfo = passengerInfo;
	}
    
    
}
