public class Exercise3 { // 3-1번 문제
	public static void main(String [] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // A의 유니코드는 65
		
		System.out.println(1+x<<33); // 6
		System.out.println(y>=5 || x<0 && x>2); // true
		System.out.println(y+=10-x++); // 13, x값은 후위형이기 때문에 -가 먼저 연산된다.
		System.out.println(x+=2); // 5
		System.out.println(!('A'<=c && c<='Z')); // false
		System.out.println('C'-c); // 2
		System.out.println('5'-'0'); // 5
		System.out.println(c+1); // 66
		System.out.println(++c); // B 단항연산자는 형변환 하지 않는다.
		System.out.println(c++); // B
		System.out.println(c); // C
	}
}

class Exercise3_2 { // 3-2번 문제
	public static void main(String[] args) {
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기 (바구니에 한번에 담기는 사과의 양)
		int numOfBucket = 13; // 모든 사과를 담는데 필요한 바구니의 수
		
		 System.out.println("필요한 바구니의 수 : "+numOfBucket);
	}
}

class Exercise3_3{ // 3-3번 문제
	public static void main(String[] args) {
		int num = 10;
		System.out.println((num>0) ? "양수" : ((num==0) ? "0" : "음수"));
	}
}

class Exercise3_4{ // 3-4번 문제
	public static void main(String[] args) {
		int num = 456;
		System.out.println(num/100*100); // 소수점 이하 날려버리고 다시 곱 100!
	}
}

class Exercise3_5{ // 3-5번 문제
	public static void main(String[] args) {
		int num = 333;
		System.out.println(num/10*10+1);
	}
}

class Exercise3_6{ // 3-6번 문제
	public static void main(String[] args) {
		int num = 24;
		System.out.println(10-num%10);
	}
}

class Exercise3_7{ // 3-7번 문제
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)((5/9f * (fahrenheit-32))*100+0.5) / 100f;
				
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	} // 값에 일단 100을 곱하고 0.5를 더해서 int타입으로 반환하면 원하는 자리에서 반올림한 형태가 된다.
}	// 이를 다시 100f의 float형으로 나누어서 원하는 값의 최종형을 구하면 된다.

class Exercise3_8{ // 3-8번 문제
	public static void main(String[] args) {
		byte a=10;
		byte b=20;
		byte c=(byte)(a+b); //byte c=a+b;를 수정
		
		char ch='A';
		ch = (char)(ch+2); // ch = ch + 2;를 수정
		
		float f = 3/2f; // f 추가
		long l = 3000 * 3000 * 3000l; // l추가
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d==f2; // 비교연산자 true or false 반환 f2와 d의 타입이 달라 변환.
		
		System.out.println("c="+c);
		System.out.println(("ch="+ch));
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
}

class Exercise3_9{ // 3-9번 문제
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ('a'<=ch && ch <='z') || ('A'<=ch && ch <='Z') ||
				('0' <= ch && ch<='9');
		
		System.out.println(b);
	}
}

class Exercise3_10{ // 3-10번 문제
	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase= ('A'<=ch && ch<='Z') ? (char)(ch+32) : ch;
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}