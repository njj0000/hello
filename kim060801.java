class Student {
	private String name;
	private int id ;

	Student()	
	{
		System.out.println("Student() 생성자 호출");

		this.name = "kim";
		this.id= 12345;
	}
	Student(String name)
	{
		System.out.println("Student(String name)생성자 호출");
		
		this.name = name;
		this.id =1234;
	}

	String getName()
	{
		return name;
	}

	public class kim060801 {
	public static void main(String[] args) {

	Student std1= new Student();
	Student std2= new Student(kim);
	System.out.println(std1.getName());
	System.out.println(std2.getName());


		}
	}
}