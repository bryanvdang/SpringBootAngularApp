package com.linkedin.learning.rest;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.linkedin.learning.model.request.ReservationRequest;
import com.linkedin.learning.response.ReservationResponse;

@RestController
@RequestMapping(ResourceConstants.ROOM_RESERVATION_V1)
public class ReservationResource {

	
	@RequestMapping(path="", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	//this will return a ResponseEntity containing a ReservationResponse
	//this method will take in two parameters, a local date object, an iso date format called checkin, and a local date object in iso date format called checkout
	public ResponseEntity<ReservationResponse> getAvailableRooms(
			@RequestParam(value = "checkin")
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
			LocalDate checkin,
			@RequestParam(value = "checkout")
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
			LocalDate checkout){
		
		
		return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
		//contains an empty ReservationResponse and the HTTP status code of 200 OK.
	}
	//Add a method that will allow us to reserve a room
	//Returns a response entity and a 201 created status code
	//The parameter will be called reservationRequest, which is a request body
	//reservation request is a class which will represent the request body which is sent during a post. 
	@RequestMapping(path="", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ReservationResponse> createReservation(
			@RequestBody
			ReservationRequest reservationRequest){
		
		return new ResponseEntity<>(new ReservationResponse(), HttpStatus.CREATED);
	}
	//UPDATE
	@RequestMapping(path="", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ReservationResponse> updateReservation(
			@RequestBody
			ReservationRequest reservationRequest){
		
		return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
	}
	//DELETE
	@RequestMapping(path = "/{reservationId}", method = RequestMethod.DELETE )
	public ResponseEntity<Void> deleteReservation(
			@PathVariable
			long reservationId){
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
