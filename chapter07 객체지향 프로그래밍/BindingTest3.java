class BindingTest3 {
	public static void main(String[] args) {
		parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);
		p.method(); // Child�� �޼���
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
		System.out.println("x=" + x); // this.x�� ����.
		System.out.println("super.x=" + super.x); // super�� parent��
		System.out.println("this.x=" + this.x);
	}
}

/*
����.
��� ������ ���������� ����.
�޼���� ������ ���� �ν��Ͻ��� ����.
static �޼���� ���������� ����.
*/