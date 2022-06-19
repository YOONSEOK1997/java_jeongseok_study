package java8;

public class java8_1 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(1);
//		try {
//			System.out.println(2);
//			System.out.println(3);
//		} catch (Exception e) {
//			System.out.println(4); //예외가 발생했을때만 실행
//		} //try - catch 의 끝
//		System.out.println(5);
//	}
//// 에외가 발생하면, 이를 처리할 catch 블럭을 찾아 내려감
//}
		System.out.println(1);
		try { 
			System.out.println(0/0); //예외발생 (0으로 나누는건 금지)
			System.out.println(2);
		}catch (Exception e) {
				System.out.println(3);
			} //try-catch의 끝
			System.out.println(4);
		} //main메서드의 끝
	}
