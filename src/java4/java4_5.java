package java4;

import java.util.Scanner;

public class java4_5 {

	public static void main(String[] args) {
	
		int score = 0;
		char Grade=' ';
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
//		int score = sc.nextInt();
		score = sc.nextInt();
		if(score>=90) {
			Grade = 'A';
		}else if(score<90 && score>=80) {
			Grade = 'B';
		}else if(score<80 && score>=70) {
			Grade ='C';
		}else {
			Grade ='F';
		}
		System.out.println("����� ������"+Grade+"�Դϴ�.");
		
		
		}

	}

}
