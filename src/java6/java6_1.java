package java6;

public class java6_1 { //클래스는 설계도 , 객체는 제품
//public이 있는경우 소스파일이름(java_1.java)와 일치해야함 *대소문자도 일치해야함
//public없는경우 자유 
	//객체 = 속성(변수) + 기능(메서드)
	//TV
	//속성 (크기, 길이, 높이 ,색상, 볼륨 ,채널) 
	//-> String color;  (색깔) ->boolean power; //전원상태 int channel; 채널
	//기능 ( 켜기,끄기 ,볼류 높이기 낮추기,채널변경)
	//void power() {power =!power} void channelup() {channel ++;}
	
 //Q클래스가 왜 필요한가?
	//객체를 생성하기 위해\
//객체를 사용한다는 것은 
	//객체가 가진 속성(변수)과 기능(매서드)를 사용하려고
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.객체의 생성		
		//Tv t; //tv클래스 타입의 참조변수 t를 선언(리모콘 *필수)
		//t = new Tv(); //Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장
		Tv t =new Tv(); //위에 두줄을 합친것 
		
		System.out.println("현재 채널은" + t.channel +" 입니다.");
//1-1 클래스 생성
		class Tv{
			String color; //색깔
			Boolean power; //전원상태
			int channel; //채널
			
			void power() { power =!power; }
			void channelUp() {channel++;}
			void channelDown() {channel--;}
			
		}
	
//2.객체의 사용
	t.channel = 7; //Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
	t.channelDown(); //Tv인스턴스의 메서드 channelDown()을 호출한다. (-1)
				///                       6
	}
}

1.클래스 작성 2.객체생성 3. 객체 사용