package java7;

public class java7_35_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//interface= 추상 메서드의 집합, 구현된것이 전혀 없는 설계도. 껍데기 (모든 멤버가 (public))
		//추상클래스= 일반클래스인데 추상메서드를 갖고있는 거,//인터페이스 = 구현된게 아무것도 없엉,그냥 추상메서드만 쭉 적어놓은거
		interface PlayingCard{ //인터페이스 이름{
		public static final int Spade =4; //타입 상수이름 = 값; (변수 가질 수 없음, 오직 상수)
		final int DIAMOND = 3;
		static int HEART = 2;
		int CLOVER =1;
		
		public abstract String getCardNumber();//메서드이름(매개변수목록) 모든 interface의 멤버는 public 
		String getCardKind();
		}

}
