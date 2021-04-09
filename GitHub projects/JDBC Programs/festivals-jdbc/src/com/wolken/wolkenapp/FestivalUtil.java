package com.wolken.wolkenapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FestivalUtil {

	public static void main(String[] args) {
		Connection con = null;
		Statement statement = null;
		// Class.forName("com.mysql.cj.jdbc.Driver");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter festival Id: ");
		int festId = sc.nextInt();
		
		System.out.println("Enter festival Name: ");
		String festName = sc.next();
		
		System.out.println("Enter festival Month: ");
		String festMonth = sc.next();
		
		System.out.println("Enter No of days of festival: ");
		int festNoOfDays =  sc.nextInt();
		
		

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Sparkleruby24!");
// doesnt allow dynamic data			
//			statement = con.createStatement();
			
			PreparedStatement preparedStatement = con.prepareStatement("insert into festival_table values(?,?,?,?)");
			preparedStatement.setInt(1, festId);
			preparedStatement.setString(2, festName);
			preparedStatement.setString(3, festMonth);
			preparedStatement.setInt(4, festNoOfDays);
			preparedStatement.executeUpdate();
			
//			statement.executeUpdate("insert into festival_table values(5,'Ugadi','Apr',2)");
//			statement.executeUpdate("insert into festival_table values(1,'Christmas','Dec',2)");
//			statement.executeUpdate("insert into festival_table values(2,'Sankranthi','Jan',1)");
//			statement.executeUpdate("insert into festival_table values(3,'Navarathri','Oct',9)");
			
			// fetching data 
			ResultSet rs = preparedStatement.executeQuery("select * from festival_table");
			System.out.println(rs);
			
			while(rs.next()) {
				int festivalId = rs.getInt("festival_id");
				String festivalName = rs.getString("festival_name");
				String festivalMonth = rs.getString("festival_month");
				int festivalNoOfDays = rs.getInt(4);
				
				System.out.println(festivalId+" "+festivalName+" "+festivalMonth+" " +festivalNoOfDays);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}

	}

}
