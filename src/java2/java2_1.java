package java2;

import java.util.Scanner;

public class java2_1 {

	public static void main(String[] args) {
	
		int x=1;
		int y=2;                // 1 2 3
		                         //2 3 1
		int z=3;
		
		int tmp=x;
		x=y;
		y=z;
		z=tmp;
		
//	char a='A';
//	int b = (int)a;
		int a=(int)'A';
	
	
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		System.out.println(a
				);
//Scanner scanner = new Scanner(System.in);
//
//System.out.println("이름을 입력하세요");
//String name = scanner.nextLine();
//System.out.println("나이를 입력하세요");
//String age = scanner.nextLine();
//int age1 = Integer.parseInt(age);
//System.out.printf(name+age1);
//
//
//
	}
}

