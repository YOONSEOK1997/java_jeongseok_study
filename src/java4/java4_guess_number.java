package java4;

import java.util.Scanner;

public class java4_guess_number {
	
	public static void main(String[] args) {
		int num=0; answer=0;
		// TODO Auto-generated method stub
	//int answer = (int)(Math.random()*100)+1; //1~100까지의 숫자
		answer = (int)(Math.random()*100)+1;
	Scanner sc= new Scanner(System.in);
	
	do {
		System.out.println("숫자를 입력하세요");
		//int num= sc.nextInt();
		num=sc.nextInt();
	}
	if(num>answer) {
		System.out.println("더 작은 숫자로 해보세요");
	}else(num<answer) {
		System.out.println("더 큰 숫자로 해보세요");
	}
	while (answer != num);
	
	System.out.println("정답");
	}

}
