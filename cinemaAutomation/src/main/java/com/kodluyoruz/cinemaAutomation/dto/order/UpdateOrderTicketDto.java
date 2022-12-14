package com.kodluyoruz.cinemaAutomation.dto.order;


	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public class UpdateOrderTicketDto {

	    private int row;

	    private int seat;

	    private double price;

	    private Long movieId;

	}


