package cloud.cloudvandana.pack;

import java.util.Scanner;

public class RomanToInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s = s1.toUpperCase();

		int sum=0;
		
		for(int i = 0;i<s.length();i++)
		{
			int a = get(s.charAt(i));
			if (i == s.length() - 1) {
				sum = sum + a;
				break;
			}

			int b = get(s.charAt(i + 1));

			if (a >= b)
				sum = sum + a;
			else
				sum = sum - a;

		}

		System.out.println(sum);

	}

	public static int get(char c) {
		if('I'==c) return 1;
		if('V'==c) return 5;
		if('X'==c) return 10;
		if('L'==c) return 50;
		if('C'==c) return 100;
		if('D'==c)  return 500;
		if('M'==c) return 1000;
		else return -1;
	
	}

}
