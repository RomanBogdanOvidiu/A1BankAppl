package com.users.service;

import java.util.List;

import com.users.model.Bills;

public interface BillsService {

	List<Bills> findByClientId(Integer clientId);
	Bills findById(Integer id);
	Bills deleteById(Integer id);
	void deleteBill(Bills b);
}
