package java7;

abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("멈춥니다");}
}
interface Fightable { //인터페이스의 모든 메서드는 publi abstract. 예외없이 
	public void move(int x, int y); //public abstract가 생략
	public void attack(Fightable f); //public abstract 가 생략
}
class Fighter extends Unit2 implements Fightable {
	//오버라이딩 규칙: 조상보다 접근제어자가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
}
public class FIghtertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fighter f = new Fighter();
		//Unit2 f= new Fighter(); //Unit2에는 attack()이 없어서 호출 불가
		Fightable f = new Fighter();
		f.move(100,200);
		Fighter f2 = new Fighter();
		f.attack(f2);
	}

}
