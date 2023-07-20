package MagicNumber;

import java.util.*;

public class MagicNumber {
	
	public static int sum(int number)
	{
		if(number == 0)
		{
			return 0;
		}
		 return sum(number/10) + (number%10);
	}
	
	public static boolean magic(int number)
	{
		int sum = sum(number);
		if(sum > 9)
		{
			return magic(sum);
		}
		else
		{
			return sum == 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int number =scan.nextInt();
		System.out.println(magic(number)? 1 :0);
	}

}
