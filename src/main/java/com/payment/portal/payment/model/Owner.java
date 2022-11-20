package com.payment.portal.payment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="owner")
public class Owner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ownerid;
	
	@Column(name="balance")
	private Long balance;
	
	@Column(name="pin")
	private Long pin;

	public Owner() {
		// TODO Auto-generated constructor stub
	}

	public Owner(int ownerid,Long balance,Long pin) {
		super();
		this.ownerid = ownerid;
		this.balance = balance;
		this.pin = pin;
	}



	public int getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Long getPin() {
		return pin;
	}

	public void setPin(Long pin) {
		this.pin = pin;
	}
	
}
