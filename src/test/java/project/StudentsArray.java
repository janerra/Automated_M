package project;

public class StudentsArray {

	public static void main(String[] args) {
		String[] students = {"Jane","Alex","Alise","Vera","Kris","Muhammad"} ;

		for (int index = 0; index < students.length; index++) {
			System.out.println(students[index]);
		}
		System.out.println("-------");
		
		for(String name : students) {
			System.out.println(name);
		}
	}

}
