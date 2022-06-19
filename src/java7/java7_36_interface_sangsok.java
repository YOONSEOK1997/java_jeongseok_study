package java7;

public class java7_36_interface_sangsok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상이 아님)
//-다중상속(조상이 여러개)이 가능(추상메서드는 충돌해도 문제 없음)
		interface Fightable extends Movable,Attackable {}
		
		interface Movable {
			/**지정된 위치(x,y)로 이동하는 기능의 메서드 */
			void move(int x, int y);
		}
		interface Attackable {
			/** 지정된 대상(u)을 공격하는 기능의 메서드*/
			void attack(Unit u);
		}
	}

}
