package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.StudentDao;
import com.springrest.springrest.entities.Student;
@Service

public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
//	List<Student> list;
	
	public StudentServiceImpl()
	{
//		list=new ArrayList<>();
//		list.add(new Student(1,"Kirthana","Nambiar","nambiarkirthana23@gmail.com",2022));
//		list.add(new Student(2,"Mansi","Tathare","tatharemansi25@gmail.com",2023));
//		list.add(new Student(3,"Shreejeet","Nambiar","nambiarshreejeet30@gmail.com",2015));
//		list.add(new Student(4,"Pinky","Yadav","yadavpinky2@gmail.com",2017));
//		
//		
		
	}
	

	@Override
	public List<Student> getStudents() {
		
		return studentDao.findAll();
	}
	

	@Override
	public Student getStudent(long studentId) {
//		Student c=null;
//		for(Student student:list)
//			|{
//			if(student.getId()==studentId)
//			{
//				s=student;
//				break;
//			}
//		}
		return studentDao.getOne(studentId);
	}


	@Override
	public Student addStudent(Student student) {
//		list.add(student);
		studentDao.save(student);
		return student;
		
	}
	@Override
	public Student updateStudent(Student student) {
//		list.forEach(e->{
//			if(e.getId()==student.getId())
//			{
//				e.setFirstname(student.getFirstname());
//				e.setLastname(student.getLastname());
//				e.setEmail(student.getEmail());
//				
//			}
//		});
		studentDao.save(student);
		return student;
		
	}
	@Override
	public Student deleteStudent(long parseLong)
	{
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Student entity=studentDao.getOne(parseLong);
		studentDao.delete(entity);
		
		return  entity;
		
	}


	
}
