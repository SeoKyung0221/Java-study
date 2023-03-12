class Product{
	static int count = 0; // 생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo; // 인스턴스 고유의 번호
	
	{
		++count;
		serialNo = count; // 인스턴스가 생성될 때 마다 그 카운트를 세어 serialNo에 저장한다.
	}
	
	public Product() {} // 기본 생성자, 생략가능(자동생성)
}

class ProductTest{
	public static void main(String[] args) {
		Product p1 =new Product();
		Product p2 =new Product();
		Product p3 =new Product();
		
		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p1의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p1의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 "+Product.count+"개 입니다.");
	}
}