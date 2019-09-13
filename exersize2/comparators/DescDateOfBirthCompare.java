package by.stormnet.tasks.exersize2.comparators;
import java.util.Comparator;

import by.stormnet.tasks.exersize2.Employee;
public class DescDateOfBirthCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getDateOfBirth().compareTo(o1.getDateOfBirth());
	}

}
