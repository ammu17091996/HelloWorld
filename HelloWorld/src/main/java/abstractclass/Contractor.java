package abstractclass;

import java.util.Scanner;

public class Contractor extends Employee {
int hour,salary;
	public static void main(String[] args) {
		Contractor c=new Contractor();
		c.calculateSalary();
		System.out.println("salary of contractor is"+c.salary);
		FullTimeEmployee f=new FullTimeEmployee();
		f.calculateSalary();
		System.out.println("salary of fulltime employee is"+f.salary);
	}

	@Override
	void calculateSalary() {
		System.out.println("enter the working hour");
		Scanner s=new Scanner(System.in);
		 hour=s.nextInt();
		 salary=hour*100;
		
	}

}
