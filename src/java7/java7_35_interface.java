package java7;

public class java7_35_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//interface= �߻� �޼����� ����, �����Ȱ��� ���� ���� ���赵. ������ (��� ����� (public))
		//�߻�Ŭ����= �Ϲ�Ŭ�����ε� �߻�޼��带 �����ִ� ��,//�������̽� = �����Ȱ� �ƹ��͵� ����,�׳� �߻�޼��常 �� ���������
		interface PlayingCard{ //�������̽� �̸�{
		public static final int Spade =4; //Ÿ�� ����̸� = ��; (���� ���� �� ����, ���� ���)
		final int DIAMOND = 3;
		static int HEART = 2;
		int CLOVER =1;
		
		public abstract String getCardNumber();//�޼����̸�(�Ű��������) ��� interface�� ����� public 
		String getCardKind();
		}

}
