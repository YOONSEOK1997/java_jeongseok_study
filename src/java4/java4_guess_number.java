package java4;

import java.util.Scanner;

public class java4_guess_number {
	
	public static void main(String[] args) {
		int num=0; answer=0;
		// TODO Auto-generated method stub
	//int answer = (int)(Math.random()*100)+1; //1~100������ ����
		answer = (int)(Math.random()*100)+1;
	Scanner sc= new Scanner(System.in);
	
	do {
		System.out.println("���ڸ� �Է��ϼ���");
		//int num= sc.nextInt();
		num=sc.nextInt();
	}
	if(num>answer) {
		System.out.println("�� ���� ���ڷ� �غ�����");
	}else(num<answer) {
		System.out.println("�� ū ���ڷ� �غ�����");
	}
	while (answer != num);
	
	System.out.println("����");
	}

}
