package org.jpa.service;

import java.util.List;

import org.jpa.model.ExceptionTransaction;
import org.jpa.model.GlobalExceptionMaster;

public interface ExceptionTransactionService {
	
	List<ExceptionTransaction> findExceptionTransactionByexceptionMasId(Long exceptionMasId);
	
	/*List<GlobalExceptionMaster> getAllGlobalExceptionMaster();
	
	GlobalExceptionMaster addGlobalExceptionMaster(GlobalExceptionMaster globalExceptionMaster);
	
	GlobalExceptionMaster updateGlobalExceptionMaster(int exceptionMasId, GlobalExceptionMaster globalExceptionMaster);
	
	public void deleteGlobalExceptionMasterById(Long exceptionMasId);*/
}
