/**
 * @author Bassel Bakr
 *
 */
public class WithOOP {

	/*
	 * No need for main method here!
	 */

	public static class Person {
		public int ID, age; // his/her ID & age
		public String first_name, middle_name, last_name; // no need for comments here
	}

	/*
	 * A paid employ is just another Person, right?
	 */
	public static class PaidEmployee extends Person {
		public int salary; // how much $$$
	}

	/*
	 * Student class inherits all fields of Person class and declares even more
	 * specific fields
	 */
	public static class Student extends Person {
		public int grade;
	}

	/*
	 * Just like Student class, this one extends/inherits PaidEmployee 
	 * which in turn inherits Person's fields
	 */
	public static class FacultyStaff extends PaidEmployee {
		public String degree;
	}

	public static class Worker extends PaidEmployee {
		public String position;
	}
}
