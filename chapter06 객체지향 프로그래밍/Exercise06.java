// 06장 객체지향 프로그래밍1

class SutdaCard{ // 6-1
	int num; // 1~10사이의 정수
	boolean isKwang; // 광이면 true, 아니면 false.
}

class Exercise6_2{ // 6-2
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
	}
}
