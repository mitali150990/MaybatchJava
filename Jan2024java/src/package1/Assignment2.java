package package1;

public class Assignment2 {
	// ((((10/2)-2)+2)-2)/2)
	
	
	public int division(int a,int b)
	{
		float divisionres=a/b;
		return (int) divisionres;
		
	}
	
	public int subtract(int c,int d)
	{
		int subtractres=c-d;
		return subtractres;
		
	}
	
	public int add(int e,int f)
	{
		int addres=e+f;
		return addres;
		
	}
	
	public static void main(String[] args) {
		Assignment2 ass=new Assignment2();
	
	int divres=ass.division(10, 2);
	int subres=ass.subtract(divres, 2);
	int addresult=ass.add(subres, 2);
	
	
System.out.println("Final result for expression is:"+divres);	
	

	}

}
