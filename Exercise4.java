public class Exercise4 { // 4-1
	// 1. 10 < x && x < 20
	// 2. !(ch!==' ' || ch!=='\t')
	// 3. ch == 'x' || ch == 'X'
	// 4. '0' <= ch && ch <= '9'
	// 5. ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')
	// 6. year % 400 == 0 || year % 4 == 0 && year % 100 != 0
	// 7. !power0n
	// 8. str.equals("yes")
}

class Exercise4_2{ // 4-2
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=20; i++) {
			if(!((i%2==0)||(i%3==0))) {
				sum += i; // 1~20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 코드
			}
		}
	}
}

class Exercise4_3{ // 4-3
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				sum += j; // (1)+(1+2)+(1+2+3)...+(1+...+10)의 결과 계산 코드
			}
		}
	}
}

class Exercise4_4{ // 4-4
	public static void main(String[] args) {
		int sum = 0;
		int s =1;
		int num = 0;
		
		for(int i=1; true; i++, s=-s) { // for문 안에 조건문 세개는 여러개로 나올 수도 있다! 명심!
			num = s *i;
			sum += num;
			
			if(sum>=100)
				break;
		}
		System.out.println("num="+num);
		System.out.println("sum="+sum); // sum으로만 풀 수는 있지만 어떤 수 num에서 sum>100인지 알아내야함.
	}
}

class Exercise4_5{ // 4-5
	public static void main(String[] args) {
		int i = 0;
		
		while(i<=10) { // while로 for문을 대신해서 표현
			int j = 0;
			
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

class Exercise4_6{ // 4-6
	public static void main(String[] args) {
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.println("["+i+","+j+"]");
				}
			}
		}
	}
}

class Exercise4_7{ // 4-7
	public static void main(String[] args) {
		int value = (int)(Math.random()*6+1);
		
		System.out.println("value:"+value);
	}
}

class Exercise4_8{ // 4-8
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if(2*i+4*j==10)
					System.out.println("["+i+","+j+"]");
			}
		}
	}
}

class Exercise4_9{ // 4-9
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;

		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i)-'0'; // charAt(int i)를 하면 각 자리의 문자열이 출력된다. 숫자가
		}							  // 아니라서 아스키코드에 해당하는 만큼 '0'을 빼주어야 그 값이 숫자로 변환된다.
		System.out.println("sum="+sum);
	}
}

class Exercise4_10{ // 4-10
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			sum += num %10; // 일단 맨 뒷자리부터 나머지로 하나씩 구하고
			num /= 10; // int의 계산이므로 실수형의 계산 즉, 소수점은 버리면서 온다.
		}
		System.out.println("sum="+sum);
	}
}

class Exercise4_11{ // 4-11
	public static void main(String[] args) {
		// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1+","+num2);
		
		for(int i=0; i< 8; i++) {
			num3 = num1+ num2;
			System.out.print(","+num3); // 피보나치 합 출력
			num1 = num2; // 수열의 순서 바꾸기
			num2 = num3;
		}
	}
}

class Exercise4_12{ // 4-12
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=3; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}
}

class Exercise4_13{ // 4-13
	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
		// 하나씩 읽어서 검사한다.
		for(int i=0; i< value.length(); i++) {
			ch=value.charAt(i);
			
			if(!('0'<=ch && ch <= '9')) { // 문자로 출력되기 때문에 아스키 코드 사이에서 0~9사이인지
				isNumber = false;		  // 테스트 만약 아니라면 isNumber = false로 이후 break로 반복문 탈출
				break;
			}
		}
		
		if(isNumber) {
			System.out.println(value+"는 숫자입니다.");
		} else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}
	}
}

class Exercise4_14{ // 4-14
	public static void main(String[] args) {
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random()*100+1);
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		
		// 화면으로부터 사용자입력을 받기 위해서 Scanner클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
			
			if(input > answer)
				System.out.println("down");
			else if(input < answer)
				System.out.println("up");
			else if(input==answer) {
				System.out.println("정답입니다. 시도했던 횟수는 "+count+ "입니다.");
				break;
			}
		} while(true); // 무한반복문
	}
}

class Exercise4_15{ // 4-15
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		
		while(tmp!=0) {
			result = result*10 + tmp%10; // 햇갈릴 수 있는데 tmp%10을 하면서 나온 number의 맨뒷순번 수들
			tmp /= 10; 					 // result에서는 앞자리로 당기는 것이다.
		}
		
		if(number==result)
			System.out.println(number+"는 회문수 입니다.");
		else
			System.out.println(number+"는 회문수가 아닙니다.");
	}
}




