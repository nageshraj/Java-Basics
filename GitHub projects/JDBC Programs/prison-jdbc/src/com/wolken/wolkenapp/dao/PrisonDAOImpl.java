package com.wolken.wolkenapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wolken.wolkenapp.Connect;
import com.wolken.wolkenapp.dto.PrisonDTO;

public class PrisonDAOImpl implements PrisonDAO {

	public Connection con = Connect.getConnection();

	@Override
	public void insert(PrisonDTO prisonDTO) throws SQLException {

		try (PreparedStatement preparedStatement = con
				.prepareStatement("insert into wolken.prison_table values(?,?,?,?,?)");) {

			preparedStatement.setInt(1, prisonDTO.getPrisonId());
			preparedStatement.setString(2, prisonDTO.getPrisonName());
			preparedStatement.setInt(3, prisonDTO.getNoOfInmates());
			preparedStatement.setString(4, prisonDTO.getPrisonArea());
			preparedStatement.setString(5, prisonDTO.getPrisonState());
			preparedStatement.executeUpdate();

			preparedStatement.close();
		}
		con.close();
	}

	@Override
	public void display() throws SQLException {
		// TODO Auto-generated method stub

		// Check raj.jar for connection reference

		// try (Connection con = Connect.getConnection()) {
		// System.out.println(con);
		try (PreparedStatement preparedStatement = con.prepareStatement("select * from wolken.prison_table")) {
			try (ResultSet rs = preparedStatement.executeQuery();) {

				while (rs.next()) {
					int prisonId = rs.getInt(1);
					String prisonName = rs.getString(2);
					int noOfInmates = rs.getInt(3);
					String prisonArea = rs.getString(4);
					String prisonState = rs.getString(5);

					System.out.println(
							prisonId + " " + prisonName + " " + noOfInmates + " " + prisonArea + " " + prisonState);
				}

			}

		}
		// Connect.closeConnection();
		// }

	}

	@Override
	public boolean updatePrisonNameById(int prisonId, String prisonName) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("inside updatePrisonNameById()");

		try (PreparedStatement preparedStatement = con
				.prepareStatement("update wolken.prison_table set prisonName = ? " + "where prisonId = ?; ");) {

			preparedStatement.setString(1, prisonName);
			preparedStatement.setInt(2, prisonId);

			int noOfRowsAffected = preparedStatement.executeUpdate();

			if (noOfRowsAffected > 0) {
				System.out.println(noOfRowsAffected);
				return true;
			}

		}

		return false;
	}

	@Override
	public boolean deleteById(int prisonId) throws SQLException {
		// TODO Auto-generated method stub
		boolean deleted = false;

		try (PreparedStatement preparedStatement = con
				.prepareStatement("delete from wolken.prison_table where prisonId = ? ");) {
			preparedStatement.setInt(1, prisonId);
			if (preparedStatement.executeUpdate() > 0)
				deleted = true;

			deleted = false;
		}

		return deleted;
	}

	@Override
	public void deleteAllRecords() throws SQLException {

		try (PreparedStatement preparedStatement = con.prepareStatement("truncate wolken.prison_table; ");) {

			preparedStatement.executeUpdate();

		}

	}

}
