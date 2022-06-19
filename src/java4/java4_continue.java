package java4;

public class java4_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++) {
			if(i%3==0)
			continue; //조건식이 참이 되어 continue문이 수행되면 블럭의 끝으로 이동 
			System.out.println(i);
		}
			
	}
}
