package java5;

import java.util.Scanner;

public class Munjae5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"television","computer","mouse","phone"};
		
		Scanner scanner = new Scanner(System.in);
		for(int i =0; i< words.length; i++) {
			char[] question = words[i].toCharArray(); //String�� char[]�� ��ȯ
			for(int j=0; j<question.length; j++) {
				int idx = (int)(Math.random()*question.length);
				char tmp = question[i];
				question[i] =question[idx];
				question[idx]= tmp;
			}
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>",
					i+1,new String(question));
			String answer = scanner.nextLine();
			//trim()���� answer�� �¿� ������ ������ ��, equlas�� word[i]�� ��
			if (words[i].equals(answer.trim()))
				System.out.println("�¾ҽ��ϴ�.");
			else
				System.out.println("Ʋ�Ƚ��ϴ�.");
			
			
		}
	
	}

}
