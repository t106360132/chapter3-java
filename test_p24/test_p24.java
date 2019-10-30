package test_p24;



public class test_p24 {
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		
		car1.setcar(1234,20.5);
		car1.show();
		
		System.out.println("只變更車號");
		car1.setcar(2345);
		car1.show();
		
		System.out.println("只變更汽油量");
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
		System.out.println("將車號設定為"+num);
	}
	
	public void setcar(double g)
	{
		gas=g;
		System.out.println("將汽油量設定為"+g);
	}
	
	public void setcar(int n, double g)
	{
		num=n;
		gas=g;
		
		System.out.println("將車號設定為"+num+"汽油量設定為"+gas);
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
}