package spring_maven_mcv.com.mvc.spring.controller.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	static ArrayList<Student> list = new ArrayList<Student>();
	
	public boolean insert( Student obj)
	{
		for (Student student : list) {
			if(student.getId() == obj.getId())
			{
				System.out.println("found");
				return false;
			}
		}
		list.add(obj);
		return true;
	}
	
	public Student getStudent(int id)
	{
		for (Student student : list) {
			if(student.getId() == id)
			{
				System.out.println("found");
				return student;
			}
		}
		return null;
	}
	
	public boolean update(int id, Student obj)
	{
		if(delete(id))
		{
			insert(obj);
			return true;
		}
		return false;
	}
	
	public boolean delete(int id)
	{
		for (Student student : list) {
			if(student.getId() == id)
			{
				list.remove(student);
				return true;
			}
		}
		return false;
	}
	
	
	
	public ArrayList<Student> getAlldata()
	{
		return list;
	}
}
