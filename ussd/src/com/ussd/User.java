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
		this.debt = setDebt(okoaOffers);
		
	}
	Integer setDebt(List<OkoaOffer> offers){
		Integer debt = 0;
		offers.forEach(offer->{
			debt += offer.cost;
		});
		return debt;
	}
	
}
