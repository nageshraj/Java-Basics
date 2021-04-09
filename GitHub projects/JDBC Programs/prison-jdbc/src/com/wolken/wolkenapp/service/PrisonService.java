package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.dto.PrisonDTO;

public interface PrisonService {

	public boolean validateInputAndInsert(PrisonDTO prisonDTO) throws SQLException;
	
	public boolean validateAndUpdate(int idToBeUpdated,String updatedName) throws SQLException;
	
	public boolean validateAndDeletebyId(int idToBeDeleted) throws SQLException;
	
	public void validateAndDeleteAll() throws SQLException;
	
	public void validateAndDisplay() throws SQLException;
	
	
	
	
}
