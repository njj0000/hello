interface Pet{
	public abstract void play();	
}
interface HouseAnimal{
public abstract void space();
}

abstract  class Animal {
	String name;

	public void setName(String name){
		this.name = name;
	}
		public abstract void sound();
}
class Dog extends Animal implements Pet , HouseAnimal {
	public void sound() {
		System.out.println("�۸�");
}
	public void play() {
		System.out.println("�� �������");
}
	public void space() {
		System.out.println("�Ž�");
	}
}
class Cat extends Animal implements Pet , HouseAnimal {
	public void sound() {
		System.out.println("�߿�");
}
	public void play() {
		System.out.println("Ĺ Ÿ��");
}
	public void space() {
		System.out.println("�ȹ�");
	}
} 


public class kim070602 {
	public static void main(String[] args) {

	Dog dog=new Dog();
	Cat cat = new Cat();
	
	cat.sound();
	cat.play();
	cat.space();

	dog.sound();
	dog.play();
	dog.space();
	}
}