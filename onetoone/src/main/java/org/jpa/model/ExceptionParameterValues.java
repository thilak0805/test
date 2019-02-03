package org.jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="exception_parameter_values")
public class ExceptionParameterValues {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="param_value_id")
	private Integer paramValueId;
	
	@Column(name="trans_id")
	private Integer transactionId;
	
	@Column(name="param_def_id")
	private Integer parameterDefinitionId;
	
	@ManyToOne
	@JoinColumn(name="fk_param_def_id")
	private ExceptionParameterDefintion exceptionParameterDefintion;


	@ManyToOne
	@JoinColumn(name="fk_exception_trans_id")
	private ExceptionTransaction exceptionTransaction;
	
	
	public ExceptionTransaction getExceptionTransaction() {
		return exceptionTransaction;
	}

	public void setExceptionTransaction(ExceptionTransaction exceptionTransaction) {
		this.exceptionTransaction = exceptionTransaction;
	}

	public ExceptionParameterDefintion getExceptionParameterDefintion() {
		return exceptionParameterDefintion;
	}

	public void setExceptionParameterDefintion(ExceptionParameterDefintion exceptionParameterDefintion) {
		this.exceptionParameterDefintion = exceptionParameterDefintion;
	}

	

	
	public Integer getParamValueId() {
		return paramValueId;
	}

	public void setParamValueId(Integer paramValueId) {
		this.paramValueId = paramValueId;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getParameterDefinitionId() {
		return parameterDefinitionId;
	}

	public void setParameterDefinitionId(Integer parameterDefinitionId) {
		this.parameterDefinitionId = parameterDefinitionId;
	}
	
	
}
