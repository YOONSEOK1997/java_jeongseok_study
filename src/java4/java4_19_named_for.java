package java4;

public class java4_19_named_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop1 : for(int i=2; i <=9; i++ ) {
			for(int j=1; j<=9; j++) {
				if(j==6	)
					break Loop1;
// 					break;
//					continue Loop1;
//					continue;
				System.out.println((i+"*"+j+"="+i*j));
			} //end of for i
		}System.out.println();
	}//end of Loop1

}
