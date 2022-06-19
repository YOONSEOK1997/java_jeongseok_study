package java4;


import java.util.*;

public class do_while_4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num =0;
		int answer = (int)((Math.random())*100)+1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("숫자를 입력하세요");
			 num = sc.nextInt();
			
			if(num > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요");
			}else if(num < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요");
			}
		}while(num != answer);
			
			System.out.println("정답");
			
			
		}
	}
