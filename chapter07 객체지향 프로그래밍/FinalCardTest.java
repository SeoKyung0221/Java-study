class Card3{
	final int NUMBER; // ������� ����� �Բ� �ʱ�ȭ ���� �ʰ�
	final String KIND; // �����ڿ��� �� �ѹ��� �ʱ�ȭ�� �� �ִ�.
	static int width = 100;
	static int height = 250;
	
	Card3(String kind, int num){
		KIND = kind;
		NUMBER = num; // �Ű������� �Ѱܹ��� ������ KIND�� NUMBER�� �ʱ�ȭ�Ѵ�.
	}
	Card3(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

class FinalCardTest{
	public static void main(String args[]) {
		Card3 c = new Card3("HEART",10);
		// c. NUMBER = 5; <- �̰� ������ ���. NUMBER�� ��������̱� ������ 
		// ����̱� �����̴�.
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // System.out.println(c.toString());
	}
}