package java6;

public class class_instance_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Card width="  + Card.width); //클래스 변수(static변수)는 객체생성 없이
System.out.println("card.height=" + Card.height);//클래스 이름.클래스 변수로 직접 사용 가능

Card c1 = new Card();
c1.kind = "Heart";
c1.number = 7;

Card c2 = new Card();
c2.kind = "Diamond";
c2.number = 10;
System.out.println("c1은"+c1.kind+","+c1.number+"이며 크기는 ("+c1.width+","+c1.height+")");
System.out.println("c2는"+c2.kind+","+c2.number+"이며 크기는 ("+c2.width+","+c2.height+")");
System.out.println("c1의 width 와 height의 값을 각각 50 , 80 으로 변경");
c1.width = 50;
c1.height = 80;
System.out.println("c1은"+c1.kind+","+c1.number+"이며 , 크기는"+c1.width+c1.height);

	

	}

}
class Card{
	String kind ;
	int number;
	static int width = 100;
	static int height = 250;
}