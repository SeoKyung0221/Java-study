class Product{
	static int count = 0; // ������ �ν��Ͻ��� ���� �����ϱ� ���� ����
	int serialNo; // �ν��Ͻ� ������ ��ȣ
	
	{
		++count;
		serialNo = count; // �ν��Ͻ��� ������ �� ���� �� ī��Ʈ�� ���� serialNo�� �����Ѵ�.
	}
	
	public Product() {} // �⺻ ������, ��������(�ڵ�����)
}

class ProductTest{
	public static void main(String[] args) {
		Product p1 =new Product();
		Product p2 =new Product();
		Product p3 =new Product();
		
		System.out.println("p1�� ��ǰ��ȣ(serial no)�� " + p1.serialNo);
		System.out.println("p1�� ��ǰ��ȣ(serial no)�� " + p2.serialNo);
		System.out.println("p1�� ��ǰ��ȣ(serial no)�� " + p3.serialNo);
		System.out.println("����� ��ǰ�� ���� ��� "+Product.count+"�� �Դϴ�.");
	}
}