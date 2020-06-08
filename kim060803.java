import java.util.*;
class Account{
	private int balance;
	

	Account()
	{
		this.balance=0;
			
	}
	void deposit(int a1)
	{
		this.balance= this.balance+a1;
	}
	void withdraw(int b1)
	{
		this.balance= this.balance-b1;
	}
	int getBalance()
	{
		return balance;
	}
	
}
	
	
public class kim060803{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		Account a1 = new Account();
		
		System.out.print("입금액을 입력하세요 :");
		int amt1 = input.nextInt();
		a1.deposit(amt1);
		System.out.printf("고객 계좌잔고: %d\n원",a1.getBalance());

		System.out.print("출금액을 입력하세요 :");
		int amt2 = input.nextInt();
		a1.withdraw(amt2);
		System.out.printf("고객 계좌잔고: %d원\n",a1.getBalance());

		System.out.print("입금액을 입력하세요 :");
		int amt3 = input.nextInt();
		a1.deposit(amt3);
		System.out.printf("고객 계좌잔고: %d원\n",a1.getBalance());
		
	}
}