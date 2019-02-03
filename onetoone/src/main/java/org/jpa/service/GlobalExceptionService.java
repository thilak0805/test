package org.jpa.service;

import java.util.List;
import java.util.Optional;

import org.jpa.model.GlobalExceptionMaster;
import org.springframework.stereotype.Service;


public interface GlobalExceptionService {
	
	List<GlobalExceptionMaster> getAllGlobalExceptionMaster();
	
	GlobalExceptionMaster addGlobalExceptionMaster(GlobalExceptionMaster globalExceptionMaster);
	
	GlobalExceptionMaster updateGlobalExceptionMaster(int exceptionMasId, GlobalExceptionMaster globalExceptionMaster);
	
	List<GlobalExceptionMaster> findGlobalExceptionMasterByExceptionCode(String exceptionCode);
	
	public void deleteGlobalExceptionMasterById(Long exceptionMasId);
}
