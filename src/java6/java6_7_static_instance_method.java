package java6;

class Mymath2 {
	long a,b;
	
	long add() { //인스턴스메서드
		return a+b;
	}
	//static long add(long a, long b) { //클래스메서드 (static 메서드)
	// return a + b
}

public class java6_7_static_instance_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.out.println(Mymath2.add(200L,100L)); //클래스 메서드 호출	
	Mymath2 mm = new Mymath2 (); //인스턴스 생성
	mm.a = 200L;
	mm.b = 100L;
	System.out.println(mm.add());
	}

}

//인스턴스 메서드
//-인스턴스 생성 후 , 참조변수.매서드이름()으로 호출
//인스턴스 멤버(iv,im)와 관련된 작업을 하는 메서드
//메서드 내에서 인스턴스 변수 사용가능

// static 메서드 (클래스 메서드)
// 객체 생성없이 클래스 이름. 메서드이름()으로 호출
//인스턴스 멤버(iv,im)와 관련없는 작업을 하는 메서드
//메서드 내에서 인스턴스 변수(iv) 사용불가

// static 을 언제붙이냐   - 속성(멤버 변수)중에서 공통 속성에 static을 붙힌다.
// 인스턴스 멤버(iv,im)을 사용하지 않는 메서드에 static을 붙인다.
//class card {
//	String kind; //무늬
//	int number;  //숫자
//static int width = 100;//폭          
//static int height =250;//넓이
}
