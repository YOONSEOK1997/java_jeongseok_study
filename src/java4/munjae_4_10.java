package java4;

import java.util.Scanner;

public class munjae_4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int)(Math.random()*100)+1;
		int input =0;
		int cnt =0;
		Scanner sc =new Scanner(System.in);
		System.out.println("1�� 100������ ���� �Է�");
		do {
			cnt++;
			input = sc.nextInt();
			if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���");
			}else if(answer <input) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			}else {
				System.out.println("������ϴ�");
				System.out.println("�õ�Ƚ����"+cnt+"���Դϴ�.");
				break;
			}
		}while(cnt<3);
		System.out.println("Ƚ���ʰ�");
	} 
}


