package java6;

public class java6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	class variables
	{
		int iv; //인스턴스변수,클래스 영역에 선언 (생성시기:인스턴스가 생성되었을때) 
		//개별속성 ( 카드의 숫자와 모양)
		//객체 = iv 여러개 묶어놓은거 
		static int cv; //클래스 변수 (생성시기: 클래스가 메모리에 올라갈때)
		//공통속성 ( 카드의 폭과 넓이)
		//클래스 변수를 선언하는 방법은 변수(iv)앞에 static을 붙이기만 하면 된다.
		
		void method()
		{
			int lv =0; //지역변수 (생성시기 : 변수 선언문이 수행되었을떄)
//지역변수: 메서드 내에 선언되어 매서드 내에서만 사용 가능
		}
	}
	
	}
}
