package java4;

public class java4_break {
//���ڸ� 1���� ��� ���ؼ������� ����� ���ϸ� ���� 100�Ѵ��� ?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		int i = 0;
		while (true) {
			if(sum>100)
				break;
			++i;
			sum += i;
			} //end of while
		
		System.out.println("i=" +i);
		System.out.println("sum=" + sum);
	}

}
