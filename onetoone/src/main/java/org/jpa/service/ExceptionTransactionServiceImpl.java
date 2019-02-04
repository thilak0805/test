package org.jpa.service;

import java.util.List;

import org.jpa.model.ExceptionTransaction;
import org.jpa.repository.ExceptionTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExceptionTransactionServiceImpl implements ExceptionTransactionService{
	
	@Autowired
	private ExceptionTransactionRepository exceptionTransactionRepository;

	@Override
	public List<ExceptionTransaction> findExceptionTransactionByexceptionMasId(Long exceptionMasId) {
		System.out.println("exceptionMasId>>> "+exceptionMasId);
		return exceptionTransactionRepository.findExceptionTransactionByexceptionMasId(exceptionMasId);
	}

}
