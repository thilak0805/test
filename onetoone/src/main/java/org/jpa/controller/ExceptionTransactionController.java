package org.jpa.controller;

import java.util.List;

import org.jpa.model.ExceptionTransaction;
import org.jpa.repository.ExceptionTransactionRepository;
import org.jpa.service.ExceptionTransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionTransactionController {
	
	private static final Logger logger = LoggerFactory
            .getLogger(ExceptionTransactionController.class);
	
	@Autowired
	private ExceptionTransactionService exceptionTransactionService;
	
	
	@RequestMapping(value="/master/exceptions/transactions/{exceptionMasId}", method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findExceptionTransactionByexceptionMasId(@PathVariable(value="exceptionMasId")
	Long exceptionMasId) {
		System.out.println("exceptionMasId>>"+exceptionMasId);
		List<ExceptionTransaction> exceptionTransaction = exceptionTransactionService.findExceptionTransactionByexceptionMasId(exceptionMasId);
		return new ResponseEntity<>(exceptionTransaction,HttpStatus.OK);
	}
	
	

}
