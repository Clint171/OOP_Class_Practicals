package com.ussd;

import java.util.List;

public class User {
	
	Integer id;
	List<OkoaOffer> okoaOffers;
	Integer debt;
	
	public User(
			
			Integer id,
			List<OkoaOffer> okoaOffers
			
			){
		this.id = id;
		this.okoaOffers = okoaOffers;
		setDebt(okoaOffers);
		
	}
	void setDebt(List<OkoaOffer> offers){
		this.debt = 0;
		offers.forEach(offer->{
			this.debt += offer.cost;
		});
	}
	
}
