import java.awt.Frame;
import java.awt.event.WindowEvent;

class Exercise_01{
	for(int i = 0; i < cards.length; i++) {
		int num = i % 10 + 1;
		boolean isKwang = (i < 10) && (num==1 || num == 3 || num == 8);
		
		cards[i] = new SutdaCard(num, isKwang);
		// 인스턴스를 담는 배열을 채우는 문제이다! 객체배열이란 개념에 대해서 꼭 유념하자.
		// new (class이름)은 항상 인스턴스를 생성한다는 것을 잊지말자!!!!
	}
}

class Exercise_02{
	void shuffle() {
		for(int i = 0; i < cards.length*2; i++) { // 적당히 섞이게 2배횟수만큼 섞음
			int x = (int)(Math.radom()*cards.length); // 배열의 인덱스 중 한 개. [0, cards.length)
			int y = (int)(Math.random()*cards.length);
			// 여기서 저장할 temp를 선언해야하는데 배열 cards[]은 SutdaCard가 그 참조형이다.
			// 그러므로 int와 같은 기본형이 아니라 저장되어 있는 인스턴스의 참조형으로 선언해야한다.
			SutdaCard temp = cards[x];
			cards[x] = cards[y];
			cards[y] = temp;
		}
 	}
	SutdaCard pick(int index) {
		// *유효성 검사를 해주어야함. index의 범위를 체크하라는 말!! 테스트도 그렇고 코드 구축도
		// 그렇고 무조건 예외 설정을 해주어야한다.
		if(index < 0 || index >= cards.length)
			return null; // 틀리면 아무것도 반환 x
		return cards[index];
	}
	
	SutdaCard pick() {
		int x = (int)(Math.random()*cards.length);
		return cards[x]; // 혹은 다른 pick함수인  pick(x)로 호출한다.
	}
}

class Exercise_03{
	/*
	오버라이딩은 조상 클래스의 메서드를 자손 클래스에서 그 쓰임새에 맞게 내용을 변경하는 것. 재정의하는
	것을 말한다. 조상 클래스의 메서드를 그대로 사용 못하는 경우가 있어서 자손 클래스에서 변경해서 사용하는
	오버라이딩은 꼭 필요하다.
	 */
}

class Exercise_04{
	/*
	c : 접근제어자는 조상보다 더 넓은 범위로만 변경가능. 보통은 같은 것으로 함.
	d : 예외는 조상보다 너 적게 선언할 수 있음.
	여기서는 언급안되지만 static같은 경우에도 static을 붙이거나 뺄 수 없음.
	 */
}

class Exercise_05{
	// Tv는 Product를 상속받았다. 즉 자손클래스이다. 그렇다면 자손 클래스의 상속자는
	// 반드시 첫줄에서 조상 클래스의 생성자를 호출해야한다. 여기서는 호출이 되있지 않다. 이에 컴파일러가
	// 빈 생성자 super();를 불러올 것인데 문제는 Product 클래스에는 default 생성자가 없다는 것이다.
	// 그러므로 컴파일 에러가 발생한다. 이를 해결하기 위해서는 Product에 defaul 생성자를 추가하거나ㅣ
	// Tv 클래스 생성자의 첫줄에 Product(int price)의 조상 클래스의 생성자를 넣어야한다.
}

class Exercise_06{
	// 자손 클래스에서 인스턴스를 생성하면 조상으로부터 상속받은 변수들도 생성이된다. 즉,
	// 이 변수들에 대해서 초기화가 되어야하기 때문에 자손 클래스의 생성자의 첫 줄에서 조상 클래스의
	// 생성자를 호출하는 것이다.
}

class Exercise_07{
	/*
	컴파일러가 조상 클래스의 생성자를 암시적으로 호출하므로
	Child(), Parent(), Parent(int x), Child(int x) 순으로 호출된다. 
	// 그런줄 알았으나 Child의 생성자가 모두되고 그 다음 Parent 생성자가 호출된다. 이유는 모르겠다. 약속인가?
	이에 따라  Parent의 x = 200, Child의 x = 1000이다.
	c가 getX()로 메서드를 호출하는데 getX는 조상클래스의 메서드이므로 Parent클래스의
	x를 의미한다. 즉, 200이 출력된다.
	 */
}

class Exercise_08{
	// 넓은 순서대로 나열하면 a이다.
}

class Exercise_09{
	// c 오버로딩이 아니라 오버라이딩이다. 오버로딩은 그냥 이름만 같은 새로운 함수이다.
}

class Exercise_10{ // 유효성 검사 잊지말것!!
	// isPowerOn, channel, volume에 private를 붙여서 접근을 제한시킨다.
	
	public boolean getIsPowerOn() {
		return isPowerOn;
	}
	public void setIsPowerOn(boolean a) {
		isPowerOn = a;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if(channel < 1 || channel > 100)
			return;
		
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if(volume < 0 || volume > 100)
			return;
		
		this.volume = volume;
	}
}

class Exercise_11{
	class MyTv2{
	 // 10번에서 작성한 get, set함수 등의 멤버가 모두 있다고 가정한다.
		private int prevChannel = 10;
	// setChannel 변형
		public void setChannel(int channel) {
			// 유효성 검사 생략
			prevChannel = this.channel;
			this.channel = channel;
		}
		public void gotoPrevChannel() {
			setChannel(prevChannel);
		}
	}
}

class Exercise_12{
	/*
	c 지역변수에는 접근 제어자 사용불가.
	 */
}

class Exercise_13{
	/*
	생성자를 private로 해놓음으로써 다른 클래스가 이를 상속받아 사용하지 못하게 하는 것이다.
	-> 틀렸다. Math클래스의 모든 메서드는 static메서드이기 때문에 인스턴스 변수가 존재하지 않아
	객체를 생성할 필요가 없기 때문이다.
	 */
}

class Exercise_14{
	// 멤버 변수를 전부 final 제어자를 붙여 상수로 만들고 이를 생성자에서만 초기화 할 수 있게 한다.
	final int NUM;
	final boolean IS_KWANG; // 상수니까 모두 대문자처리
	
	SutdaCard(int num, boolean isKwang){
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}
	// public String toString() 메서드의 내용도 num, isKwang를
	// 바뀐 상수로 NUM, IS_KWANG로 바꾸면 된다.
}

class Exercise_15{
	/*
	 e u는 tank의 조상 인스턴스를 참조하는 참조변수이다. 조상 인스턴스를 자손 참조변수에
	 할당 가능한가? 답은 불가능하다. 왜냐하면 자손 참조변수가 참조할 수 있는 멤버의 개수가 많기 때문이다.
	 */
}

class Exercise_16{
	/*
	 e 하나는 형제관계이므로 서로의 인스턴스가 포함되있다던가의 관계가 아니다.
	 그러므로 연산결과가 false가 출력된다.
	 
	 b가 implement라 햇갈릴 수 있는데 구현은 Movable의 인스턴스가
	 FireEngine클래스 안에 구현되있는 것이므로 연산결과가 true다.
	 */
}

class Exercise_17{
	class Unit{ // 유닛
		int x, y;
		abstract void move(int x, int y); // 추상 클래스로 만들어버린다. 내용 구현X
	}
	// 이후 Marine, Tank, Dropship 모두 extends Unit으로 상속받는다.
	// 각자의 클래스에서 move 구현.
}

class Exercise_18{ // static 메서드 아니면 전부다 참조변수로부터 콜해야함.
	void action(Robot r) {
		if(r instanceof DanceRobot)
			DanceRobot dr = (DanceRobot)r;
			dr.Dance();
		if(r instanceof SingRobot)
			// 같은 방식으로 참조변수를 생성하고 Sing호출
		if(r instanceof DrawRobot)
			// 같은 방식으로 참조변수를 생성하고 Draw호출
	}
}

class Exercise_19{
	// 책에 있는 내용그대로여서 풀지 않았다. 테스트로 하나의 로직을 구현해보았는데
	// 너무 책이랑 똑같이 구현해서 굳이 필요없을 것 같아 풀지않았다.
}

class Exercise_20{ // 메서드는 인스턴스에 멤버변수는 참조변수에 영향을 받음을 잊지말자!
	/*
	p.x = 100
	Child Method
	p.x = 200
	Child Method
	 */
}

class Exercise_21{
	// null, Movable 인터페이스를 구현한 클래스(자손클래스)
	// null은 그냥 뭐... interface는 자체적으로 인스턴스를 생성할 수 없으니 매개변수 역할X
	// 그러므로 아예 안들어가는 null이거나 이를 구현에 성공한 클래스 인스턴스이다.
}

class Exercise_22{
	class Re extends Shape{
		double width;
		double height;
		
		Re(double width, double height){
			this(new Point(0,0), width, height);
		}
		
		Re(Point p, double width, double height){
			super(p);
			this.width = width;
			this.height = height;
		}
		
		boolean isSquare() {
			// 이걸 빼먹었다. 예외 설정은 꼭해주어야한다.
			return width*height!=0 && width==height;
		}
		
		double AreaSum() {
			return width*height;
		}
	}
	
	class Circle extends Shape{
		double r;
		
		Circle(double r){
			this(new Point(0,0), r);
		}
		Circle(Point p, double r){
			super(p);
			this.r = r;
		}
		double AreaSum() {
			return Math.PI*r*r;//PI구현 어케하는거야
		}
	}
}

class Exercise_23{
	static double sumArea(Shape[] arr) {
		double sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			sum+=arr[i].AreaSum(); // arr[i]는 인스턴스
		}
		return sum;
	}
}

class Exercise_24{
	// e 패키지간의 연결을 도와주지 않는다. 나머지는 모두 옳은말이다.
}

class Exercise_25{
	Outer o = new Outer();
	Outer.Inner ii = o.new Inner();
	System.out.println(ii.iv);
}

class Exercise_26{
	Outer.Inner ii = new Outer.Inner();
	System.out.println(ii.iv); // static inner class기 때문에 외부 클래스의 인스턴스
	// 생성 없이도 그냥 가능하다. static 멤버가 인스턴스 생성없이 사용할 수 있었던 것처럼!
}

class Exercise_27{
	/*
	(1) value
	(2) this.value
	(3) Outer.this.value
	(4) Outer o = new Outer();
		Outer.Inner inner = o.new Inner(); // 인스턴스 클래스를 사용하기위해 외부 클래스 인스턴스 생성
	 */
}

class Exercise_28{
	// 익명클래스기 때문에 외부의 선언과 정의가 되어있는 클래스를 없애고 main함수로 합류 시킨다.
	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);  // new WindowAdapter()까지는 익명 클래스의 특성으로 했는데
				// 그 이하는 모르겠어서 답안을 참고했다.
			}
		});
	}
}

class Exercise_29{
	// 지역변수를 제공한 메서드가 종료되고 지역 변수가 소멸됨에도 불구하고 지역 클래스의 인스턴스가
	// 이 지역변수를 호출할 수 있기 때문이다. 소멸된 것을 호출할 수 없으니 문제가 생기기 때문에
	// final이 붙은 상수만 접근이 가능하다.
}
