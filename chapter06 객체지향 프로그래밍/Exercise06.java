// 06�� ��ü���� ���α׷���1

class SutdaCard{ // 6-1
	int num; // 1~10������ ����
	boolean isKwang; // ���̸� true, �ƴϸ� false.
}

class Exercise6_2{ // 6-2
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
	}
}
