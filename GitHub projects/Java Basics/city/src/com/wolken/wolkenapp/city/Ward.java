package com.wolken.wolkenapp.city;

import com.wolken.wolkenapp.city.dto.WardDTO;

public class Ward {

	public WardDTO[] wardDTO;
	public int index;

	public Ward(int size) {
		wardDTO = new WardDTO[size];

	}

	public void addWard(WardDTO wardDTO) {
		if (wardDTO != null)
			this.wardDTO[index++] = wardDTO;
		else
			System.out.println("Data contains NULL values");
	}

	public void getWard() {
		System.out.println("The details of the wards are: \n");
		
		for (int i = 0; i < wardDTO.length; i++) {
			if(wardDTO[i] != null)
			System.out.println(wardDTO[i].getWardNo() + " " + wardDTO[i].getWardName() + " "
					+ wardDTO[i].getCorporator() + " " + wardDTO[i].getAreaInSquareKms());
		}
	}

	public void updateCorporatorByWardNo(int wardNo, String corporator) {
		for (int i = 0; i < wardDTO.length; i++) {
			if (this.wardDTO[i] != null) {
				if(this.wardDTO[i].getWardNo() == wardNo) 
					this.wardDTO[i].setCorporator(corporator);
				
			}
			else
				System.out.println("Ward number does not exist");
		}

	}
	
	public void deleteWardByWardName(String wardName) {
		for(int i=0;i<wardDTO.length;i++) {
			if(this.wardDTO[i]!=null) {
				if(this.wardDTO[i].getWardName().equalsIgnoreCase(wardName))
					this.wardDTO[i]=null;
			}
			else
				System.out.println("Ward Name does not exist");
		}
	}
}
