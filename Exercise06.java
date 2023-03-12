// 06장 객체지향 프로그래밍1
/*
class SutdaCard{ // 6-1
	int num; // 1~10사이의 정수
	boolean isKwang; // 광이면 true, 아니면 false.
}
*/
class SutdaCard{
	int num; // 1~10사이의 정수
	boolean isKwang; // 광이면 true, 아니면 false.
	
	SutdaCard(){
		this(1, true); // 또다른 생성자 호출.
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang? "K" : ""); // isKwang이 트루면 K(wang) 출력, 아니라면 출력X.
	}
} // 6-2번 문제의 SutdaCard 클래스 문장.
class Exercise6_2{ // 6-2
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.print(card2.info());
	}
}

/*
class Student{ // 6-3
	String name; // 학생이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수
}
*/
class Student{
	String name; // 학생이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수
	
	int getTotal() {
		int sum = 0;
		sum += kor + eng + math;
		return sum;	
	}
	float getAverage() {
		float average;
		average = (int)(getTotal() / 3.0f * 10 + 0.5f) / 10f; // 소수 둘째자리에서 반올림하는 이 계산 꼭 기억하자!
		return average;
	}
} // 6-4번 문제의 Student 클래스 문장.
class Exercise6_4 { // 6-4
	public static void main(String args[]) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
	}
}
/* 6-5
	String info(){
	return name + ","+ ban + ","+ no + ","+ kor + ","+ eng + ","+ math + ","+
	 getTotal() + ","+ getAverage();
*/

class Exercise6_6{ // 6-6
	// 두점 (x, y)와 (x1, y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt(((x1-x)*(x1-x))+((y1-y)*(y1-y)));
	} // math.pow를 이용해도 되지만 그냥 제곱이라 안했다.
	// 메서드를 호출하는게 곱셈연산보다 비용이 많이 드는 작업이다!! 꼭 기억해둘것!
	
	public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
	}
}

// 6-7
class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	double getDistance(int a, int b) {
		return Math.sqrt(((a-x)*(a-x))+((b-y)*(b-y)));
	}
}
class Exercise6_7{
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1);
		
		// p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));
	}
}

/* 6-8
클래스 변수: width, height
인스턴스 변수: kind, num
지역변수: x, n, card(참조변수)
 */

/* 6-9
weapon, armor 같은 경우 모든 개체가 동일해야한다. 추가적으로 생성되는 객체(인스턴스)에 관계없이 공격력과 방어력의 상승은
이루어질 수 있는 것이므로 weaponUp(), armorUp()는 static을 붙여 클래스 메서드가 되어야한다.
 */

/* 6-10
b(객체를 생성하는게 아니라 초기화를 위한 것), e(매개변수를 다르게하여 오버로딩 가능)
 */

/* 6-11
b(d가 반래가 되어준다. 클래스 메서드 내에서는 사용이 불가능하다.)
 */

/* 6-12
c(리턴타입은 달라도 오버로딩의 영향을 주지 않는다. 오버로딩에 영향을 주는 것은 오직 매개변수이다.) d(이름이 다른것은 관계없다. 타입
혹은 개수가 달라야 한다.)
 */

/* 6-13
b, c, d 모두 오버로딩의 조건을 만족한다. 즉, 매개변수가 타입이 다르다.
 */

/* 6-14
c(초기화 블럭이 먼저 수행된다.), d(클래스변수가 먼저 초기화된다. 클래스 선언과 동시에 초기화 된다고 보면된다.)
 */

/* 6-15
a(클래스 변수가 아닌 인스턴스 변수이다. 인스턴스 변수는 기본값, 명시적 초기화, 초기화 블럭, 생성자 순으로 초기화된다.)
 */

/* 6-16
a(자동 초기화 안된다.), e(stack영역에 생성된다. heap은 인스턴스 변수다.)
*/

/* 6-17
b(아니다. 모두 실행중이다.) // f가 햇갈릴 수 있는데 다른 메서드들은 종료는 아니지만 실행은 아닌 대기상태이다.
 */

/* 6-18
A(클래스 변수의 값으로 인스턴스 변수를 할당할 수는 없다.)
B(클래스 함수는 인스턴스 변수를 호출할 수 없다.), D(클래스 함수가 인스턴스 함수를 호출할 수는 없다.)
 */

/* 6-19
ABC123
After change:ABC123 매개변수에 의한 호출이고 change메서드로부터 반환되는 것도 없으니 str은 변경되지 않는다.
 */

/* 6-20 -> 정답을 반만 맞춘 문제. 일단 for문의 반복크기를 arr.length의 두배가 아닌 그냥 arr.length처리했고
첫문장의 if문으로 입력받은 arr의 예외 처리를 하지 못했다.
class Exercise6_20{
	public static int[] shuffle(int[] arr){
		if(arr==null || arr.length==0)
			return arr;
			
	for(int x=0; x<arr.length*2; x++){
		int i = (int)(Math.random()*arr.length);
		int j = (int)(Math.random()*arr.length);
		
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	return arr;
}
 */

/* 6-21
void turnOnOff(){
	isPowerOn = !ispowerOn;
}
void volumeUp(){
	if(volume < MAX_VOLUME)
		volume++;
}
void VolumeDown(){
	if(volume > MIN_VOLUME)
		volume--;
}
void channelUp(){
	if(channel == MAX_CHANNEL)
		channel = MIN_CHANNEL;
	else
		channel++;
}
void channelDown(){
	if(channel == MIN_CHANNEL)
		channel = MAX_CHANNEL;
	else
		channel--;
}
 */

/* 6-22 -> 마찬가지로 입력받은 str에 대한 입력처리를 하지 못함.
boolean isNumber(String str){
	if(str==null || str.equals(""))
		return false;
	
	for(int i=0; i<str.length(); i++){
		char ch = str.charAt(i); // str문장 하나씩 문자로 추출.
		
		if(ch < '0' || ch > '9'){
			return false;
		}
	}
	return true;
}
 */

/* 6-23
int max(int[] arr){
	int max = 0;
	
	if(arr==null || arr.length==0)
		return -999999;
	
	for(int i=0; i<arr.length; i++){
		if(a[i] > max)
			max = a[i];
		}
	return max;	
}
*/

/* 6-24
int abs(int value){
	if(value>0)
		return value;
	else
		return -value;
} // return value >=0 ? value : -value; 로 해도된다.
*/

