public class Exercise3 { // 3-1�� ����
	public static void main(String [] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // A�� �����ڵ�� 65
		
		System.out.println(1+x<<33); // 6
		System.out.println(y>=5 || x<0 && x>2); // true
		System.out.println(y+=10-x++); // 13, x���� �������̱� ������ -�� ���� ����ȴ�.
		System.out.println(x+=2); // 5
		System.out.println(!('A'<=c && c<='Z')); // false
		System.out.println('C'-c); // 2
		System.out.println('5'-'0'); // 5
		System.out.println(c+1); // 66
		System.out.println(++c); // B ���׿����ڴ� ����ȯ ���� �ʴ´�.
		System.out.println(c++); // B
		System.out.println(c); // C
	}
}

class Exercise3_2 { // 3-2�� ����
	public static void main(String[] args) {
		int numOfApples = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ�� (�ٱ��Ͽ� �ѹ��� ���� ����� ��)
		int numOfBucket = 13; // ��� ����� ��µ� �ʿ��� �ٱ����� ��
		
		 System.out.println("�ʿ��� �ٱ����� �� : "+numOfBucket);
	}
}

class Exercise3_3{ // 3-3�� ����
	public static void main(String[] args) {
		int num = 10;
		System.out.println((num>0) ? "���" : ((num==0) ? "0" : "����"));
	}
}

class Exercise3_4{ // 3-4�� ����
	public static void main(String[] args) {
		int num = 456;
		System.out.println(num/100*100); // �Ҽ��� ���� ���������� �ٽ� �� 100!
	}
}

class Exercise3_5{ // 3-5�� ����
	public static void main(String[] args) {
		int num = 333;
		System.out.println(num/10*10+1);
	}
}

class Exercise3_6{ // 3-6�� ����
	public static void main(String[] args) {
		int num = 24;
		System.out.println(10-num%10);
	}
}

class Exercise3_7{ // 3-7�� ����
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)((5/9f * (fahrenheit-32))*100+0.5) / 100f;
				
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	} // ���� �ϴ� 100�� ���ϰ� 0.5�� ���ؼ� intŸ������ ��ȯ�ϸ� ���ϴ� �ڸ����� �ݿø��� ���°� �ȴ�.
}	// �̸� �ٽ� 100f�� float������ ����� ���ϴ� ���� �������� ���ϸ� �ȴ�.

class Exercise3_8{ // 3-8�� ����
	public static void main(String[] args) {
		byte a=10;
		byte b=20;
		byte c=(byte)(a+b); //byte c=a+b;�� ����
		
		char ch='A';
		ch = (char)(ch+2); // ch = ch + 2;�� ����
		
		float f = 3/2f; // f �߰�
		long l = 3000 * 3000 * 3000l; // l�߰�
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d==f2; // �񱳿����� true or false ��ȯ f2�� d�� Ÿ���� �޶� ��ȯ.
		
		System.out.println("c="+c);
		System.out.println(("ch="+ch));
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
}

class Exercise3_9{ // 3-9�� ����
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ('a'<=ch && ch <='z') || ('A'<=ch && ch <='Z') ||
				('0' <= ch && ch<='9');
		
		System.out.println(b);
	}
}

class Exercise3_10{ // 3-10�� ����
	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase= ('A'<=ch && ch<='Z') ? (char)(ch+32) : ch;
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}