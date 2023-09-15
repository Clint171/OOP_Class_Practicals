package com.main;

public class Record {
	//Record object attributes
	Integer qty;
	String itemDescription;
	Integer unitPrice;
	Double amount;
	public Record(Integer qty,String itemDescription,Integer unitPrice) {
		this.qty = qty;
		this.itemDescription = itemDescription;
		this.unitPrice = unitPrice;
		this.amount = (double)qty * (double)unitPrice;
	}
	public Integer getQty(){
		return this.qty;
	}
	public String getItemDescription(){
		return this.itemDescription;
	}
	public Integer getUnitPrice(){
		return this.unitPrice;
	}
	public Double getAmount(){
		return this.amount;
	}
	

}
