package test_p34;

import java.io.*;

public class test_p34 {
	public static void main(String[]args)throws IOException
	{
		System.out.println("�п�J�@�Ӽ�");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		
		System.out.println("�A��J���Ʀr�O"+num);
	}
	

}
