package com.wolken.wolkenapp.raj;

import com.wolken.wolkenapp.paytm.IPaytm;

public class RajImplementation implements IPaytm {

	@Override
	public int minBooking() {
		return 4;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean insurance() {
		return true;
		// TODO Auto-generated method stub

	}

}
