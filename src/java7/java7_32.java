package java7;

public class java7_32 {
//�߻� �޼��� - �̿ϼ� �޼���. ������(����,{})�� ���� �޼���
	//�������� ? - �� �ʿ������� �ڼո��� �ٸ��� ������ ������ ����Ǵ� ���
	abstract class Player { //�߻� Ŭ����
		abstract void play(int pos);     //�߻� �޼��� 
		abstract void stop();            //�߻� �ż���
	}
	class AudioPlayer extends Player {
		void play(int pos) { /*���� ����*/ } //�߻� �޼��带 ���� 
		void stop() { /*���� ���� */}        //�߻� �޼��带 ����   //���� �޼��� 2���� ���� 
	}
	abstract class AbstractPlayer extends Player {
		void play(int pos) { /*���� ���� */} // �߻�޼��带 ����   <---�Ѱ��� ����!! abstarct �Ⱥ��̸� ���� 
	}
}
