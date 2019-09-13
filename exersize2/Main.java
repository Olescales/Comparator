package by.stormnet.tasks.exersize2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import by.stormnet.tasks.exersize2.comparators.DescSalaryCompare;

public class Main {

	public static void main(String[] args) {

		Employee[] employees = createArrayOfEmployee();
		System.out.println(Arrays.toString(employees));
		
		System.out.println("================================================");
		
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String command;
		do {
			command = sc.next();
			switch (command) {
			case "1":
				Arrays.sort(employees);
				System.out.println(Arrays.toString(employees));
				break;
				
				/*Anonimous comparator class*/
			case "2":
				Arrays.sort(employees, new Comparator<Employee>() {
					@Override
					public int compare(Employee o1, Employee o2) {
						return o2.compareTo(o1);
					}
				});
				System.out.println(Arrays.toString(employees));
				break;
				
				/*Anonimous comparator class*/
			case "3":
				Arrays.sort(employees, new Comparator<Employee>() {
					@Override
					public int compare(Employee o1, Employee o2) {
						return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
					}
				});
				System.out.println(Arrays.toString(employees));
				break;

				/*inner comparator class*/
			case "4":
				DescDateOfBirthCompare ddob = main.new DescDateOfBirthCompare();
				Arrays.sort(employees, ddob);
				System.out.println(Arrays.toString(employees));
				break;
				
				/*inner comparator class*/
			case "5":
				AscSalaryCompare as = main.new AscSalaryCompare();
				Arrays.sort(employees, as);
				System.out.println(Arrays.toString(employees));
				break;
				
				/*another package comparator class*/
			case "6":
				DescSalaryCompare ds = new DescSalaryCompare();
				Arrays.sort(employees, ds);
				System.out.println(Arrays.toString(employees));
				break;
			}
		} while (!command.equalsIgnoreCase("0"));

	}

	public class AscSalaryCompare implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			if (o1.getSalary() > o2.getSalary()) {
				return 1;
			} else if (o1.getSalary() < o2.getSalary()) {
				return -1;
			} else {
				return 0;
			}
		}

		
	}
	public class DescDateOfBirthCompare implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o2.getDateOfBirth().compareTo(o1.getDateOfBirth());
		}

	}
	
	private static Employee[] createArrayOfEmployee() {

		Employee[] department = new Employee[6];

		department[0] = new Employee("Oleg", LocalDate.parse("1988-09-30"), 300d);
		department[1] = new Employee("Vitalik", LocalDate.parse("1988-06-16"), 400d);
		department[2] = new Employee("Zhenia", LocalDate.parse("1988-05-23"), 500d);
		department[3] = new Employee("Dima", LocalDate.parse("1988-03-28"), 600d);
		department[4] = new Employee("Vasia", LocalDate.parse("1988-02-28"), 100d);
		department[5] = new Employee("Olga", LocalDate.parse("1991-06-09"), 50d);

		return department;
	}
}
