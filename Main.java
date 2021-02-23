package practice;
import java.util.*;

import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {
	
	
	

	public static void main(String[] args)  {
		
		//comparator
		
		class Sortbyname implements Comparator<Student>
		{
		    
		    public int compare(Student a, Student b)
		    {
		        return a.name.compareTo(b.name);
		    }
		}
		
		Scanner sc = new Scanner(System.in);
		List<Student> stu = new ArrayList<Student>();
		
		
		/*System.out.println("Enter the Number of Employees: ");
		int number= sc.nextInt();
		String n,d;
		 * for(int i=0;i<number;i++) {
			System.out.println("Enter the Employee Name ");
			n=sc.nextLine();
			System.out.println("Enter the Employee Department ");
			d=sc.nextLine();
			Student p = new Student(n,d);
			stu.add(p);
		}
		*/
		

		stu.add(new Student("Ravi", "ECE"));
		stu.add(new Student("Stefan", "ECE"));
		stu.add(new Student("Rick Grimes", "CSE"));
		stu.add(new Student("Chirosky", "R&D"));
		stu.add(new Student("Kakashi", "Genin"));
		
		//sorting
		Collections.sort(stu, new Sortbyname());
		
		for(Student student: stu ) 
		{
			System.out.println(student.name+ "," +student.Dept);
		}
		
		

		
	}
	
}
