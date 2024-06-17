package package1;

public class Assignment1 {
//((((10+2)+2)-2)*2)/2)
	public int sum(int a,int b)

	{
		int sum1=a+b;
		return sum1;
		
	}
	public int subtract(int c,int d)
	{
		int subtractres=c-d;
		return subtractres;
		
	}
	public int multiply(int e,int f)
	{
		int multiplyres=e*f;
		return multiplyres;
		
	}
	public int division(int g,int h)
	{
		int divisionres=g/h;
		return divisionres;
		
	}
	public static void main(String[] args) {
		Assignment1 ass=new Assignment1();
		
	int sum2=ass.sum(10,2);
	int sum3=ass.sum(sum2,2);
	int subres=ass.subtract(sum3, 2);
	int mulres=ass.multiply(subres, 2);
	int divres=ass.division(mulres, 2);
	
System.out.println("Final result for expression is:"+divres);	
	

	}

}
