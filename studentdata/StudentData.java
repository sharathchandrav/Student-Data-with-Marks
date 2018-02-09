package studentdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentData {
	static Map<Integer, Student> StudentMap = new HashMap<Integer, Student>();


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("1. Add a Student Detail");
			System.out.println("2. Add Scores of a Student");
			System.out.println("3. View a Student Score");
			System.out.println("4. Exit");


			System.out.println("Enter your choice :");
			int choice = sc.nextInt();
			switch(choice){
			case 1:// Adding a Student
				addAStudent(sc);
				PrintStudentsDataWithRollNo();
				break;
			case 2: //Add Academic Performance
				System.out.println("The Details of the Students are: ");
				PrintStudentsDataWithRollNo();
				System.out.println("Enter the Roll No. of the Student");
				int enteredRollNo = sc.nextInt();
				Student s1 = StudentMap.get(enteredRollNo);
				//Print the details of the Exams till now.??
				
				System.out.println("Select the type of test to add marks: ");
				System.out.println("1. Add UnitTest Marks");
				System.out.println("2. Add HalfYearly Marks");
				System.out.println("3. Add Annual Marks");
				System.out.println("4. Back");
				int testChoice = sc.nextInt();
				switch(testChoice){
				case 1: //Unit test
					System.out.println("Enter the Unit Test no.");
					int unitTestNo = sc.nextInt();
					int[] marks = new int[6];
					if(unitTestNo == 1){
						System.out.println("Enter the Marks Scored by the Student in the Unit Test " + unitTestNo);
						for(int i=0;i<6;i++){
							marks[i] = sc.nextInt();
						}
					s1.StudentExamMarks.put("UNITTEST1", marks);
					System.out.println(s1.StudentExamMarks.getValue());

					}
					if(unitTestNo == 2){
						System.out.println("Enter the Marks Scored by the Student in the Unit Test " + unitTestNo);

					}
					if(unitTestNo == 3){
						System.out.println("Enter the Marks Scored by the Student in the Unit Test " + unitTestNo);

					}
					if(unitTestNo == 4){
						System.out.println("Enter the Marks Scored by the Student in the Unit Test " + unitTestNo);

					}
					break;
				case 2: //Quarterly Yearly
					break;
				case 3: //Half Yearly
					break;
				case 4: //Annual
					break;
				}

				break;
			case 3:
				System.out.println("Printing statement 3");

				break;
			case 4:// Exit Option
				System.out.println("Printing statement 4");
				System.out.println("Exiting");
				System.exit(0);
				sc.close();
			default :
				System.out.println("Incorrect Choice");
			}
	   }
	}

	private static void addAStudent(Scanner sc) {
		int rollNo = 1;
		System.out.println("Enter the No. of Student Details You want to Enter :");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student Details as Comma separated string (Eg:Name,Class,Gender : \n");
			for(int i = 0;i < num;i++){
				String userInput = sc.nextLine();
				String [] tokens = userInput.split(",");
				if(tokens.length != 3){
					System.out.println("Incorrect Input.Enter correctly");
					return;
				}
				String name = tokens[0].trim();
				int Class = Integer.parseInt(tokens[1].trim());
				String Gender = tokens[2].trim();
				
				Student s1 = new Student(name,rollNo,Class,Gender);
				StudentMap.put(rollNo, s1);
				rollNo++;

			}	
	}
		
	private static void PrintStudentsDataWithRollNo(){ 
		for (Map.Entry<Integer, Student> entry : StudentMap.entrySet()) {			
		System.out.print("Key: " + entry.getKey());
		System.out.print(", Value: " + entry.getValue() + "\n");		}
	}

}

