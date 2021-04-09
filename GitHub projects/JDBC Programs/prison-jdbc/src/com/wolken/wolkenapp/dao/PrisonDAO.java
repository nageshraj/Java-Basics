package com.wolken.wolkenapp.dao;

import java.sql.SQLException;

import com.wolken.wolkenapp.dto.PrisonDTO;

public interface PrisonDAO {

	public void insert(PrisonDTO prisonDTO) throws SQLException;

	public void display() throws SQLException;

	public boolean updatePrisonNameById(int prisonId, String prisonName) throws SQLException;

	public boolean deleteById(int prisonId) throws SQLException;

	public void deleteAllRecords() throws SQLException;
}
