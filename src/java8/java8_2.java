package java8;

class java8_2 {

	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
	try {
		System.out.println(3);
		System.out.println(0/0); //예외발생! 
		System.out.println(4); //실행되지 않는다. (예외가 발생한 이후의 문장들은 실행x)
	} catch (ArithmeticException ae) { //계산오류
		if (ae instanceof ArithmeticException)
		System.out.println("true다");
		System.out.println("ArithmeticException이다");
	} catch (Exception e) { //계산오류가아니야? 그러면 이 예외처리 (예외의 최고조상)
		System.out.println("exception");
	} //try -catch 의 끝
		System.out.println(6);
		//main 메서드의 끝
		

	}
}
