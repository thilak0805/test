package org.jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="exception_parameter_defintion")
public class ExceptionParameterDefintion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="param_def_id")
	private Integer parameterDefinitionId;
	
	@Column(name="exception_code")
	private Integer exceptionCode;
	
	@Column(name="param_name")
	private String parameterName;
	
	@Column(name="param_type")
	private String parameterType;
	
	@ManyToOne
	@JoinColumn(name="fk_excep_code")
	private GlobalExceptionMaster globalExceptionMaster; 
	
	@OneToMany(mappedBy="exceptionParameterDefintion")
	private List<ExceptionParameterValues> exceptionParameterValues;
	
	public Integer getParameterDefinitionId() {
		return parameterDefinitionId;
	}

	public void setParameterDefinitionId(Integer parameterDefinitionId) {
		this.parameterDefinitionId = parameterDefinitionId;
	}

	public Integer getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(Integer exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getParameterType() {
		return parameterType;
	}

	public void setParameterType(String parameterType) {
		this.parameterType = parameterType;
	}
	
}
