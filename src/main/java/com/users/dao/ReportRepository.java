package com.users.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report ,Integer> {
	

}
