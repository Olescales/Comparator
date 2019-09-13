package by.stormnet.tasks.exersize2.comparators;
import java.util.Comparator;

import by.stormnet.tasks.exersize2.Employee;
public class DescSalaryCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getSalary() < o2.getSalary()) {
			return 1;
		} else if (o1.getSalary() > o2.getSalary()) {
			return -1;
		} else {
			return 0;
		}
	}

	
}
