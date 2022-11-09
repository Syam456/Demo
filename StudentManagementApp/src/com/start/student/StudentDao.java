package com.start.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static boolean addStudentToDB(Student st) {
		
		boolean status=false;
		try {
			Connection con=ConnectionProvider.createC();
			String Query1="insert into students(sname,sphone,scity"+"values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(Query1);
			
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			pstmt.executeUpdate();
		}catch (Exception e) {
	}
		return status;

}

public static boolean deleteStudent(int studentId) {
	// TODO Auto-generated method stub
	boolean status=false;
	try {
		Connection con=ConnectionProvider.createC();
		String Query1="delete from students where sid=?";
		PreparedStatement pstmt=con.prepareStatement(Query1);

		pstmt.executeUpdate();
	}catch (Exception e) {
}
		
		
	return false;
}

public static boolean getAllStudents() {
	// TODO Auto-generated method stub
	boolean status=false;
	try {
		Connection con=ConnectionProvider.createC();
		String Query1="select * from students";
//		PreparedStatement pstmt=con.prepareStatement(Query1);
		Statement stmt=con.createStatement();
		ResultSet set=stmt.executeQuery(Query1);
		while(set.next()) {
			int id=set.getInt(1);
			String name=set.getString(2);
			String phone=set.getString(3);
			String city=set.getString("sCity");
			
			System.out.println("ID:"+id);
			System.out.println("Name:"+name);
			System.out.println("Phone:"+phone);
			System.out.println("city:"+city);
			System.out.println(".......");
			
		}
status=true;
		//stmt.executeUpdate();
	}catch (Exception e) {
}
	return status;
}
}
