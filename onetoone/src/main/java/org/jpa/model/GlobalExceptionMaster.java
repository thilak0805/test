package org.jpa.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="global_exception_mas")
public class GlobalExceptionMaster {
	
	public GlobalExceptionMaster() {
		super();
	}
	
	
	public GlobalExceptionMaster(Integer exceptionCode, Integer lovId, String exceptionDesc,
			String exceptionCategory, String exceptionSeverity, String exceptionCause, String expectedAction) {
		super();
		this.exceptionCode = exceptionCode;
		this.lovId = lovId;
		this.exceptionDesc = exceptionDesc;
		this.exceptionCategory = exceptionCategory;
		this.exceptionSeverity = exceptionSeverity;
		this.exceptionCause = exceptionCause;
		this.expectedAction = expectedAction;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="exception_mas_id", nullable=false, unique = true)
	private Long id;

	@Column(name="exception_code")
	private Integer exceptionCode;
	
	@Column(name="lov_id")
	private Integer lovId;
	
	@Column(name="exception_desc")
	private String exceptionDesc;
	
	@Column(name="exception_category")
	private String exceptionCategory;
	
	@Column(name="exception_severity")
	private String exceptionSeverity;
	
	@Column(name="exception_cause")
	private String exceptionCause;
	
	@Column(name="expected_action")
	private String expectedAction;
	
	@OneToMany(mappedBy="globalExceptionMaster",cascade= {CascadeType.ALL})
	 @JsonManagedReference
	private List<ExceptionTransaction> exceptionTransaction;
	
	
	public List<ExceptionTransaction> getExceptionTransaction() {
		return exceptionTransaction;
	}


	public void setExceptionTransaction(List<ExceptionTransaction> exceptionTransaction) {
		this.exceptionTransaction = exceptionTransaction;
		for(ExceptionTransaction exceptionTrans: exceptionTransaction) {
			exceptionTrans.setGlobalExceptionMaster(this);
		}
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	/*
	@OneToMany(mappedBy="globalExceptionMaster")
	private List<ExceptionParameterDefintion> exceptionParameterDefintion;*/
	
	public Integer getLovId() {
		return lovId;
	}

	public void setLovId(Integer lovId) {
		this.lovId = lovId;
	}

	public String getExceptionDesc() {
		return exceptionDesc;
	}

	public void setExceptionDesc(String exceptionDesc) {
		this.exceptionDesc = exceptionDesc;
	}

	public String getExceptionCategory() {
		return exceptionCategory;
	}

	public void setExceptionCategory(String exceptionCategory) {
		this.exceptionCategory = exceptionCategory;
	}

	public String getExceptionSeverity() {
		return exceptionSeverity;
	}

	public void setExceptionSeverity(String exceptionSeverity) {
		this.exceptionSeverity = exceptionSeverity;
	}

	public String getExceptionCause() {
		return exceptionCause;
	}

	public void setExceptionCause(String exceptionCause) {
		this.exceptionCause = exceptionCause;
	}

	public String getExpectedAction() {
		return expectedAction;
	}

	public void setExpectedAction(String expectedAction) {
		this.expectedAction = expectedAction;
	}

	public Integer getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(Integer exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	
	
	/*public List<ExceptionParameterDefintion> getExceptionParameterDefintion() {
		return exceptionParameterDefintion;
	}

	public void setExceptionParameterDefintion(List<ExceptionParameterDefintion> exceptionParameterDefintion) {
		this.exceptionParameterDefintion = exceptionParameterDefintion;
	}*/

}
