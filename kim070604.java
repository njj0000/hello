class Student {
 private String name;
 private static int id ;

	Student()
	{
		System.out.println("Student() ������ ȣ��");
		this.name ="park";
		this.id =123;
	}
	
	Student(String name)
	{
		System.out.println("Student(String name) ������ ȣ��");
		
		this.name =name;
		this.id =1234;
	}
	
	Student(String name, int id)
	{
		System.out.println("Student(String name, int id)������ ȣ��");
	
		this.name=name;
		if(id<0)
		{
			System.out.println("�й��� ������ �Է� �� �� �����ϴ�.");
		}
		else
		{
			this.id=id;
		}
	}
	public void studentPrint()
	{
		if(this.name==null)
		{
			System.out.println("�̸��� �Էµ��� �ʾҽ��ϴ�.");
		}
		else if(this.id ==0)
		{
			System.out.println("�й��� �Էµ��� �ʾҽ��ϴ�.");
		}
		else
		{
			System.out.println("�̸�: "+this.name + "�й�: "+this.id);
		}
		else
		{
			System.out.println("�̸�: " + this.name + "�й� :"+this.id);
		}
	}
}
public class kim070604 {
	public static void main(String[] args) {
	Student std1= new Student();
	Student std2= new Student("Lee");
	Student std3= new Student("kim",12345);
	
	std1.studentPrint();
	std2.studentPrint();
	std3.studentPrint();
	}
}