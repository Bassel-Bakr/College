/**
 * @author Bassel Bakr
 *
 */
public class WithoutOOP {

	/*
	 * No need for main method here!
	 */

	public static class Person {
		public int ID, age; // his/her ID & age
		public String first_name, middle_name, last_name; // no need for comments here!
	}

	/*
	 * A paid employ is just another Person, right?
	 */
	public static class PaidEmployee {
		public int ID, age;
		public String first_name, middle_name, last_name;
		public int salary; // how much $$$
	}

	/*
	 * I have to rewrite all fields!
	 */
	public static class Student extends Person {
		public int ID, age;
		public String first_name, middle_name, last_name;
		public int grade;
	}

	/*
	 * Rewriting ...
	 */
	public static class FacultyStaff {
		public int ID, age;
		public String first_name, middle_name, last_name;

		/*
		 * OOPS!!! I forgot to write the commented line 
		 * Good luck finding the root of the problem :D
		 */

		// public int salary;

		public String degree;

	}

	public static class Worker {
		public int ID, age;
		public String first_name, middle_name, last_name;
		public int salary;
		public String position;
	}
}
