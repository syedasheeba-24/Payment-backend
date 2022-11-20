package com.payment.portal.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payment.portal.payment.model.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer>{

}
