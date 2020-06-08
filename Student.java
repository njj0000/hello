class Student {
	private String name;
	private int id ;

	Student()	
	{
		System.out.println("Student() 생성자 호출");

		this.name = "park";
		this.id= 123;
	}
	Student(String name)
	{
		System.out.println("Student(String name)생성자 호출");
		
		this.name = name;
		this.id =1234;
	}
}
	