package test_p24;



public class test_p24 {
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.setcar(1234,20.5);
		car1.show();
		
		System.out.println("�u�ܧ󨮸�");
		car1.setcar(2345);
		car1.show();
		
		System.out.println("�u�ܧ�T�o�q");
		car1.setcar(30.5);
		car1.show();
	}
}

class Car
{
	private int num;
	private double gas;
	
	public void setcar(int n)
	{
		num=n;
		System.out.println("�N�����]�w��"+num);
	}
	
	public void setcar(double g)
	{
		gas=g;
		System.out.println("�N�T�o�q�]�w��"+g);
	}
	
	public void setcar(int n, double g)
	{
		num=n;
		gas=g;
		
		System.out.println("�N�����]�w��"+num+"�T�o�q�]�w��"+gas);
	}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	
}