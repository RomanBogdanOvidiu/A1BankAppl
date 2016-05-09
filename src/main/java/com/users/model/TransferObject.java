package com.users.model;

public class TransferObject {

	private int clientId;
	private double amount;
	private String destAccountNo;
	private String srcAccountNo;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDestAccountNo() {
		return destAccountNo;
	}

	public void setDestAccountNo(String destAccountNo) {
		this.destAccountNo = destAccountNo;
	}

	public String getSrcAccountNo() {
		return srcAccountNo;
	}

	public void setSrcAccountNo(String srcAccountNo) {
		this.srcAccountNo = srcAccountNo;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

}
