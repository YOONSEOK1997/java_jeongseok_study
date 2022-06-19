	package java4;
	
	import java.util.Scanner;
	
	public class java4_if {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
//	for(int i=1; i<10; i++)
	System.out.println("숫자를 입력하세요");
	int input = sc.nextInt();
	if(input==0) {
		System.out.println("숫자는 0입니다.");
	}else if (input>0) {
			System.out.println("숫자가 0보다 큽니다");
	}else {
			System.out.println("숫자가 0보다 작습니다.");
			}
		}
	}
	
	
	
