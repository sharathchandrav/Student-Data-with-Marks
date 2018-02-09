package studentdata;

import java.util.HashMap;
import java.util.Map;

public class Student {
	private String StudentName;
	private int RollNo;
	private int Class;
	private String Gender;
	int[] marks;	
	Map<String,int[]> StudentExamMarks = new HashMap<String,int[]>();

	
	public Student (String StudentName,int RollNo,int Class,String Gender){
		this.StudentName = StudentName;
		this.RollNo = RollNo;
		this.Class = Class;
		this.Gender = Gender;
	}
	public String toString(){
		String show = "The Name of the Student is " + this.StudentName.toUpperCase() + " bearing the Roll No. " + this.RollNo + " in the Class " +  this.Class + " is " +  this.Gender.toUpperCase() + ".";
		return show;
	}
	public int getRollNo(){
		return RollNo;
	}
}