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
				sum += i; // 1~20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���ϴ� �ڵ�
			}
		}
	}
}

class Exercise4_3{ // 4-3
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				sum += j; // (1)+(1+2)+(1+2+3)...+(1+...+10)�� ��� ��� �ڵ�
			}
		}
	}
}

class Exercise4_4{ // 4-4
	public static void main(String[] args) {
		int sum = 0;
		int s =1;
		int num = 0;
		
		for(int i=1; true; i++, s=-s) { // for�� �ȿ� ���ǹ� ������ �������� ���� ���� �ִ�! ���!
			num = s *i;
			sum += num;
			
			if(sum>=100)
				break;
		}
		System.out.println("num="+num);
		System.out.println("sum="+sum); // sum���θ� Ǯ ���� ������ � �� num���� sum>100���� �˾Ƴ�����.
	}
}

class Exercise4_5{ // 4-5
	public static void main(String[] args) {
		int i = 0;
		
		while(i<=10) { // while�� for���� ����ؼ� ǥ��
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
			sum += str.charAt(i)-'0'; // charAt(int i)�� �ϸ� �� �ڸ��� ���ڿ��� ��µȴ�. ���ڰ�
		}							  // �ƴ϶� �ƽ�Ű�ڵ忡 �ش��ϴ� ��ŭ '0'�� ���־�� �� ���� ���ڷ� ��ȯ�ȴ�.
		System.out.println("sum="+sum);
	}
}

class Exercise4_10{ // 4-10
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			sum += num %10; // �ϴ� �� ���ڸ����� �������� �ϳ��� ���ϰ�
			num /= 10; // int�� ����̹Ƿ� �Ǽ����� ��� ��, �Ҽ����� �����鼭 �´�.
		}
		System.out.println("sum="+sum);
	}
}

class Exercise4_11{ // 4-11
	public static void main(String[] args) {
		// Fibonnaci ������ ������ ù �� ���ڸ� 1, 1�� �Ѵ�.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // ����° ��
		System.out.print(num1+","+num2);
		
		for(int i=0; i< 8; i++) {
			num3 = num1+ num2;
			System.out.print(","+num3); // �Ǻ���ġ �� ���
			num1 = num2; // ������ ���� �ٲٱ�
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
		
		// �ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ�
		// �ϳ��� �о �˻��Ѵ�.
		for(int i=0; i< value.length(); i++) {
			ch=value.charAt(i);
			
			if(!('0'<=ch && ch <= '9')) { // ���ڷ� ��µǱ� ������ �ƽ�Ű �ڵ� ���̿��� 0~9��������
				isNumber = false;		  // �׽�Ʈ ���� �ƴ϶�� isNumber = false�� ���� break�� �ݺ��� Ż��
				break;
			}
		}
		
		if(isNumber) {
			System.out.println(value+"�� �����Դϴ�.");
		} else {
			System.out.println(value+"�� ���ڰ� �ƴմϴ�.");
		}
	}
}

class Exercise4_14{ // 4-14
	public static void main(String[] args) {
		// 1~100������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int)(Math.random()*100+1);
		int input = 0; // ������Է��� ������ ����
		int count = 0; // �õ�Ƚ���� �������� ����
		
		// ȭ�����κ��� ������Է��� �ޱ� ���ؼ� ScannerŬ���� ���
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			input = s.nextInt(); // �Է¹��� ���� ���� input�� �����Ѵ�.
			
			if(input > answer)
				System.out.println("down");
			else if(input < answer)
				System.out.println("up");
			else if(input==answer) {
				System.out.println("�����Դϴ�. �õ��ߴ� Ƚ���� "+count+ "�Դϴ�.");
				break;
			}
		} while(true); // ���ѹݺ���
	}
}

class Exercise4_15{ // 4-15
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result = 0; // ���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
		
		while(tmp!=0) {
			result = result*10 + tmp%10; // �ް��� �� �ִµ� tmp%10�� �ϸ鼭 ���� number�� �ǵ޼��� ����
			tmp /= 10; 					 // result������ ���ڸ��� ���� ���̴�.
		}
		
		if(number==result)
			System.out.println(number+"�� ȸ���� �Դϴ�.");
		else
			System.out.println(number+"�� ȸ������ �ƴմϴ�.");
	}
}




