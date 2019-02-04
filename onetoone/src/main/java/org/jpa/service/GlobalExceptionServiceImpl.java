package org.jpa.service;

import java.util.List;
import java.util.Optional;

import org.jpa.model.GlobalExceptionMaster;
import org.jpa.repository.GlobalMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GlobalExceptionServiceImpl implements GlobalExceptionService {
	
	@Autowired
	GlobalMasterRepository globalMasterDAO;

	
	public GlobalExceptionMaster addGlobalExceptionMaster(GlobalExceptionMaster globalExceptionMaster) {
		System.out.println("......................2");
		return globalMasterDAO.save(globalExceptionMaster);
	}

	
	public List<GlobalExceptionMaster> getAllGlobalExceptionMaster() {
		return globalMasterDAO.findAll();
	}


	
	public List<GlobalExceptionMaster> findGlobalExceptionMasterByExceptionCode(String exceptionCode) {
		return globalMasterDAO.findByExceptionCode(exceptionCode);
	}


	
	public GlobalExceptionMaster updateGlobalExceptionMaster(int exceptionMasId, GlobalExceptionMaster globalExceptionMaster) {
		return globalMasterDAO.save(globalExceptionMaster);
	}


	
	public void deleteGlobalExceptionMasterById(Long exceptionMasId) {
		globalMasterDAO.deleteByExceptionMasId(exceptionMasId);
	}

	

}
