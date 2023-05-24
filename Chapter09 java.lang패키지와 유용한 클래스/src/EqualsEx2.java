class Person{
	long id;
	
	public boolean equals(Object obj) { // equals�Լ� �������̵�.
		if(obj instanceof Person)
			return id == ((Person)obj).id; // ObjectŸ���� PersonŸ������ ��ȯ.
		else
			return false;
	}
	Person(long id){
		this.id = id;
	}
}

class EqualsEx2{
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1 == p2)
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		
		if(p1.equals(p2))
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
	}
}
