package java4;

public class munjae4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int s=1; //값의 부호를 바꿔주는데 사용할 변수
		int num=0;
		
		for(int i=1; true; i++,s=-s) {
			num = s*i; //i와 부호s를 곱해서 더할 값을 구한다.
			sum += num;
		if(sum>=100)
			break;
		System.out.println("num="+num);
		System.out.println("sum="+sum);
		}
	}

}
