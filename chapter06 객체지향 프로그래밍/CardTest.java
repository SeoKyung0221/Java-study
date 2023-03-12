public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Space";
		c2.number = 4;
		
		System.out.println("c1은 "+ c1.kind + ", " + c1.number+ "이며, 크기는 (" + c1.width
				+ ", " +c1.height+ ")" );
		System.out.println("c2은 "+ c2.kind + ", " + c2.number+ "이며, 크기는 (" + c2.width
				+ ", " +c2.height+ ")" );
		System.out.println("c1은 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;
		c1.height = 80; // c1으로 접근해 클래스변수 값을 변경했음에도 불구하고 c2를 통해 클래스변수 값을 접
		                // 급하면 변경된 클래스변수 값으로 출력된다.
		
		System.out.println("c1은 "+ c1.kind + ", " + c1.number+ "이며, 크기는 (" + c1.width
				+ ", " +c1.height+ ")" );
		System.out.println("c2은 "+ c2.kind + ", " + c2.number+ "이며, 크기는 (" + c2.width
				+ ", " +c2.height+ ")" );
	}
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}