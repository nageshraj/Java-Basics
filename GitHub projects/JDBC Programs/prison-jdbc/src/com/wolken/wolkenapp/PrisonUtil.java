package com.wolken.wolkenapp;

import java.sql.SQLException;
import java.util.Scanner;

import com.wolken.wolkenapp.dto.PrisonDTO;
import com.wolken.wolkenapp.service.PrisonService;
import com.wolken.wolkenapp.service.PrisonServiceImpl;

public class PrisonUtil {
	public static void main(String[] args) throws SQLException {

		PrisonService prisonservice = new PrisonServiceImpl();

		boolean run = true;
		while (run) {

			System.out.println(
					"\n1: Insert 2: Display 3: Update Name by ID 4: Delete by ID 5: Delete all records 6:Exit");
			System.out.println("\n Enter choice");
			PrisonDTO prisonDTO = new PrisonDTO();
			Scanner sc= new Scanner(System.in);

			int option = sc.nextInt();
			//System.out.println("==================================================================" + option);
			switch (option) {
			case 1:				
				try {
					System.out.println("Enter prison Id: ");
					int prisonId = sc.nextInt();

					System.out.println("Enter prison Name: ");
					String prisonName = sc.next();

					System.out.println("Enter number of inmate: ");
					int noOfInmates = sc.nextInt();

					System.out.println("Enter prison Area: ");
					String prisonArea = sc.next();

					System.out.println("Enter prison State: ");
					String prisonState = sc.next();


					prisonDTO.setPrisonId(prisonId);
					prisonDTO.setPrisonName(prisonName);
					prisonDTO.setNoOfInmates(noOfInmates);
					prisonDTO.setPrisonArea(prisonArea);
					prisonDTO.setPrisonState(prisonState);

					boolean isValid = prisonservice.validateInputAndInsert(prisonDTO);
					if (isValid)
						System.out.println("The data entered is valid, adding to DB");
					else {
						System.out.println("The data entered is not valid");

					}
					break;
				} catch (Exception e) {
					e.getStackTrace();
					System.out.println(e.getMessage());
				}

				

			case 2:
				try {
					prisonservice.validateAndDisplay();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 3:

				System.out.println("\nEnter the Id of prison you want to update: ");
				int idToBeUpdated = sc.nextInt();

				System.out.println("Enter the new prison name");
				String updatedName = sc.next();
				try {
					boolean isSuccessfulUpdate = prisonservice.validateAndUpdate(idToBeUpdated, updatedName);
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
				System.out.println("Enter the PrisonId of the prison you want to delete");
				int prisonIdtoBeDeleted = sc.nextInt();
				try {
					boolean isDeleteSuccess = prisonservice.validateAndDeletebyId(prisonIdtoBeDeleted);
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
					prisonservice.validateAndDeleteAll();
				} catch (Exception e) {
					// TODO: handle exception
					e.getStackTrace();
				}

			case 6:
				run=false;
				//Connect.closeConnection();
				//System.exit(0);

			}
		}
	}
}
