package java6;

public class java6_5_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();//먼저 인스턴스를 생성한다.
//		long result1 = mm.add(5, 3); //매서드 호출
//		long answer = mm.subtract(10,3);
//		int result = mm.max(5,8);
//		int minresult = mm.min(10,123);
		int maxresult = mm.max(100,200);
		mm.printGugudan(9);
//		System.out.println("add(5L,3L) ="+ result1);
//		System.out.println("answer(10,3)="+answer); 
//		System.out.println("max(a,b)="+result);
//		System.out.println("min(a,b)="+minresult);
		System.out.println("max(a,b)="+maxresult);
		mm.printGugudan(8);
}
}

//class MyMath {
//	long add(long a, long b) {
//		long result = a+b;
//		return result;
//		//return a+b; //위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
//	}
	class MyMath {
		int max(int a,int b) {
		int maxresult = 0;
		maxresult = a > b ? a : b;
		return maxresult;
	}
		void printGugudan(int dan) {
			for(int i=1; i<=9; i++)
			System.out.printf("%d x %d = %d%n",dan,i,dan*i);
		}
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
//		
//	int max(int a,int b) {
//		int result =0;
//		if(a>b) {
//			result =a;
//		}else { 
//			result =b;
//		}
//		return result;
//	}
//	int min(int a,int b) {
//		int minresult =0;
//		minresult = a < b ? a:b;
//		return minresult;
//	}
//	long add(long a, long b) {return a+b;}
//	long subtract(long a, long b) {return a - b;}
//	long multiply(long a, long b) {return a * b;}
//	double divide(double a, double b) {return a / b;}
//	
//}

//매서드 문장들을 묶어놓은 것
//(1)클래스 안에 있어야함  (but 함수는 따로 있어도됨)
//장점 : 코드의 중복을 줄일 수 있다. 관리가 쉽다. 재사용가능. 간결해서 이해해서 쉬움
//지역변수 : 매서드 내에 선언된 변수

/////////////
//매서드 호출
//매서드 이름(값,값2, .....) /////메서드를 호출하는 방법
//print99danAll(); //void print99danAll()을 호출
//int reuslt = add(3,5); int add (int x, int y)을 호출하고,결과를 result에 저장

