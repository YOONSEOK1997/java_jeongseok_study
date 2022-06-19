package java4;

import java.util.Scanner;

public class munjae_4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int)(Math.random()*100)+1;
		int input =0;
		int cnt =0;
		Scanner sc =new Scanner(System.in);
		System.out.println("1과 100사이의 값을 입력");
		do {
			cnt++;
			input = sc.nextInt();
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요");
			}else if(answer <input) {
				System.out.println("더 작은 수를 입력하세요");
			}else {
				System.out.println("맞췄습니다");
				System.out.println("시도횟수는"+cnt+"번입니다.");
				break;
			}
		}while(cnt<3);
		System.out.println("횟수초과");
	} 
}


