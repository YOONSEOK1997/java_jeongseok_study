package java4;


import java.util.*;

public class do_while_4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num =0;
		int answer = (int)((Math.random())*100)+1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("���ڸ� �Է��ϼ���");
			 num = sc.nextInt();
			
			if(num > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����");
			}else if(num < answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����");
			}
		}while(num != answer);
			
			System.out.println("����");
			
			
		}
	}
