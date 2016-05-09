package com.users.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.dao.BillsRepository;
import com.users.model.Bills;
import com.users.service.BillsService;

@Service
public class BillsServiceImpl implements BillsService{

	@Autowired
	private BillsRepository billsRepository;
	
	@Override
	public List<Bills> findByClientId(Integer clientId) {
		return billsRepository.findByClientId(clientId);
	}

	@Override
	public Bills deleteById(Integer id) {
		return billsRepository.deleteById(id);
	}

	@Override
	public Bills findById(Integer id) {
		// TODO Auto-generated method stub
		return billsRepository.findById(id);
	}

	@Override
	public void deleteBill(Bills b) {
		billsRepository.delete(b);
	}

}
