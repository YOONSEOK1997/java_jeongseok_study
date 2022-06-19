package java6;

//초기화3가지
//1.명시적 초기화(=)
class car{
	int door = 4; //기본형 변수의 초기화
	Engine e = new Engine(); //참조형 변수의 초기화
}
//2.초기화 블럭

//인스턴스 초기화 블럭 : {} ->iv
//클래스 초기화 블럭 : static {} ->cv

//3.생성자
//Car(String color,String gearType,int door { //매개변수 있는 생성자
	//this.color = color;
 	//this.gearType = gearType;
	//this.door= door;


//멤버변수의 초기화
//클래스 변수 초기화 시점 : 클래스가 처음 로딩될때 단 한번 (메모리에 올라갈때)//
//인스턴스 변수 초기화 시점 : 인스턴스가 생성될때마다

class InitTest {
	static int cv =1; //명시적 초기화
	int iv =1; //명시적 초기화 
	
	static { cv =2; } //클래스 초기화 블럭
	{iv =2;} //인스턴스초기화 블럭
	
	InitTest() //생성자
	iv =3;
	
}
public class java6_9_Chogihwa {
	
}