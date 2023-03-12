import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		// 정답 : d, e
		// int[] arr = new int[5]{1,2,3,4,5} <-두번째 대괄호에는 숫자가 들어가면 안된다.
		// 괄호안을 비워두고 초기화 시켜서 그 크기를 결정하는 것이기 때문에 비우기!
		// int arr[5] <- 마찬가지로 대괄호에 숫자가 들어가면 안된다. 배열을 선언하는 부분
	}
}

class Exercise5_2 { // 2번 문제
	public static void main(String[] args) {
		// arr[3].length는 2차원배열의 4행의 열의 개수를 의미한다. 즉, 2이다.
		// 여기서 주의 [3]이라고 3행으로 착각해선 안된다. 배열은 [0]부터 시작함을 꼭 명심하자.
	}
}

class Exercise5_3 { // 3번 문제
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum="+sum);
	}
}

class Exercise5_4 { //4번 문제
	public static void main(String[] args) {
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		int total = 0;
		float average = 0; // 0.0f로 해야하지 않나?
		
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

class Exercise5_5 { // 5번 문제
	public static void main(String[] args) {
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0;
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		for(int i=0; i<ball3.length; i++) { // 이것도 틀린 것은 아니다 하지만! 
			ball3[i] = ballArr[i]; // System.arraycopy(ballArr, 0, ball3, 0, 3)을 잊지말자!
		}
		for(int i=0; i<ball3.length; i++) {
			System.out.print(ball3[i]);
		}
	}
}

class Exercise5_6 { // 6번 문제
	public static void main(String[] args) {
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
			money %= coinUnit[i];
		}
	}
}
// import java.util.*; // <- 7번 문제는 책의 예제들을 풀면서도 문제가 됐지만 커맨드 라인을 통해 입력이 안된다.
// 그래서 임시로 Scanner 클래스를 이용해서 입력하려고 한다.
class Exercise5_7 { // 7번 문제
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String regNo = scanner.nextLine(); // 화면을 통해 입력받기
		int money = Integer.parseInt(regNo); // 입력받은 값을 숫자로 변환해 money에 저장.
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10}; // 동전의 단위
		int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;
			
			coinNum = money / coinUnit[i]; // 동전의 개수
			if(coinNum > coin[i]) { // 배열 coin에서 coinNum만큼의 동전빼기.
				coin[i] = 0;
				coinNum = 5; // coin을 넘어선 개수가 필요하면 최대 코인 5개로 coinNum을 고정.
			} else
				coin[i] -= coinNum;
			
			money = money - (coinNum * coinUnit[i]); // money에서 거슬러 준 동전만큼 빼기
			
			System.out.println(coinUnit[i]+"원: "+coinNum);
		}
		
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램 종료.
		}
		System.out.println("=남은 동전의 개수 =");
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"원:"+coin[i]);
		}
	}
}

class Exercise5_8 { // 8번 문제
	public static void main(String[] args) {
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++) {
			counter[answer[i]-1]++; // 각 숫자의 개수세기. -1을 하는 이유는 [0]부터 배열이 시작하니까
		}
		for(int i=0; i<counter.length; i++) {
			System.out.print(counter[i]);
			for(int j=0; j<counter[i]; j++) {
				System.out.print("*"); // *를 1~4의 숫자의 개수만큼 찍기.
			}
			System.out.println();
		}
	}
}

class Exercise5_9{ // 9번 문제
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
				
				result[x][y] = star[i][j]; // 회전시킬 때의 규칙을 이용해 x, y를 정립하고 대입.
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

class Exercise5_10 { // 10번 문제
	public static void main(String[] args) {
		char[] abcCode = { '`','~','!','@','#','$','%','^','&','*',
				'(',')','-','_','+','=','|','[',']','{',
				'}',';',':',',','.','/'};
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

		String src = "abc123";
		String result = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
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

class Exercise5_11{ // 11번 문제
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
				result[i][score[0].length] += score[i][j]; // 행의 합
				result[score.length][j] += score[i][j]; // 열의 합
				result[score.length][score[0].length] += score[i][j]; // 대각선의 합
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
class Exercise5_12 { // 12번 문제
	public static void main(String[] args) {
		String[][] words = {
				{"chair", "의자"}, // words[0][0], words[0][1]
				{"computer", "컴퓨터"}, // words[1][0], words[1][1]
				{"integer", "정수"} // words[2][0], word[2][1]
		};
		
		Scanner scanner = new Scanner(System.in);
		int counter = 0; // MultiArrEx4의 변형! 정답 횟수의 counter
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다. %n%n");
				counter++;
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
			}
		} // for문의 끝
		System.out.println("전체 3문제 중 "+counter+"문제 맞추셨습니다."); // counter를 통해 정답 개수 출력
	} // main의 끝
}
//import java.util.Scanner;
class Exercise5_13 { // 13번 문제
	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray(); // String을 char[]로 변환
			
			for(int j=0; j<question.length; j++) {
				char ch = ' ';
				int h = (int)Math.random()*question.length;
				ch = question[j];
				question[j] = question[h];
				question[h] = ch; // char배열 question 에 담긴 문자의 위치를 임의로 랜덤 교체.
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요,>", i+1, new String(question));
			String answer = scanner.nextLine();
			
			// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			if(words[i].equals(answer.trim()))
					System.out.printf("맞았습니다.%n%n");
			else
				System.out.printf("틀렸습니다.%n%n");
		}
	} // main의 끝
}








