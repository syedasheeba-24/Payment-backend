package com.payment.portal.payment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="beneficiary")
public class Beneficiary {
	
	@Column(name="beneficiaryid")
	private int beneficiaryId;
	
	@Column(name="accountnumber")
	private long accountNumber;
	
	@Column(name="beneficiaryname")
	private String beneficiaryName;

	public Beneficiary() {
		// TODO Auto-generated constructor stub
	}

	public Beneficiary(int beneficiaryId, long accountNumber, String beneficiaryName) {
		super();
		this.beneficiaryId = beneficiaryId;
		this.accountNumber = accountNumber;
		this.beneficiaryName = beneficiaryName;
	}

	public int getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	
	

}
