class EmpInfo{
	int id;
	String name;
	
	EmpInfo(int id,String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id+" "+name);
	}
}

public class constructorDemo {

	public static void main(String[] args) {

		EmpInfo emp1=new EmpInfo(1,"Demo");
		EmpInfo emp2=new EmpInfo(2,"Test");
	
		emp1.display();
		emp2.display();
	}
}


