package test_p14;



public class test_p14 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
	
		car1.setnum(1234);
		car1.setgas(20.5);		
	}
}

class Car
{
	int num;
	double gas;
	
	void setnum(int n)
	{
		num = n;
		System.out.println("�N�����]��"+ num);
	}
	
	void setgas(double gas)
	{
		System.out.println("�N�T�o�q�令"+ gas);
	}
}