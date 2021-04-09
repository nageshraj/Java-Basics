package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.dao.MobileDAO;
import com.wolken.wolkenapp.dao.MobileDAOImpl;
import com.wolken.wolkenapp.dto.MobileDTO;
import com.wolken.wolkenapp.exception.MobileException;

public class MobileServiceImpl implements MobileService {

	MobileDAO mobileDAO = new MobileDAOImpl();

	@Override
	public boolean validateAndInsertMobile(MobileDTO mobileDTO) throws SQLException, MobileException {
		try {
			if (mobileDTO != null) {

				if (mobileDTO.getMobileId() > 0 && mobileDTO.getMobileId() < 1000) {
					if (mobileDTO.getMobileRam() % 2 == 0) {
						mobileDAO.insertMobile(mobileDTO);
						System.out.println("Mobile details are valid");
						return true;

					}
					return false;
				}

				return false;

			}

		} catch (NullPointerException n) {
			n.printStackTrace();

		}
		return false;

	}

	@Override
	public void validateAndDisplayMobile() {

		try {
			mobileDAO.displayMobile();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean validateAndUpdateRamById(int ramToBeUpdated, int mobileIdToBeUpdated) throws MobileException {
		if (ramToBeUpdated > 0 && ramToBeUpdated < 1000) {
			if (mobileIdToBeUpdated > 0 && mobileIdToBeUpdated < 1000) {
				try {
					mobileDAO.updateRamById(ramToBeUpdated, mobileIdToBeUpdated);
					System.out.println("RAM successfully updated");
					return true;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		return false;
	}

	@Override
	public boolean validateAndDeleteMobileById(int mobileIdToBeDeleted) {

		if (mobileIdToBeDeleted > 0 && mobileIdToBeDeleted < 1000) {
			try {
				mobileDAO.deleteMobileById(mobileIdToBeDeleted);
				System.out.println("Mobile successfully deleted");
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public void validateAndDeleteAll() {
		// TODO Auto-generated method stub

		try {
			mobileDAO.deleteAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
