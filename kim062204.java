class Car {
	private String name;
	private int pang;

	public void setName(String name,int pang)
	{
		this.name=name; 
		this.pang=pang;
	}
	public void clack()
	{
		System.out.println(name+"����");
	}
	public String getName()
	{
		return name;
	}
}
class Truck extends Car{
	private int juk;
	
	public void setJuk(int juk)
	{
		this.juk=juk;
	}
	public void jim()
	{
		System.out.println(getName()+"�Ѷ�"+juk);
	}
}
class Sprotscar extends Car{
	private int spe;
	
	public void setSpe(int spe)
	{
		this.spe=spe;
	}
	public void drive()
	{
		System.out.println(getName()+"���"+spe);
	}
}
public class kim062204 {
	public static void main(String[] args) {

	
	Truck tru = new Truck();
	Sprotscar spo = new Sprotscar();

	tru.setName("Ʈ��",1000);
	tru.clack();	
	spo.setName("������ī",2000);
	spo.clack();
	}
}	