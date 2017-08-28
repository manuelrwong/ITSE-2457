package employee;

/**
 * Creates a list of employees and prints them. 
 * @author Qi Wang
 * @version 1.0
 */
public class EmployeeUtility {
	/**
	 * Creates a list of employees and display them. 
	 * @throws java.io.FileNotFoundException if a file is not found
	 */
	public static void start() throws java.io.FileNotFoundException{
		//Create a list of employees
		java.util.ArrayList<Employee> staff;
		staff = createList();
		//Display this list 
		displayList(staff);
	}

	/**
	 * Returns a list of employees
	 * @return A reference to a list of employees
	 * @throws java.io.FileNotFoundException if a file is not found
	 */
	public static java.util.ArrayList<Employee> createList() throws java.io.FileNotFoundException{
		java.util.ArrayList<Employee> staff = new java.util.ArrayList<Employee>();
		//parttime employees
		java.util.Scanner input = new java.util.Scanner(new java.io.File("parttime.txt"));
		while(input.hasNext()){
			staff.add(new ParttimeEmployee(input.next(), input.nextDouble(), input.nextDouble()));
		}

		//fulltime employees
		input = new java.util.Scanner(new java.io.File("fulltime.txt"));
		while(input.hasNext()){
			staff.add(new FulltimeEmployee(input.next(), input.nextDouble()));
		}
		
		staff.trimToSize();
		input.close();
		return staff;
	}
	
	/**
	 * Displays a list of employees.
	 * @param staff A reference to a list of employees
	 */
	public static void displayList(java.util.ArrayList<Employee> staff){
		int i = 0;
		while(i < staff.size()){
			System.out.println(staff.get(i) + 
					"\nThe pay of this employee is " + ((ParttimeEmployee)(staff.get(i))).pay());
			i++;
		}
	}
}
