package java7;

abstract class Player { //�߻�Ŭ����(�̿ϼ�Ŭ����,�̿ϼ� ���赵)
	abstract void play(int pos); //�߻� �޼���(�̿ϼ� �޼���)
	abstract void stop(); //�߻� �޼���(����θ� �ְ� ������{} �� ���� �޼���
}
//�߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ���� ����
class AudioPlayer extends Player { //AudioPlayer�� �ϼ��� ���赵 
	void play(int pos) {System.out.println(pos+"��ġ ���� play�մϴ�.");}
	void stop() {System.out.println("����� ����ϴ�.");}
	}

public class java7_33 {
 public static void main(String[] args ) {
	 //Player p = new Player(); //�߻� Ŭ������ ��ü�� ����
	 AudioPlayer ap = new  AudioPlayer();
	 Player ap = new AudioPlayer(); //���⼺ 
	 ap.play(100);
	 ap.stop();
 }
}
