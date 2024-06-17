package package1;

public class Selenium {
	
	public Selenium() {
		System.out.println("This is default constructor");
	}
	public Selenium(int a) {
		System.out.println("This is parametarized constructor");
	}
	public static void main(String[] args) {
	
		Selenium sel1=new Selenium();
		Selenium sell2=new Selenium(8);

	}

}
