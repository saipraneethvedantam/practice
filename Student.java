package practice;

public class Student {
	
	public String name;
	public String Dept;
	
	public Student(String Name, String Department) {
		
		this.name= Name;
		this.Dept = Department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}
	

}
