package com.payment.portal.payment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.payment.portal.payment.model.Beneficiary;
import com.payment.portal.payment.repository.BeneficiaryRepository;


@Controller
@RequestMapping("/")
public class PaymentController {
	
	@Autowired
	BeneficiaryRepository beneficiaryRepository;
	
	
	
	@PostMapping
	public Beneficiary createBeneficiary(@RequestBody Beneficiary beneficiary) {
		return beneficiaryRepository.save(beneficiary);
	}
	
	/*@PutMapping
	public Beneficiary updateBeneficiary(@RequestBody Beneficiary beneficiary) {
		return beneficiaryRepository.save(beneficiary);
	}*/
	
	@DeleteMapping
	public void deleteBeneficiary(@RequestBody Beneficiary beneficiary) {
		 beneficiaryRepository.delete(beneficiary);
	}
	
	@GetMapping
	public Optional<Beneficiary> getBeneficiary(@PathVariable int id) {
		 return beneficiaryRepository.findById(id);
	}
	
	@GetMapping
	public List<Beneficiary> getAllBeneficiary() {
		 return beneficiaryRepository.findAll();
	}
	
	@GetMapping
	public long getBalance() {
		 beneficiaryRepository.findAll().get(0).getB
	}

}
