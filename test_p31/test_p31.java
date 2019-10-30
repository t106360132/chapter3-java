package test_p31;



public class test_p31 {
	public static void main(String[]args)
	{
		Car.showSum();
		
		Car car1;
		car1 = new Car();
		car1.setcar(1234,20.5);
		
		Car.showSum();
		
		Car car2;
		car2 = new Car();
		car2.setcar(4567,30.5);
	}
}

class Car
{
	public static int sum=0;
	
	private int num;
	private double gas;
	
	public Car()
	{
		num=0;
		gas=0.0;
		sum++;
		System.out.println("生產了車子");
	}
	
	public void setcar(int n ,double g)
	{
		num=n;
		gas=g;	
		System.out.println("將車號設定為"+num+"汽油量設定為"+gas);
	}
	
	public static void showSum()
	{
		System.out.println("車子共有"+sum+"台");
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);	
	}
}