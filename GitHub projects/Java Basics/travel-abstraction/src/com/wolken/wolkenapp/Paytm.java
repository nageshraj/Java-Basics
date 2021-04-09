package com.wolken.wolkenapp;

import com.wolken.wolkenapp.paytm.IPaytm;
import com.wolken.wolkenapp.raj.RajImplementation;

public class Paytm {
	
	IPaytm iPaytm;
	
	public Paytm() {
		this.iPaytm = new RajImplementation();
	}

		public void acceptBooking()
		{
			int min = iPaytm.minBooking();
			boolean insure = iPaytm.insurance();
			if(min> 0 && min<10) {
				if(insure)
					System.out.println("Booking is successfully confirmed");
				else
					System.out.println("Booking not confirmed");
			
			}
			else
				System.out.println("Booking not confirmed");
				
		}
}
