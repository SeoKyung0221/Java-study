class Excercise08_1 {
	// 예외처리란 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
	// 즉, 그 목적은 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것이다.
}

class Excercise08_2 {
	// d. 호출스택은 main -> method2 -> method1 순서로 메서드를 호출했기 때문에
	// 문제와 같은 stackTrace가 출력되는 것이다.
}

class Excercise08_3 {
	// d, e 상속에 대한 개념을 배웠을 때 오버라이딩의 주의할 점을 배웠다. 그 중 첫번째가
	// public, private와 같은 공개의 개념이였고 두번째가 바로 예외의 개수 였다.
	// 여기서 a,b,c는 이를 만족하지만 d는 Exception은 모든 예외의 조상이고, e는 햇갈리는데
	// 여기서는 invalid와 not의 exception의 조상이고 무언가 추가로 가지고 있는 조상이기
	// 때문에 오버라이딩에서 예외의 개수가 많아져 안되는 것으로 볼 수 있다.
}

class Excercise08_4 {
	// c는 b와 다르게 try - catch에서 Exception예외가 먼저 등장한다. Exception예외는
	// 모든 예외의 조상이기 때문에 먼저 등장할 경우 모든 예외를 처리해버러 가장 마지막에 등장해야한다.
}

class Excercise08_5 {
	// 행을 바꿔가며 1, 3, 5, 1, 2, 5, 6가 출력된다.
	// b가 true일때만 ArithmeticException의 고의 예외가 생성되므로 catch문장으로 들어가게된다.
	// 그렇지 않을경우 1, 2, 5, 6의 순으로 자연스럽게 method의 print문장을 읽게된다.
}

class Excercise08_6 {
	// 행을 바꿔가며 3, 5가 출력된다.
	// method1이 호출되면 method1에서 다시 method2가 호출되고 method2에서 NullPointerException
	// 의 예외가 발생하고 이것이 method1으로 들어와 catch되지 못하고 finally의 3만 출력된다.
	// 다시 main으로 돌아와 이 예외를 Exception e를 catch하는 { }에서 catch되고 5가 출력된다.
}

class Excercise08_7 {
	// 1만 출력된다.
	// 정말 간단한데 true이기때문에 if(true)로 System.exit(0);이 실행된다. 즉, 프로그램이
	// 종료된다.
}

class Excercise08_8 {
	// input = new Scanner(System.in).nextInt(); 문장 대신에
	/*
	  try {
	  		input = new Scanner(System.in).nextInt();
	  	} catch(Exception e) {
	  		System.out.println("유효하지 않은 값입니다. " +  "다시 값을 입력해주세요.");
	  		continue;
	  		} 로 수정하면된다. 이때 continue로 인해서 입력을 반복해서 받을 수 있다.
	 */
	}

class Excercise08_9 {
	class UnsupportedFuctionException extends RuntimeException {
		private final int ERR_CODE;
		
		UnsupportedFuctionException(String msg, int errCode) {
			super(msg);
			ERR_CODE = errCode;
		}
		
		UnsupportedFuctionException(String msg) {
			this(msg, 100);
		}
		
		public int getErrCode() {
			return ERR_CODE;
		}
		
		public String getMessage() {
			return "["+getErrCode()+"]"+super.getMessage();
		}
	}
	class Excercise9 {
		public static void main(String[] args) throws Exception
		{
			throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
		}
	}	
}

class Excercise08_10 {
	// 행을 바꿔서 2, 4, 7이 출력된다.
	// 처음 method2까지 들어가 예외가 발생한다. 다시 method1으로 돌아와 이를 catch한 블럭에서
	// 2가 출력되고 다시 예외 e가 발생한다. 다시 main으로 돌아와서 이 e를 catch한 블럭으로 들어와
	// 7이 출력된다.
}