package com.wolken.wolkenapp;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.wolken.wolkenapp.dto.MobileDTO;
import com.wolken.wolkenapp.exception.MobileException;
import com.wolken.wolkenapp.service.MobileService;
import com.wolken.wolkenapp.service.MobileServiceImpl;

public class MobileUtil {

	public static void main(String[] args) throws MobileException {
		
		

		MobileDTO mobileDTO = new MobileDTO();
		MobileService mobileService = new MobileServiceImpl();

		while (true) {
			System.out.println(
					"\n1: Insert new Mobile \n2: Display all records \n3: Update MobileName by ID \n4: Delete by ID \n5: Delete all records \n6:Exit");
			System.out.println("\n Enter choice");
			Scanner sc = new Scanner(System.in);

			int option = sc.nextInt();

			switch (option) {
			case 1:
				try {
					System.out.println("Enter Mobile Id: ");
					int mobileId = sc.nextInt();

					System.out.println("Enter Mobile Name: ");
					String mobileName = sc.next();

					System.out.println("Enter Mobile Brand: ");
					String mobileBrand = sc.next();

					System.out.println("Enter Mobile RAM: ");
					int mobileRam = sc.nextInt();

					System.out.println("Enter Number of camera: ");
					int mobileNoOfCamera = sc.nextInt();

					mobileDTO.setMobileId(mobileId);
					mobileDTO.setMobileName(mobileName);
					mobileDTO.setMobileBrand(mobileBrand);
					mobileDTO.setMobileRam(mobileRam);
					mobileDTO.setMobileNoOfCamera(mobileNoOfCamera);

					boolean isAddSuccessful = false;

					try {
						isAddSuccessful = mobileService.validateAndInsertMobile(mobileDTO);
						if (isAddSuccessful)
							System.out.println("Mobile added successfully");
						else
							System.out.println("Mobile not added");
						break;
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} catch (InputMismatchException i) {
					System.out.println("You have tried to input values which are incompatible. Kindly try again");
				}

			case 2:
				try {
					mobileService.validateAndDisplayMobile();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 3:
				int mobileIdToBeUpdated = 0;
				int ramToBeUpdated = 0;
				try {
					System.out.println("\nEnter the Id of Mobile you want to update: ");
					mobileIdToBeUpdated = sc.nextInt();

					System.out.println("Enter the new RAM of Mobile: ");
					ramToBeUpdated = sc.nextInt();
				} catch (InputMismatchException e) {
					e.printStackTrace();
				}

				try {
					boolean isSuccessfulUpdate = mobileService.validateAndUpdateRamById(ramToBeUpdated,
							mobileIdToBeUpdated);
					if (isSuccessfulUpdate)
						System.out.println("Update has been successful");
					else
						System.out.println("Update has not been successful");
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

				break;

			case 4:
				System.out.println("Enter the MobileId of the prison you want to delete");
				int mobileIdToBeDeleted = sc.nextInt();
				try {
					boolean isDeleteSuccess = mobileService.validateAndDeleteMobileById(mobileIdToBeDeleted);
					if (isDeleteSuccess)
						System.out.println("Delete has been successful");
					else
						System.out.println("Delete has not been successful");
				} catch (Exception e) {
					e.printStackTrace();
				}

				break;

			case 5:
				System.out.println("Deleting all records permanantly");
				try {
					mobileService.validateAndDeleteAll();
				} catch (Exception e) {
					// TODO: handle exception
					e.getStackTrace();
				}
				break;

			case 6:
				System.out.println("Exiting now..");
				System.exit(0);

			}

		}

	}

}
