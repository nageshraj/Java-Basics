package com.wolken.wolkenapp.dao;

import java.sql.SQLException;

import com.wolken.wolkenapp.dto.MobileDTO;
import com.wolken.wolkenapp.exception.MobileException;

public interface MobileDAO {

	public void insertMobile(MobileDTO mobileDTO) throws SQLException, MobileException;

	public void displayMobile() throws SQLException;

	public void updateRamById(int ramToBeUpdated, int mobileIdToBeUpdated) throws SQLException;

	public void deleteMobileById(int mobileIdToBeDeleted) throws SQLException;

	public void deleteAll() throws SQLException;

}
