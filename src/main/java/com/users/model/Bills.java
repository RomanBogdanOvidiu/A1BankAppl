package com.users.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "bills", catalog = "bank")
public class Bills {

	@Id
	@SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false, length = 45)
	private int id;

	private String billName;

	private double billCost;

	private int clientId;

	// @ManyToOne
	// @JoinColumn(name = "clientid")
	// private Client client;

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	//
	// public Client getClient() {
	// return client;
	// }
	// public void setClient(Client client) {
	// this.client = client;
	// }
	public double getBillCost() {
		return billCost;
	}

	public void setBillCost(double billCost) {
		this.billCost = billCost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}

}
