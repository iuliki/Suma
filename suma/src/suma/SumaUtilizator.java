package suma;

public class SumaUtilizator {

	public static void main(String[] args) {
		
		suma s1= new suma(1,2);
		System.out.println(s1);
		
		System.out.println(s1.Sum(1,2));
		
		
		
		suma s2= new suma(1,2,3);
		System.out.println(s2);
		System.out.println(s2.Sum(1,2,3));
		
		suma s3= new suma(1,2,3,4);
		System.out.println(s3);
		System.out.println(s2.Sum(1,2,3,4));
  
	}

}
