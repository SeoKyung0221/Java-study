import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		// ���� : d, e
		// int[] arr = new int[5]{1,2,3,4,5} <-�ι�° ���ȣ���� ���ڰ� ���� �ȵȴ�.
		// ��ȣ���� ����ΰ� �ʱ�ȭ ���Ѽ� �� ũ�⸦ �����ϴ� ���̱� ������ ����!
		// int arr[5] <- ���������� ���ȣ�� ���ڰ� ���� �ȵȴ�. �迭�� �����ϴ� �κ�
	}
}

class Exercise5_2 { // 2�� ����
	public static void main(String[] args) {
		// arr[3].length�� 2�����迭�� 4���� ���� ������ �ǹ��Ѵ�. ��, 2�̴�.
		// ���⼭ ���� [3]�̶�� 3������ �����ؼ� �ȵȴ�. �迭�� [0]���� �������� �� �������.
	}
}

class Exercise5_3 { // 3�� ����
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum="+sum);
	}
}

class Exercise5_4 { //4�� ����
	public static void main(String[] args) {
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		int total = 0;
		float average = 0; // 0.0f�� �ؾ����� �ʳ�?
		
		float count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
				count++;
			}
		}
		average = total / count;
		System.out.println("total="+total);
		System.out.println("average="+average);
	}
}

class Exercise5_5 { // 5�� ����
	public static void main(String[] args) {
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		// �迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0;
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		// �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		for(int i=0; i<ball3.length; i++) { // �̰͵� Ʋ�� ���� �ƴϴ� ������! 
			ball3[i] = ballArr[i]; // System.arraycopy(ballArr, 0, ball3, 0, 3)�� ��������!
		}
		for(int i=0; i<ball3.length; i++) {
			System.out.print(ball3[i]);
		}
	}
}

class Exercise5_6 { // 6�� ����
	public static void main(String[] args) {
		// ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"��: "+money/coinUnit[i]);
			money %= coinUnit[i];
		}
	}
}
// import java.util.*; // <- 7�� ������ å�� �������� Ǯ�鼭�� ������ ������ Ŀ�ǵ� ������ ���� �Է��� �ȵȴ�.
// �׷��� �ӽ÷� Scanner Ŭ������ �̿��ؼ� �Է��Ϸ��� �Ѵ�.
class Exercise5_7 { // 7�� ����
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String regNo = scanner.nextLine(); // ȭ���� ���� �Է¹ޱ�
		int money = Integer.parseInt(regNo); // �Է¹��� ���� ���ڷ� ��ȯ�� money�� ����.
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10}; // ������ ����
		int[] coin = {5, 5, 5, 5}; // ������ ������ ����
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;
			
			coinNum = money / coinUnit[i]; // ������ ����
			if(coinNum > coin[i]) { // �迭 coin���� coinNum��ŭ�� ��������.
				coin[i] = 0;
				coinNum = 5; // coin�� �Ѿ ������ �ʿ��ϸ� �ִ� ���� 5���� coinNum�� ����.
			} else
				coin[i] -= coinNum;
			
			money = money - (coinNum * coinUnit[i]); // money���� �Ž��� �� ������ŭ ����
			
			System.out.println(coinUnit[i]+"��: "+coinNum);
		}
		
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0); // ���α׷� ����.
		}
		System.out.println("=���� ������ ���� =");
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"��:"+coin[i]);
		}
	}
}

class Exercise5_8 { // 8�� ����
	public static void main(String[] args) {
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++) {
			counter[answer[i]-1]++; // �� ������ ��������. -1�� �ϴ� ������ [0]���� �迭�� �����ϴϱ�
		}
		for(int i=0; i<counter.length; i++) {
			System.out.print(counter[i]);
			for(int j=0; j<counter[i]; j++) {
				System.out.print("*"); // *�� 1~4�� ������ ������ŭ ���.
			}
			System.out.println();
		}
	}
}

class Exercise5_9{ // 9�� ����
	public static void main(String[] args) {
		char[][] star = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				int x = j;
				int y = star.length-1-i;
				
				result[x][y] = star[i][j]; // ȸ����ų ���� ��Ģ�� �̿��� x, y�� �����ϰ� ����.
			}
		}
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}

class Exercise5_10 { // 10�� ����
	public static void main(String[] args) {
		char[] abcCode = { '`','~','!','@','#','$','%','^','&','*',
				'(',')','-','_','+','=','|','[',']','{',
				'}',';',':',',','.','/'};
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

		String src = "abc123";
		String result = "";
		
		// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			
			if('a'<=ch && ch <= 'z') {
				result+=abcCode[ch-'a'];
			} else if('0' <= ch && ch <= '9') {
				result +=numCode[ch-'0'];
			}
		}
		System.out.println("src:"+src);
		System.out.println("result:"+result);
	}
}

class Exercise5_11{ // 11�� ����
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				result[i][j] = score[i][j];
				result[i][score[0].length] += score[i][j]; // ���� ��
				result[score.length][j] += score[i][j]; // ���� ��
				result[score.length][score[0].length] += score[i][j]; // �밢���� ��
			}
		}
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.printf("%4d",  result[i][j]);
			}
			System.out.println();
		}
	}
}
// import java.util.*;
class Exercise5_12 { // 12�� ����
	public static void main(String[] args) {
		String[][] words = {
				{"chair", "����"}, // words[0][0], words[0][1]
				{"computer", "��ǻ��"}, // words[1][0], words[1][1]
				{"integer", "����"} // words[2][0], word[2][1]
		};
		
		Scanner scanner = new Scanner(System.in);
		int counter = 0; // MultiArrEx4�� ����! ���� Ƚ���� counter
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s�� ����", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�. %n%n");
				counter++;
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�. %n%n", words[i][1]);
			}
		} // for���� ��
		System.out.println("��ü 3���� �� "+counter+"���� ���߼̽��ϴ�."); // counter�� ���� ���� ���� ���
	} // main�� ��
}
//import java.util.Scanner;
class Exercise5_13 { // 13�� ����
	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray(); // String�� char[]�� ��ȯ
			
			for(int j=0; j<question.length; j++) {
				char ch = ' ';
				int h = (int)Math.random()*question.length;
				ch = question[j];
				question[j] = question[h];
				question[h] = ch; // char�迭 question �� ��� ������ ��ġ�� ���Ƿ� ���� ��ü.
			}
			
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���,>", i+1, new String(question));
			String answer = scanner.nextLine();
			
			// trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
			if(words[i].equals(answer.trim()))
					System.out.printf("�¾ҽ��ϴ�.%n%n");
			else
				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
		}
	} // main�� ��
}








