package java6;

class java6_2 {

	public static void main(String[] args) {
		class Tv{
			String color; //����
			Boolean power; //��������
			int channel; //ä��
			
			void power() { power =!power; }
			void channelUp() {channel++;}
			void channelDown() {channel--;}
		}
		
		
		
		Tv t1 = new Tv(); //Tv t1; t1 =new Tv();�� �� �������� ����
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");

		t1.channel = 7;	// channel ���� 7�� �Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
     	t2 = t1;		// t1�� �����ϰ� �ִ� ��(�ּ�)�� t2�� �����Ѵ�.
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}
}

/*
class Tv { 
     // Tv�� �Ӽ�(�������) 
      * 
      */
     String color;           // ���� 
     boolean power;          // ��������(on/off) 
     int channel;          	 // ä�� 

     // Tv�� ���(�޼���) 
     void power()   { power = !power; }  // TV�� �Ѱų� ���� ����� �ϴ� �޼��� 
     void channelUp()   {  ++channel; }  // TV�� ä���� ���̴� ����� �ϴ� �޼��� 
     void channelDown() {  --channel; }  // TV�� ä���� ���ߴ� ����� �ϴ� �޼���  
}
 */