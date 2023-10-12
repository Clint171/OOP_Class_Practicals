package com.ussd;

import java.util.List;
import java.util.Optional;

public class Menu {
	
	Integer id;
	OkoaOffer[] offers;
	Integer parentMenu;
	Integer childMenu;
	
	public Menu(
			Integer id,
			OkoaOffer[] offers,
			Integer parentMenu,
			Integer childMenu
			
			){
		this.id = id;
		this.offers = offers;
		this.parentMenu = parentMenu;
		this.childMenu = childMenu;
		
	}
	public Menu(){}
	public void addOffer(OkoaOffer[] offers){
		try{
		this.offers = offers;
		}
		catch(NullPointerException e1){
			System.out.println("Error updating menu: "+ e1);
		}
	}

}
