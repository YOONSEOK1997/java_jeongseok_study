package java6;

public class java6_1 { //Ŭ������ ���赵 , ��ü�� ��ǰ
//public�� �ִ°�� �ҽ������̸�(java_1.java)�� ��ġ�ؾ��� *��ҹ��ڵ� ��ġ�ؾ���
//public���°�� ���� 
	//��ü = �Ӽ�(����) + ���(�޼���)
	//TV
	//�Ӽ� (ũ��, ����, ���� ,����, ���� ,ä��) 
	//-> String color;  (����) ->boolean power; //�������� int channel; ä��
	//��� ( �ѱ�,���� ,���� ���̱� ���߱�,ä�κ���)
	//void power() {power =!power} void channelup() {channel ++;}
	
 //QŬ������ �� �ʿ��Ѱ�?
	//��ü�� �����ϱ� ����\
//��ü�� ����Ѵٴ� ���� 
	//��ü�� ���� �Ӽ�(����)�� ���(�ż���)�� ����Ϸ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.��ü�� ����		
		//Tv t; //tvŬ���� Ÿ���� �������� t�� ����(������ *�ʼ�)
		//t = new Tv(); //Tv�ν��Ͻ��� ������ ��, ������ Tv�ν��Ͻ��� �ּҸ� t�� ����
		Tv t =new Tv(); //���� ������ ��ģ�� 
		
		System.out.println("���� ä����" + t.channel +" �Դϴ�.");
//1-1 Ŭ���� ����
		class Tv{
			String color; //����
			Boolean power; //��������
			int channel; //ä��
			
			void power() { power =!power; }
			void channelUp() {channel++;}
			void channelDown() {channel--;}
			
		}
	
//2.��ü�� ���
	t.channel = 7; //Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�.
	t.channelDown(); //Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�. (-1)
				///                       6
	}
}

1.Ŭ���� �ۼ� 2.��ü���� 3. ��ü ���