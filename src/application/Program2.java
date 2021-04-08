package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
				
		/*System.out.println("=== TEST 1: Department INSERT ===");
		Department newDepartment = new Department(12, "Clothes");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());*/
		
		System.out.println("=== TEST 2: department findById ===");
		Department department = departmentDao.findById(3);		
		//System.out.println(obj);
		System.out.println(department);
	}

}
