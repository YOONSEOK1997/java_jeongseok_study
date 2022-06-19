package java7;

public class java7_32 {
//추상 메서드 - 미완성 메서드. 구현부(몸통,{})가 없는 메서드
	//언제쓰냐 ? - 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우
	abstract class Player { //추상 클래스
		abstract void play(int pos);     //추상 메서드 
		abstract void stop();            //추상 매서드
	}
	class AudioPlayer extends Player {
		void play(int pos) { /*내용 생략*/ } //추상 메서드를 구현 
		void stop() { /*내용 생략 */}        //추상 메서드를 구현   //조상 메서드 2개다 구현 
	}
	abstract class AbstractPlayer extends Player {
		void play(int pos) { /*내용 생략 */} // 추상메서드를 구현   <---한개만 구현!! abstarct 안붙이면 에러 
	}
}
