package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.dao.PrisonDAO;
import com.wolken.wolkenapp.dao.PrisonDAOImpl;
import com.wolken.wolkenapp.dto.PrisonDTO;

public class PrisonServiceImpl implements PrisonService {

	PrisonDAO prisonDAO = new PrisonDAOImpl();
	PrisonDTO prisonDTO = new PrisonDTO();

	@Override
	public boolean validateInputAndInsert(PrisonDTO prisonDTO) throws SQLException {

		if (prisonDTO != null) {
			System.out.println("Inside validateInputAndInsert()");
			if (prisonDTO.getPrisonId() > 0 && prisonDTO.getPrisonId() < 1000) {
				if (prisonDTO.getNoOfInmates() > 0 && prisonDTO.getNoOfInmates() < 5000) {
					prisonDAO.insert(prisonDTO);
					return true;
				}

			}

		} else {
			System.out.println("\nData is not valid, It has not been added");
			return false;
		}
		return false;
	}

	@Override
	public boolean validateAndUpdate(int idToBeUpdated, String updatedName) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("inside validateAndUpdate()");
		if (idToBeUpdated > 0 && idToBeUpdated < 1000) {
			if (updatedName.length() < 45) {
				prisonDAO.updatePrisonNameById(idToBeUpdated, updatedName);
				return true;
			} else {
				System.out.println("invalid name ");
				return false;
			}
		} else {
			System.out.println("invalid id");
			return false;
		}
	}

	@Override
	public boolean validateAndDeletebyId(int idToBeDeleted) throws SQLException {
		// TODO Auto-generated method stub
		if (idToBeDeleted > 0 && idToBeDeleted < 1000) {
			if (prisonDAO.deleteById(idToBeDeleted));
			return true;

		} else
			return false;

	}

	@Override
	public void validateAndDeleteAll() throws SQLException {
		// TODO Auto-generated method stub
		prisonDAO.deleteAllRecords();

	}

	@Override
	public void validateAndDisplay() throws SQLException {
		// TODO Auto-generated method stub
		prisonDAO.display();

	}

}
