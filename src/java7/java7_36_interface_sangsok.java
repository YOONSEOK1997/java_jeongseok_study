package java7;

public class java7_36_interface_sangsok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�������̽��� ������ �������̽��� ����(Object�� �ְ� ������ �ƴ�)
//-���߻��(������ ������)�� ����(�߻�޼���� �浹�ص� ���� ����)
		interface Fightable extends Movable,Attackable {}
		
		interface Movable {
			/**������ ��ġ(x,y)�� �̵��ϴ� ����� �޼��� */
			void move(int x, int y);
		}
		interface Attackable {
			/** ������ ���(u)�� �����ϴ� ����� �޼���*/
			void attack(Unit u);
		}
	}

}
