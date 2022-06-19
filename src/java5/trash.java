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
	System.out.println("t1의 channel값은"+t1.channel+"입니다.");
	System.out.println("t2의 channel값은"+t2.channel+"입니다.");
	t1.channel =7;
	System.out.println("t1의 channel값을 7로 변경하였습니다.");
	t2.channel =8;
	System.out.println("t2의 channel값을 8로 변경하였습니다.");
	System.out.println("t1의 channel값은" + t1.channel+"입니다.");
	System.out.println("t2의 channel값은" + t2.channel+"입니다.");
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


