package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		SellerDao sellerDao = DaoFactory.createSellerDao();
				
		/*System.out.println("=== TEST 1: Department INSERT ===");
		Department newDepartment = new Department(14, "Clothes");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());*/
		
		System.out.println("\n=== TEST 2: department findById ===");
		Department department = departmentDao.findById(11);		
		//System.out.println(obj);
		System.out.println(department);
		
		System.out.println("\n=== TEST 3: department update ===");
		department = departmentDao.findById(1);
		department.setName("Computers");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 4: Department delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		
		department = new Department(id, null);		
		List<Seller> list = sellerDao.findByDepartment(department);
		System.out.println("Delete completed");
		
		if(list.isEmpty()) {
			departmentDao.deleteById(id);
			System.out.println("Delete completed");
		}
		else {
			System.out.println("Delete denied. Referetial integrity!!");
		}
		
		sc.close();		
	}

}
