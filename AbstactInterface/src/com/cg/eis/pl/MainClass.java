package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.Service.EmployeeService;
import com.cg.eis.Service.EmployeeServiceImp;
import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.println("Welcome to Employee Insurance Scheme");
		System.out.println("Enter the employee id");
		int id = sc.nextInt();
		System.out.println("enter the employee name");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter the Desig");
		String designation = sc.nextLine();
		System.out.println("enter the employee salary");

		Double salary = sc.nextDouble();
		try {
			if (salary < 3000)
				throw new EmployeeException("Please enter salary greater than 3000");
			else
			{
			employee.setName(name);
			employee.setId(id);
			employee.setSalary(salary);
			employee.setDesignation(designation);

			EmployeeService service = new EmployeeServiceImp();
			String insuranceScheme = service.validateFields(salary, designation);
			employee.setInsurancescheme(insuranceScheme);
			System.out.println(" Id: " + employee.getId() + "\n Name: " + employee.getName() + "\n Designation: "
					+ employee.getDesignation() + "\n Salary: " + employee.getSalary() + "\n Insurance Scheme: "
					+ employee.getInsurancescheme());
			sc.close();
			}

		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}

	}

}
