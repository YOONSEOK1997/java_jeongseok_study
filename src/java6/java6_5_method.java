package java6;

public class java6_5_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();//���� �ν��Ͻ��� �����Ѵ�.
//		long result1 = mm.add(5, 3); //�ż��� ȣ��
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
//		//return a+b; //���� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
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

//�ż��� ������� ������� ��
//(1)Ŭ���� �ȿ� �־����  (but �Լ��� ���� �־��)
//���� : �ڵ��� �ߺ��� ���� �� �ִ�. ������ ����. ���밡��. �����ؼ� �����ؼ� ����
//�������� : �ż��� ���� ����� ����

/////////////
//�ż��� ȣ��
//�ż��� �̸�(��,��2, .....) /////�޼��带 ȣ���ϴ� ���
//print99danAll(); //void print99danAll()�� ȣ��
//int reuslt = add(3,5); int add (int x, int y)�� ȣ���ϰ�,����� result�� ����

