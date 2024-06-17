package package1;

public class Student {

	int Age;
	int Rollno;
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		
		Student s=new Student();
		s.Age=18;
		System.out.println("Age is :"+s.Age);
		s.Rollno=20;
		System.out.println("Roll number is:"+s.Rollno);
		s.display1();
		s.display2();

	}

}
