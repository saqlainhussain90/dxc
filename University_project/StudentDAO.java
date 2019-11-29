package com.univ.DAO;

import java.util.List;

import com.univ.model.Student;

public interface StudentDAO {
	public Student getStudentById(int studentId);
	public boolean addStudent(Student student);
	public boolean updateStudent(Student student);
	public boolean deleteStudent(int studentId);
	public List<Student> getAllStudentDetails();
	public boolean isStudentExists(int studentId);
	
}
