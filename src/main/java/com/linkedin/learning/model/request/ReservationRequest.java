package com.linkedin.learning.model.request;

import java.time.LocalDate;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

public class ReservationRequest {

	private Long id;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate checkin;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate checkout;
		
	//parameter list constructor
	public ReservationRequest() {
		super();
	}

	public ReservationRequest(Long id, LocalDate checkin, LocalDate checkout) {
		super();
		this.id = id;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getCheckin() {
		return checkin;
	}
	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}
	public LocalDate getCheckout() {
		return checkout;
	}
	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}
	
	
}
