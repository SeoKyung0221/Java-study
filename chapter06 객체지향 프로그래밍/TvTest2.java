class TvTest2 {
	public static void main(String args[]) {
		Tv t1 = new Tv(); // Tv t1; t1= new Tv();�� �ѹ������� ǥ�� ����
		Tv t2 = new Tv();
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t1.channel = 7; // channel ���� 7���� �Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� "+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}
}

/* ���Ӱ� class�� �����ؼ� Tv Ŭ������ �����ϸ� alreay define�̶�� ���. �Ƹ� TvTest���� �̹� �����߱� ������
�׷� �� ����. ���� �׳� class TvTest2�� �����Ͽ���.

class Tv {
// Tv�� �Ӽ�(�������)
String color; // ����
boolean power; // ��������(on/off)
int channel; // ä��

// Tv�� ���(�޼���)
void power() { power = !power; } // Tv�� �Ѱų� ���� ����� �ϴ� �޼���
void channerlUp() { ++channel; } // Tv�� ä���� ���̴� ����� �ϴ� �޼���
void channelDown() { --channel; } // TV�� ä���� ���ߴ� ����� �ϴ� �޼���
}
*/