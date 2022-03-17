package suma;

public class suma {
	
	private int a=0;
	private int b=0;
	private int c=0;
	private int d=0;
	
	public suma(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public suma(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public suma(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public static int Sum(int a,int b)
	{
		return a+b;
	}
	public static int Sum(int a,int b, int c)
	{
		return Sum(a,b)+c;
	}
	public static int Sum(int a, int b, int c, int d)
	{
		return Sum(a,b,c)+d;
	}

	

	@Override
	public String toString() {
		return "suma [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}
	
	
	
	
	

}
