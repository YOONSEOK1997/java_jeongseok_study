package java6;
//constructor (������) =�ν��Ͻ��ʱ�ȭ�ż���
//�̸��� Ŭ���� �̸��� ���ƾ� �Ѵ�.
//���ϰ��� ����.(void �Ⱥ���)

//�������̸�orŬ�����̸�(Ÿ�� ������,Ÿ�� ������,. .) {
//�ν��Ͻ� ������ ����� �ڵ�,
//�ַ� �ν��Ͻ� ������ �ʱ�ȭ �ڵ带 ���´�.
class Data_1 {
	int value;
}
class Data_2 {
	int value;
	Data_2() {}
	
	Data_2(int x) { //�Ű������� �ִ� ������.
		value = x;
	}
}
public class java6_8_constructor {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1 ();
		Data_2 d2 = new Data_2 (); //compile error �߻� 
		// TODO Auto-generated method stub

	}

}
//this = �ν��Ͻ� �ڽ��� ����Ű�� ��������, ��� �ν��Ͻ� �޼��忡 ���������� ������ ä�� ����
//this() = ������, ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���
