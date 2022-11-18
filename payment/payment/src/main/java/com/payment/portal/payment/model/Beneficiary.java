package com.payment.portal.payment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="beneficiary")
public class Beneficiary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int beneficiaryid;
	
	@Column(name="accountnumber")
	private Long accountNumber;
	
	@Column(name="beneficiaryname")
	private String beneficiaryName;
	
	@Column(name="balance")
	private Long balance;

	public Beneficiary() {
		// TODO Auto-generated constructor stub
	}

	public Beneficiary(int beneficiaryid, Long accountNumber, String beneficiaryName,Long balance) {
		super();
		this.beneficiaryid = beneficiaryid;
		this.accountNumber = accountNumber;
		this.beneficiaryName = beneficiaryName;
		this.balance= balance;
	}

	public int getbeneficiaryid() {
		return beneficiaryid;
	}

	public void setbeneficiaryid(int beneficiaryid) {
		this.beneficiaryid = beneficiaryid;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

}
