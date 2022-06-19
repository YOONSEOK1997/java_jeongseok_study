package java7;

abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("����ϴ�");}
}
interface Fightable { //�������̽��� ��� �޼���� publi abstract. ���ܾ��� 
	public void move(int x, int y); //public abstract�� ����
	public void attack(Fightable f); //public abstract �� ����
}
class Fighter extends Unit2 implements Fightable {
	//�������̵� ��Ģ: ���󺸴� ���������ڰ� ������ �ȵȴ�.
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"�� �̵�");
	}
	public void attack(Fightable f) {
		System.out.println(f+"�� ����");
	}
}
public class FIghtertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fighter f = new Fighter();
		//Unit2 f= new Fighter(); //Unit2���� attack()�� ��� ȣ�� �Ұ�
		Fightable f = new Fighter();
		f.move(100,200);
		Fighter f2 = new Fighter();
		f.attack(f2);
	}

}
