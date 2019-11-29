package com.univ.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
	@Id
	private int studentId;
	private String studentName;
	private String course;
	private int daysAbsent;
	private boolean feeStatus;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<BooksTakenFromLibrary> booksTakenFromLibrary= new ArrayList<BooksTakenFromLibrary>();
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Marks> marks= new ArrayList<Marks>();
		
	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String course, int daysAbsent, boolean feeStatus,
			List<BooksTakenFromLibrary> booksTakenFromLibrary, List<Marks> marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.daysAbsent = daysAbsent;
		this.feeStatus = feeStatus;
		this.booksTakenFromLibrary = booksTakenFromLibrary;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getsStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getDaysAbsent() {
		return daysAbsent;
	}

	public void setDaysAbsent(int daysAbsent) {
		this.daysAbsent = daysAbsent;
	}

	public boolean isFeeStatus() {
		return feeStatus;
	}

	public void setFeeStatus(boolean feeStatus) {
		this.feeStatus = feeStatus;
	}

	public List<BooksTakenFromLibrary> getBooksTakenFromLibrary() {
		return booksTakenFromLibrary;
	}

	public void setBooksTakenFromLibrary(List<BooksTakenFromLibrary> booksTakenFromLibrary) {
		this.booksTakenFromLibrary = booksTakenFromLibrary;
	}

	
	public List<Marks> getMarks() {
		return marks;
	}

	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course + ", daysAbsent=" + daysAbsent
				+ ", feeStatus=" + feeStatus + ", booksTakenFromLibrary=" + booksTakenFromLibrary + ",  marks=" + marks + "]";
	}
	

}
