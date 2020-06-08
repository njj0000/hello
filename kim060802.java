class Developer{
	private String name;
	private int career;


	Developer(String name,int career)
	{

		this.name = name;
		this.career=career;

	}
	int salary()
	{

		if (this.career>=7)
		{
			return (4500+(100*this.career));
		}
		else
		{
			if (this.career>=3)
			{
				return (3500+(100*this.career));
			}
			else
			{
				return (2800+(100*this.career));
			}
		}
		
	}

}
public class kim060802{
	
	public static void main(String[] args) {

	Developer dp1= new Developer("tom",2);
	System.out.println(dp1.salary());
	Developer dp2= new Developer("jim",5);
	System.out.println(dp2.salary());
	Developer dp3= new Developer("kim",8);
	System.out.println(dp3.salary());
	}
}

