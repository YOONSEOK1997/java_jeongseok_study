package java4;

public class munjae4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int s=1; //���� ��ȣ�� �ٲ��ִµ� ����� ����
		int num=0;
		
		for(int i=1; true; i++,s=-s) {
			num = s*i; //i�� ��ȣs�� ���ؼ� ���� ���� ���Ѵ�.
			sum += num;
		if(sum>=100)
			break;
		System.out.println("num="+num);
		System.out.println("sum="+sum);
		}
	}

}
