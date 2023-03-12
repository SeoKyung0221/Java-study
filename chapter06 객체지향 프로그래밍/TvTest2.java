class TvTest2 {
	public static void main(String args[]) {
		Tv t1 = new Tv(); // Tv t1; t1= new Tv();를 한문장으로 표현 가능
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t1.channel = 7; // channel 값을 7으로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}
}

/* 새롭게 class를 생성해서 Tv 클래스를 정의하면 alreay define이라고 뜬다. 아마 TvTest에서 이미 정의했기 때문에
그런 것 같다. 따라서 그냥 class TvTest2만 정의하였다.

class Tv {
// Tv의 속성(멤버변수)
String color; // 색상
boolean power; // 전원상태(on/off)
int channel; // 채널

// Tv의 기능(메서드)
void power() { power = !power; } // Tv를 켜거나 끄는 기능을 하는 메서드
void channerlUp() { ++channel; } // Tv의 채널을 높이는 기능을 하는 메서드
void channelDown() { --channel; } // TV의 채널을 낮추는 기능을 하는 메서드
}
*/