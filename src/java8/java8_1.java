package java8;

public class java8_1 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(1);
//		try {
//			System.out.println(2);
//			System.out.println(3);
//		} catch (Exception e) {
//			System.out.println(4); //���ܰ� �߻��������� ����
//		} //try - catch �� ��
//		System.out.println(5);
//	}
//// ���ܰ� �߻��ϸ�, �̸� ó���� catch ���� ã�� ������
//}
		System.out.println(1);
		try { 
			System.out.println(0/0); //���ܹ߻� (0���� �����°� ����)
			System.out.println(2);
		}catch (Exception e) {
				System.out.println(3);
			} //try-catch�� ��
			System.out.println(4);
		} //main�޼����� ��
	}
