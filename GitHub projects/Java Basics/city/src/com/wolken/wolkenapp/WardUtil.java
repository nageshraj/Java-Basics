package com.wolken.wolkenapp;
import java.util.Scanner;
import com.wolken.wolkenapp.city.Ward;
import com.wolken.wolkenapp.city.dto.WardDTO;

public class WardUtil {
	public static void main(String a[]) {
		Scanner sc= new Scanner(System.in);
	//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number of wards");
		int size = sc.nextInt();
		
		Ward ward = new Ward(size);
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Ward Number");
			int wardNo = sc.nextInt();
			
			System.out.println("Enter the Ward Name");
			String wardName = sc.next();
			
			System.out.println("Enter the Corporator Name");
			String corporator = sc.next();
			
			System.out.println("Enter Area in Square KiloMeters");
			double areaInSquareKms = sc.nextDouble();
			
			WardDTO wardDTO = new WardDTO();
			
			wardDTO.setWardNo(wardNo);
			wardDTO.setWardName(wardName);
			wardDTO.setCorporator(corporator);
			wardDTO.setAreaInSquareKms(areaInSquareKms);
			
			ward.addWard(wardDTO);
		
		
		}
		// Display wards
		ward.getWard();
		
		//Update corporator by wardNo
		System.out.println("Enter ward number to update:");
		int tempWardNo = sc.nextInt();
		System.out.println("Enter new corporator");
		String tempCorporator = sc.next();
		ward.updateCorporatorByWardNo(tempWardNo,tempCorporator);
		
		ward.getWard();
		
		//delete ward by wardName
		System.out.println("Enter Ward name to delete");
		String tempWardName = sc.next();
		ward.deleteWardByWardName(tempWardName);
		ward.getWard();
		
		sc.close();
		
		}
}
