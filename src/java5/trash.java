package java5;

class trash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Tv t1 =new Tv();
	Tv t2= new Tv();
	//Tv t1; 
	//t1 =new Tv();
	//Tv t2;
	//t2= new Tv();
	System.out.println("t1�� channel����"+t1.channel+"�Դϴ�.");
	System.out.println("t2�� channel����"+t2.channel+"�Դϴ�.");
	t1.channel =7;
	System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
	t2.channel =8;
	System.out.println("t2�� channel���� 8�� �����Ͽ����ϴ�.");
	System.out.println("t1�� channel����" + t1.channel+"�Դϴ�.");
	System.out.println("t2�� channel����" + t2.channel+"�Դϴ�.");
	}
}
	class Tv{
		String color;
		int channel;
		boolean power;
		void channelUp()
		{++channel;}
		void channelDown()
		{--channel;}
		void power()
		{power = !power;}
	}
//	class Tv{
//		String color;
//		int channel;
//		boolean power;
//		void channelUp()
//		{++channel;}
//		void channelDown()
//		{--channel;}
//		void power()
//		{power = !power;}
//	}


