 class People {
	private String name;

	 void setName(String name)
	{
		this.name=name;
	}
	 void peoplePrint()
	{
		System.out.println("이름:"+this.name);
	}
}
 class Student extends People{
	private int id;

	 void setId(int id)
	{
		this.id=id;
	}

	 void studentPrint()
	{
		System.out.println("-----학생------");
		super.peoplePrint();
		peoplePrint();
		System.out.println("학번:"+this.id);
	}
}
 class Professor extends People{
	private int office;

	 void setOffice(int no)
	{
		this.office=no;
	}

	 void professorPrint()
	{
		System.out.println("-----교수------");
		peoplePrint();
		super.peoplePrint();
		System.out.println("사무실:"+this.office);
	}
}
public class kim062203 {
	public static void main(String[] args) {
	
	Student std = new Student();
	
	std.setName("kim");
	std.setId(12345);

	People p[]= new People[2];

	p[1] =new People();
	p[1].setName("cha");

	p[0] =std;
	p[0].peoplePrint();
	p[1].peoplePrint();
	
	}
}