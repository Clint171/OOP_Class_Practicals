package com.ussd;

public class OkoaOffer {
	
	Integer id;
	Type type;
	Commodity commodity;
	Double duration;
	Integer cost;
	
	public OkoaOffer(
			Integer id,
			Type type,
			Commodity commodity,
			Double duration,
			Integer cost
					){
		
		this.id = id;
		this.type = type;
		this.commodity = commodity;
		this.duration = duration;
		this.cost = cost;
		
	}
	Integer getId(){
		return this.id;
	}
	Type getType(){
		return this.type;
	}
	Commodity getCommodity(){
		return this.commodity;
	}
	Double getDuration(){
		return this.duration;
	}
	Integer getCost(){
		return this.cost;
	}
	

}
