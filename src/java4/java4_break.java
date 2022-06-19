package java4;

public class java4_break {
//숫자를 1부터 계속 더해서나가서 며까지 더하면 합이 100넘는지 ?
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
