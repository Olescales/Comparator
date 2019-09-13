package by.stormnet.tasks.exersize2.comparators;

import java.util.Comparator;

import by.stormnet.tasks.exersize2.Employee;
public class AscDateOfBirthCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
	}

}
