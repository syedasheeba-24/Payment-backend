package com.payment.portal.payment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.portal.payment.model.Beneficiary;
import com.payment.portal.payment.model.Owner;
import com.payment.portal.payment.repository.BeneficiaryRepository;
import com.payment.portal.payment.repository.OwnerRepository;


@RestController
@RequestMapping("/pay")
public class PaymentController {
	
	@Autowired
	BeneficiaryRepository beneficiaryRepository;
	
	@Autowired
	OwnerRepository ownerRepository;
	
	@PostMapping("/create")
	public Beneficiary createBeneficiary(@RequestBody Beneficiary beneficiary) {
		return beneficiaryRepository.save(beneficiary);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteBeneficiary(@PathVariable Integer id) {
		 beneficiaryRepository.deleteById(id);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Beneficiary> getBeneficiary(@PathVariable long id) {
		 return beneficiaryRepository.findById((int)id);
	}
	
	@GetMapping("/getAll")
	public List<Beneficiary> getAllBeneficiary() {
		 return beneficiaryRepository.findAll();
	}
	
	@GetMapping("/getOwner")
	public Owner getBalance() {
		 return ownerRepository.findAll().get(0);
	}
	
	@PutMapping("/update")
	public void updateBeneficiary(@RequestBody Beneficiary beneficiary) {
		beneficiaryRepository.save(beneficiary);
	}
	
	@CrossOrigin
	@PutMapping("/updateOwner")
	public void updateOwner(@RequestBody Owner owner) {
		ownerRepository.save(owner);
	}
	

}
