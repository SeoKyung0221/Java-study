final class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() { // ...
	}
	
	public static Singleton getInstance() {
		if(s==null)
			s = new Singleton();
		
		return s;
	}
}

class SingletonTest{
	public static void main(String args[]) {
		// Singleton s = new Singleton(); <- 에러! 생성자가 private하기 때문에
		// 인스턴스 생성불가!
		Singleton s = Singleton.getInstance(); // 참조변수가 따로 없기때문에
		// getInstance()함수를 Singleton.을 통해서 불러온다.
	}
}
