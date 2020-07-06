class Student{
}
	public class kim062201 {
		public static void main(String[] args){
		

	Student std1 =new Student();
	Student std2 =new Student();
	Student std3= std1;
	
	System.out.println(std1.equals(std2));
	System.out.println(std1.equals(std3));
	System.out.println(std1.toString());
	System.out.println(std1.getClass());
	System.out.println(std1.toString());
	}
}