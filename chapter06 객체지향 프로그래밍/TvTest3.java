class TvTest3 {
	public static void main(String args[]) {
		Tv t1 = new Tv(); // Tv t1; t1= new Tv();�� �ѹ������� ǥ�� ����
		Tv t2 = new Tv();
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t2 = t1; // t1�� �����ϰ� �ִ� ��(�ּ�)�� t2�� �����Ѵ�.
		t1.channel = 7; // ä���� ���� 7�� ����(t1�� �������)
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� "+ t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}
}

// t2�� t1�� �ν��Ͻ��� �ּҸ� �����ϱ� ������ ���� t2�� �����ϰ� �ִ� Tv�� �ν��Ͻ�(��ü)�� ������ �÷��Ϳ� ����
// �ڵ������� �޸𸮿��� ���ŵȴ�.