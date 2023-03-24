class BindingTest3 {
	public static void main(String[] args) {
		parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);
		p.method(); // Child의 메서드
		System.out.println();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	int x = 200;
	
	void method() {
		System.out.println("x=" + x); // this.x와 같다.
		System.out.println("super.x=" + super.x); // super는 parent꺼
		System.out.println("this.x=" + this.x);
	}
}

/*
정리.
멤버 변수는 참조변수를 따라감.
메서드는 생성된 실제 인스턴스를 따라감.
static 메서드는 참조변수를 따라감.
*/