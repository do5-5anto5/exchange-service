package br.com.do55anto5.controllers;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.do55anto5.model.Exchange;

@RestController
@RequestMapping("exchange-service")
public class ExchangeController {

	@GetMapping(value = "/{amount}/{from}/{to}")
	public Exchange getExchange(
			@PathVariable("amount") BigDecimal amount,
			@PathVariable("from") String from,
			@PathVariable("to") String to
			) {
		return new Exchange(1L, from, to, BigDecimal.ONE, BigDecimal.ONE, "PORT 8000");
	}
}
