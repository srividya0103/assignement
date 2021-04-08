package day1.task1;
import java.util.Scanner;

public class EmployeeSalary {
public static void main(String[] args) {
	double basic_salary;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the basic salary");
	basic_salary = sc.nextDouble();
	double hra = (40*basic_salary)/100;
	double da = (60 * (hra + basic_salary))/100;
	double annual_salary = (basic_salary + hra + da)*12;
	System.out.println("annual salary is " + annual_salary);
	double tax = 0;
	if(annual_salary < 200000) {
		tax = 0;
	}
	else if(annual_salary >= 200000 && annual_salary < 600000) {
		tax = (annual_salary*10)/100;
		
	}
	else {
		tax = (annual_salary * 20)/100;
	}
	double result = (annual_salary - tax);
	System.out.println("After tax deduction the annual salary of an employee is :" + result);
}
}
