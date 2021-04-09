package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.dto.MobileDTO;
import com.wolken.wolkenapp.exception.MobileException;

public interface MobileService {

	public boolean validateAndInsertMobile(MobileDTO mobileDTO) throws SQLException, MobileException;

	public void validateAndDisplayMobile();

	public boolean validateAndUpdateRamById(int ramToBeUpdated, int mobileIdToBeUpdated) throws MobileException;

	public boolean validateAndDeleteMobileById(int mobileIdToBeDeleted);

	public void validateAndDeleteAll();

}
