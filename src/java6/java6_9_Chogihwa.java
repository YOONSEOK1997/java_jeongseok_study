package java6;

//�ʱ�ȭ3����
//1.����� �ʱ�ȭ(=)
class car{
	int door = 4; //�⺻�� ������ �ʱ�ȭ
	Engine e = new Engine(); //������ ������ �ʱ�ȭ
}
//2.�ʱ�ȭ ��

//�ν��Ͻ� �ʱ�ȭ �� : {} ->iv
//Ŭ���� �ʱ�ȭ �� : static {} ->cv

//3.������
//Car(String color,String gearType,int door { //�Ű����� �ִ� ������
	//this.color = color;
 	//this.gearType = gearType;
	//this.door= door;


//��������� �ʱ�ȭ
//Ŭ���� ���� �ʱ�ȭ ���� : Ŭ������ ó�� �ε��ɶ� �� �ѹ� (�޸𸮿� �ö󰥶�)//
//�ν��Ͻ� ���� �ʱ�ȭ ���� : �ν��Ͻ��� �����ɶ�����

class InitTest {
	static int cv =1; //����� �ʱ�ȭ
	int iv =1; //����� �ʱ�ȭ 
	
	static { cv =2; } //Ŭ���� �ʱ�ȭ ��
	{iv =2;} //�ν��Ͻ��ʱ�ȭ ��
	
	InitTest() //������
	iv =3;
	
}
public class java6_9_Chogihwa {
	
}