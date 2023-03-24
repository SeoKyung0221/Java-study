class InstanceOfTest {
	public static void main(String args[]) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) { // true
			System.out.println("This is a FireEngine instance.");
		}
		
		if(fe instanceof Car) { // true
			System.out.println("This is a Car instance.");
		}
		
		if(fe instanceof Object) { // true
			System.out.println("This is an Object instance");
		}
		
		System.out.println(fe.getClass().getName()); // 클래스의 이름을 출력
	}
}// class
/*
Class Car{}
Class FireEngine extends Car{}
*/