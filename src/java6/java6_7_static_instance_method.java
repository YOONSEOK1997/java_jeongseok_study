package java6;

class Mymath2 {
	long a,b;
	
	long add() { //�ν��Ͻ��޼���
		return a+b;
	}
	//static long add(long a, long b) { //Ŭ�����޼��� (static �޼���)
	// return a + b
}

public class java6_7_static_instance_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.out.println(Mymath2.add(200L,100L)); //Ŭ���� �޼��� ȣ��	
	Mymath2 mm = new Mymath2 (); //�ν��Ͻ� ����
	mm.a = 200L;
	mm.b = 100L;
	System.out.println(mm.add());
	}

}

//�ν��Ͻ� �޼���
//-�ν��Ͻ� ���� �� , ��������.�ż����̸�()���� ȣ��
//�ν��Ͻ� ���(iv,im)�� ���õ� �۾��� �ϴ� �޼���
//�޼��� ������ �ν��Ͻ� ���� ��밡��

// static �޼��� (Ŭ���� �޼���)
// ��ü �������� Ŭ���� �̸�. �޼����̸�()���� ȣ��
//�ν��Ͻ� ���(iv,im)�� ���þ��� �۾��� �ϴ� �޼���
//�޼��� ������ �ν��Ͻ� ����(iv) ���Ұ�

// static �� �������̳�   - �Ӽ�(��� ����)�߿��� ���� �Ӽ��� static�� ������.
// �ν��Ͻ� ���(iv,im)�� ������� �ʴ� �޼��忡 static�� ���δ�.
//class card {
//	String kind; //����
//	int number;  //����
//static int width = 100;//��          
//static int height =250;//����
}
