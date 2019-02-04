package org.jpa.repository;

import java.util.List;

import org.jpa.model.ExceptionTransaction;
import org.jpa.model.GlobalExceptionMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExceptionTransactionRepository extends JpaRepository<ExceptionTransaction,Long>{
	
	public static final String FIND_TRANSACTION_BY_EXECEPTION_MASTER_ID="select * from exception_transaction_table where exception_mas_id=?1";
	
	@Query(value = FIND_TRANSACTION_BY_EXECEPTION_MASTER_ID, nativeQuery = true)
	public List<ExceptionTransaction> findExceptionTransactionByexceptionMasId(Long exceptionMasId);
	
	
}
