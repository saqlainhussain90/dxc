package com.univ.DAO;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.univ.model.Student;
@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	MongoTemplate mongoTemplate;
	@Override
	public Student getStudentById(int studentId) {
	Student student = mongoTemplate.findById(studentId,Student.class);
		return student;
	}

	@Override
	public boolean addStudent(Student student) {
		mongoTemplate.save(student);
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		Query query=new Query();
		query.addCriteria(Criteria.where("_id").is(student.getStudentId()));
		Update update=new Update();
		update.set("studentName",student.getsStudentName());
		update.set("course",student.getCourse());
		update.set("daysAbsent",student.getDaysAbsent());
		update.set("feeStatus",student.isFeeStatus());
		UpdateResult updateFirst = mongoTemplate.updateFirst(query, update, Student.class);
		System.out.println(updateFirst);
		int rowsAffected=(int) updateFirst.getModifiedCount();
		if(rowsAffected==0) {
		return false;}
		else
			return true;
	}

	

	@Override
	public boolean deleteStudent(int studentId) {
		Student studentById = getStudentById(studentId);
		DeleteResult remove = mongoTemplate.remove(studentById);
		long deletedCount = remove.getDeletedCount();
		if (deletedCount==0)
			return false;
		else
			return true;
	}

	@Override
	public List<Student> getAllStudentDetails() {
		List<Student> allStudents=mongoTemplate.findAll(Student.class);
		return allStudents;
	}

	@Override
	public boolean isStudentExists(int studentId) {
		Student student = mongoTemplate.findById(studentId,Student.class);
		if(student==null)
			return false;
		else
			return true;
	}

}
