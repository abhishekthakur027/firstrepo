package com.cg.smapp.dao;

import java.util.List;

import com.cg.smapp.domain.Student;

public interface StudentDAO {

 public void save(Student student);
	/**
	 * This findAll method will return the projects
	 * @return list of customer if found otherwise null 
	 */
 public List<Student> findAll();
	/**
	 * This update method will change the customer detail as provided in customer object
	 * @param customer to be updated
	 */
     public void update(Student student);
	/**
	 * This delete method will remove the customer from DB based on id provided
	 * @param id to the customer to be removed
	 */
	public void delete(int id);


}
