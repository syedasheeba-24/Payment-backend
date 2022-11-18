package com.payment.portal.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.payment.portal.payment.model.Beneficiary;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Integer> {
	
	//@Query("SELECT u FROM Beneficiary u WHERE u.account = ?1")
	//Beneficiary findBeneficiaryByAccountNumber(Long accountNumber);

}
