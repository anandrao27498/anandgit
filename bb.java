package anand;

import anand.Student;

class Student{
	String name;
	static String school; 
	
	public static void changeSchool() {
		school="new School";
	}
}
 public class oops {
 public static void main(String[] args) {	
Student.school="mgc";
Student s1=new Student();
s1.name="anand";
System.out.println(s1.school);
}}
