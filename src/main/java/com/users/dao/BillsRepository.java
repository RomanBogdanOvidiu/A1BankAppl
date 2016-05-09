package com.users.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.model.Bills;

@Repository
public interface BillsRepository extends JpaRepository<Bills, Integer> {

	List<Bills> findByClientId(Integer clientId);
	Bills findById(Integer id);
	Bills deleteById(Integer id);

}
