package org.jpa.repository;

import java.util.List;
import java.util.Optional;

import org.jpa.model.GlobalExceptionMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface GlobalMasterRepository extends JpaRepository<GlobalExceptionMaster, Long>{
	
	public static final String FIND_BY_EXECEPTION_CODE="select * from global_exception_mas where exception_code=?1";
	
	public static final String DELETE_BY_EXCEPTION_MASTER_ID = "delete from global_exception_mas where exception_mas_id=?1";
	
	@Query(value = FIND_BY_EXECEPTION_CODE, nativeQuery = true)
	public List<GlobalExceptionMaster> findByExceptionCode(String exceptionCode);
	
	@Modifying
	@Transactional
	@Query(value = DELETE_BY_EXCEPTION_MASTER_ID, nativeQuery = true)
	public void deleteByExceptionMasId(Long exceptionMasId);
}
