class Student {
	private String name;
	private int id ;

	Student()	
	{
		System.out.println("Student() ������ ȣ��");

		this.name = "park";
		this.id= 123;
	}
	Student(String name)
	{
		System.out.println("Student(String name)������ ȣ��");
		
		this.name = name;
		this.id =1234;
	}
}
	