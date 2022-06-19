package java4;

import java.util.Scanner;

public class java4_5 {

	public static void main(String[] args) {
	
		int score = 0;
		char Grade=' ';
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
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
		System.out.println("당신의 학점은"+Grade+"입니다.");
		
		
		}

	}

}
