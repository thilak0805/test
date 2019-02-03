package org.jpa.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="exception_transaction_table")
public class ExceptionTransaction {
	

	public ExceptionTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExceptionTransaction(Long id,Integer exceptionCode, String enviroment,
			String clientId, String documentNumber, String couponNumber, Integer documentUniqueId, Integer fileId,
			String exceptionDetails, String exceptionStatus, Timestamp exceptionTime, Timestamp resolutionTime,
			Integer processId, GlobalExceptionMaster globalExceptionMaster) {
		super();
		this.id = id;
		this.exceptionCode = exceptionCode;
		this.enviroment = enviroment;
		this.clientId = clientId;
		this.documentNumber = documentNumber;
		this.couponNumber = couponNumber;
		this.documentUniqueId = documentUniqueId;
		this.fileId = fileId;
		this.exceptionDetails = exceptionDetails;
		this.exceptionStatus = exceptionStatus;
		this.exceptionTime = exceptionTime;
		this.resolutionTime = resolutionTime;
		this.processId = processId;
		this.globalExceptionMaster = globalExceptionMaster;
	}

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="exception_trans_id")
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="fk_exception_code")
	private Integer exceptionCode;
	

	@Column(name="environment")
	private String enviroment;
	
	@Column(name="client_id")
	private String clientId;
	
	@Column(name="document_number")
	private String documentNumber;
	
	@Column(name="coupon_no")
	private String couponNumber;
	
	@Column(name="document_unique_id")
	private Integer documentUniqueId;
	
	@Column(name="file_id")
	private Integer fileId;
	
	@Column(name="exception_details")
	private String exceptionDetails;
	
	@Column(name="exception_status")
	private String exceptionStatus;
	
	@Column(name="exception_time")
	private Timestamp exceptionTime;
	
	@Column(name="resolution_time")
	private Timestamp resolutionTime;
	
	@Column(name="process_id")
	private Integer processId;
	
	@ManyToOne
	@JoinColumn(name="exception_mas_id", nullable=false)
	@JsonBackReference
	private GlobalExceptionMaster globalExceptionMaster;
	
	/*
	@OneToMany(mappedBy="exceptionTransaction")
	private List<ExceptionParameterValues> exceptionParameterValues;
	*/

	
	public Integer getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(Integer exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	

	public String getEnviroment() {
		return enviroment;
	}

	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getCouponNumber() {
		return couponNumber;
	}

	public void setCouponNumber(String couponNumber) {
		this.couponNumber = couponNumber;
	}

	public Integer getDocumentUniqueId() {
		return documentUniqueId;
	}

	public void setDocumentUniqueId(Integer documentUniqueId) {
		this.documentUniqueId = documentUniqueId;
	}

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public String getExceptionDetails() {
		return exceptionDetails;
	}

	public void setExceptionDetails(String exceptionDetails) {
		this.exceptionDetails = exceptionDetails;
	}

	public String getExceptionStatus() {
		return exceptionStatus;
	}

	public void setExceptionStatus(String exceptionStatus) {
		this.exceptionStatus = exceptionStatus;
	}

	public Timestamp getExceptionTime() {
		return exceptionTime;
	}

	public void setExceptionTime(Timestamp exceptionTime) {
		this.exceptionTime = exceptionTime;
	}

	public Timestamp getResolutionTime() {
		return resolutionTime;
	}

	public void setResolutionTime(Timestamp resolutionTime) {
		this.resolutionTime = resolutionTime;
	}

	public Integer getProcessId() {
		return processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}


	public GlobalExceptionMaster getGlobalExceptionMaster() {
		return globalExceptionMaster;
	}

	public void setGlobalExceptionMaster(GlobalExceptionMaster globalExceptionMaster) {
		this.globalExceptionMaster = globalExceptionMaster;
	}
	

}
