package com.wolken.wolkenapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wolken.wolkenapp.dto.MobileDTO;
import com.wolken.wolkenapp.exception.MobileException;

public class MobileDAOImpl implements MobileDAO {

	@Override
	public void insertMobile(MobileDTO mobileDTO) throws SQLException, MobileException {
		// TODO Auto-generated method stub
		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Sparkleruby24!");) {
			try (PreparedStatement preparedStatement = con
					.prepareStatement("Insert into mobile_table values(?,?,?,?,?)");) {
				preparedStatement.setInt(1, mobileDTO.getMobileId());
				preparedStatement.setString(2, mobileDTO.getMobileName());
				preparedStatement.setString(3, mobileDTO.getMobileBrand());
				preparedStatement.setInt(4, mobileDTO.getMobileRam());
				preparedStatement.setInt(5, mobileDTO.getMobileNoOfCamera());
				if (preparedStatement.executeUpdate() > 0)
					System.out.println("Mobile successfully added to DB");
				else {
					System.out.println("Mobile was not added to DB ");
					throw new MobileException();
				}

				preparedStatement.close();
			}
			con.close();
		}

	}

	@Override
	public void displayMobile() throws SQLException {
		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Sparkleruby24!");) {
			try (PreparedStatement preparedStatement = con.prepareStatement("Select * from mobile_table;");) {
				try (ResultSet rs = preparedStatement.executeQuery();) {
					while (rs.next()) {
						int mobileId = rs.getInt(1);
						String mobileName = rs.getString(2);
						String mobileBrand = rs.getString(3);
						int mobileRam = rs.getInt(4);
						int mobileNoOfCamera = rs.getInt(5);

						System.out.println(mobileId + " " + mobileName + " " + mobileBrand + " " + mobileRam + " "
								+ mobileNoOfCamera);
					}
					rs.close();
				}
				preparedStatement.close();
			}
			con.close();
		}
	}

	@Override
	public void updateRamById(int ramToBeUpdated, int mobileIdToBeUpdated) throws SQLException {
		// TODO Auto-generated method stub

		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Sparkleruby24!");) {
			try (PreparedStatement preparedStatement = con
					.prepareStatement("update mobile_table set mobileRam = ? where mobileId = ? ;");) {

				preparedStatement.setInt(1, ramToBeUpdated);
				preparedStatement.setInt(2, mobileIdToBeUpdated);
				preparedStatement.executeUpdate();

				preparedStatement.close();
			}
			con.close();
		}

	}

	@Override
	public void deleteMobileById(int mobileIdToBeDeleted) throws SQLException {
		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Sparkleruby24!");) {
			try (PreparedStatement preparedStatement = con
					.prepareStatement("delete from mobile_table where mobileId =?; ");) {

				preparedStatement.setInt(1, mobileIdToBeDeleted);
				preparedStatement.executeUpdate();

				preparedStatement.close();

			}
			con.close();
		}
	}

	@Override
	public void deleteAll() throws SQLException {
		// TODO Auto-generated method stub

		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Sparkleruby24!");) {
			try (PreparedStatement preparedStatement = con.prepareStatement("truncate mobile_table; ");) {

				preparedStatement.executeUpdate();

				preparedStatement.close();

			}

		}

	}

}