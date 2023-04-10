class Excercise08_1 {
	// ����ó���� ���α׷� ���� �� �߻��� �� �ִ� ������ �߻��� ����� �ڵ带 �ۼ��ϴ� ��
	// ��, �� ������ ���α׷��� ������ ���Ḧ ����, �������� ������¸� �����ϴ� ���̴�.
}

class Excercise08_2 {
	// d. ȣ�⽺���� main -> method2 -> method1 ������ �޼��带 ȣ���߱� ������
	// ������ ���� stackTrace�� ��µǴ� ���̴�.
}

class Excercise08_3 {
	// d, e ��ӿ� ���� ������ ����� �� �������̵��� ������ ���� �����. �� �� ù��°��
	// public, private�� ���� ������ �����̿��� �ι�°�� �ٷ� ������ ���� ����.
	// ���⼭ a,b,c�� �̸� ���������� d�� Exception�� ��� ������ �����̰�, e�� �ް����µ�
	// ���⼭�� invalid�� not�� exception�� �����̰� ���� �߰��� ������ �ִ� �����̱�
	// ������ �������̵����� ������ ������ ������ �ȵǴ� ������ �� �� �ִ�.
}

class Excercise08_4 {
	// c�� b�� �ٸ��� try - catch���� Exception���ܰ� ���� �����Ѵ�. Exception���ܴ�
	// ��� ������ �����̱� ������ ���� ������ ��� ��� ���ܸ� ó���ع��� ���� �������� �����ؾ��Ѵ�.
}

class Excercise08_5 {
	// ���� �ٲ㰡�� 1, 3, 5, 1, 2, 5, 6�� ��µȴ�.
	// b�� true�϶��� ArithmeticException�� ���� ���ܰ� �����ǹǷ� catch�������� ���Եȴ�.
	// �׷��� ������� 1, 2, 5, 6�� ������ �ڿ������� method�� print������ �аԵȴ�.
}

class Excercise08_6 {
	// ���� �ٲ㰡�� 3, 5�� ��µȴ�.
	// method1�� ȣ��Ǹ� method1���� �ٽ� method2�� ȣ��ǰ� method2���� NullPointerException
	// �� ���ܰ� �߻��ϰ� �̰��� method1���� ���� catch���� ���ϰ� finally�� 3�� ��µȴ�.
	// �ٽ� main���� ���ƿ� �� ���ܸ� Exception e�� catch�ϴ� { }���� catch�ǰ� 5�� ��µȴ�.
}

class Excercise08_7 {
	// 1�� ��µȴ�.
	// ���� �����ѵ� true�̱⶧���� if(true)�� System.exit(0);�� ����ȴ�. ��, ���α׷���
	// ����ȴ�.
}

class Excercise08_8 {
	// input = new Scanner(System.in).nextInt(); ���� ��ſ�
	/*
	  try {
	  		input = new Scanner(System.in).nextInt();
	  	} catch(Exception e) {
	  		System.out.println("��ȿ���� ���� ���Դϴ�. " +  "�ٽ� ���� �Է����ּ���.");
	  		continue;
	  		} �� �����ϸ�ȴ�. �̶� continue�� ���ؼ� �Է��� �ݺ��ؼ� ���� �� �ִ�.
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
			throw new UnsupportedFuctionException("�������� �ʴ� ����Դϴ�.", 100);
		}
	}	
}

class Excercise08_10 {
	// ���� �ٲ㼭 2, 4, 7�� ��µȴ�.
	// ó�� method2���� �� ���ܰ� �߻��Ѵ�. �ٽ� method1���� ���ƿ� �̸� catch�� ������
	// 2�� ��µǰ� �ٽ� ���� e�� �߻��Ѵ�. �ٽ� main���� ���ƿͼ� �� e�� catch�� ������ ����
	// 7�� ��µȴ�.
}