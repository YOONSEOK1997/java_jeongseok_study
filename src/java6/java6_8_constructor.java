package java6;
//constructor (생성자) =인스턴스초기화매서드
//이름이 클래스 이름과 같아야 한다.
//리턴값이 없다.(void 안붙임)

//생성자이름or클래스이름(타입 변수명,타입 변수명,. .) {
//인스턴스 생성시 수행될 코드,
//주로 인스턴스 변수의 초기화 코드를 적는다.
class Data_1 {
	int value;
}
class Data_2 {
	int value;
	Data_2() {}
	
	Data_2(int x) { //매개변수가 있는 생성자.
		value = x;
	}
}
public class java6_8_constructor {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1 ();
		Data_2 d2 = new Data_2 (); //compile error 발생 
		// TODO Auto-generated method stub

	}

}
//this = 인스턴스 자신을 가리키는 참조변수, 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재
//this() = 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용
