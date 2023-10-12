package com.ussd;

public class OkoaOffer {
	
	Integer id;
	String type;
	String commodity;
	Integer value;
	Double duration;
	Integer cost;
	
	public OkoaOffer(
			Integer id,
			String type,
			String commodity,
			Integer value,
			Double duration,
			Integer cost
					){
		
		this.id = id;
		this.type = type;
		this.commodity = commodity;
		this.value = value;
		this.duration = duration;
		this.cost = cost;
		
	}
	Integer getId(){
		return this.id;
	}
	String getType(){
		return this.type;
	}
	String getCommodity(){
		return this.commodity;
	}
	Double getDuration(){
		return this.duration;
	}
	Integer getCost(){
		return this.cost;
	}
	

}
