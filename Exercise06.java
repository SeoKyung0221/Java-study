// 06�� ��ü���� ���α׷���1
/*
class SutdaCard{ // 6-1
	int num; // 1~10������ ����
	boolean isKwang; // ���̸� true, �ƴϸ� false.
}
*/
class SutdaCard{
	int num; // 1~10������ ����
	boolean isKwang; // ���̸� true, �ƴϸ� false.
	
	SutdaCard(){
		this(1, true); // �Ǵٸ� ������ ȣ��.
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang? "K" : ""); // isKwang�� Ʈ��� K(wang) ���, �ƴ϶�� ���X.
	}
} // 6-2�� ������ SutdaCard Ŭ���� ����.
class Exercise6_2{ // 6-2
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.print(card2.info());
	}
}

/*
class Student{ // 6-3
	String name; // �л��̸�
	int ban; // ��
	int no; // ��ȣ
	int kor; // ��������
	int eng; // ��������
	int math; // ��������
}
*/
class Student{
	String name; // �л��̸�
	int ban; // ��
	int no; // ��ȣ
	int kor; // ��������
	int eng; // ��������
	int math; // ��������
	
	int getTotal() {
		int sum = 0;
		sum += kor + eng + math;
		return sum;	
	}
	float getAverage() {
		float average;
		average = (int)(getTotal() / 3.0f * 10 + 0.5f) / 10f; // �Ҽ� ��°�ڸ����� �ݿø��ϴ� �� ��� �� �������!
		return average;
	}
} // 6-4�� ������ Student Ŭ���� ����.
class Exercise6_4 { // 6-4
	public static void main(String args[]) {
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal());
		System.out.println("���:"+s.getAverage());
	}
}
/* 6-5
	String info(){
	return name + ","+ ban + ","+ no + ","+ kor + ","+ eng + ","+ math + ","+
	 getTotal() + ","+ getAverage();
*/

class Exercise6_6{ // 6-6
	// ���� (x, y)�� (x1, y1)���� �Ÿ��� ���Ѵ�.
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt(((x1-x)*(x1-x))+((y1-y)*(y1-y)));
	} // math.pow�� �̿��ص� ������ �׳� �����̶� ���ߴ�.
	// �޼��带 ȣ���ϴ°� �������꺸�� ����� ���� ��� �۾��̴�!! �� ����صѰ�!
	
	public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
	}
}

// 6-7
class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	double getDistance(int a, int b) {
		return Math.sqrt(((a-x)*(a-x))+((b-y)*(b-y)));
	}
}
class Exercise6_7{
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1);
		
		// p�� (2,2)�� �Ÿ��� ���Ѵ�.
		System.out.println(p.getDistance(2, 2));
	}
}

/* 6-8
Ŭ���� ����: width, height
�ν��Ͻ� ����: kind, num
��������: x, n, card(��������)
 */

/* 6-9
weapon, armor ���� ��� ��� ��ü�� �����ؾ��Ѵ�. �߰������� �����Ǵ� ��ü(�ν��Ͻ�)�� ������� ���ݷ°� ������ �����
�̷���� �� �ִ� ���̹Ƿ� weaponUp(), armorUp()�� static�� �ٿ� Ŭ���� �޼��尡 �Ǿ���Ѵ�.
 */

/* 6-10
b(��ü�� �����ϴ°� �ƴ϶� �ʱ�ȭ�� ���� ��), e(�Ű������� �ٸ����Ͽ� �����ε� ����)
 */

/* 6-11
b(d�� �ݷ��� �Ǿ��ش�. Ŭ���� �޼��� �������� ����� �Ұ����ϴ�.)
 */

/* 6-12
c(����Ÿ���� �޶� �����ε��� ������ ���� �ʴ´�. �����ε��� ������ �ִ� ���� ���� �Ű������̴�.) d(�̸��� �ٸ����� �������. Ÿ��
Ȥ�� ������ �޶�� �Ѵ�.)
 */

/* 6-13
b, c, d ��� �����ε��� ������ �����Ѵ�. ��, �Ű������� Ÿ���� �ٸ���.
 */

/* 6-14
c(�ʱ�ȭ ���� ���� ����ȴ�.), d(Ŭ���������� ���� �ʱ�ȭ�ȴ�. Ŭ���� ����� ���ÿ� �ʱ�ȭ �ȴٰ� ����ȴ�.)
 */

/* 6-15
a(Ŭ���� ������ �ƴ� �ν��Ͻ� �����̴�. �ν��Ͻ� ������ �⺻��, ����� �ʱ�ȭ, �ʱ�ȭ ��, ������ ������ �ʱ�ȭ�ȴ�.)
 */

/* 6-16
a(�ڵ� �ʱ�ȭ �ȵȴ�.), e(stack������ �����ȴ�. heap�� �ν��Ͻ� ������.)
*/

/* 6-17
b(�ƴϴ�. ��� �������̴�.) // f�� �ް��� �� �ִµ� �ٸ� �޼������ ����� �ƴ����� ������ �ƴ� �������̴�.
 */

/* 6-18
A(Ŭ���� ������ ������ �ν��Ͻ� ������ �Ҵ��� ���� ����.)
B(Ŭ���� �Լ��� �ν��Ͻ� ������ ȣ���� �� ����.), D(Ŭ���� �Լ��� �ν��Ͻ� �Լ��� ȣ���� ���� ����.)
 */

/* 6-19
ABC123
After change:ABC123 �Ű������� ���� ȣ���̰� change�޼���κ��� ��ȯ�Ǵ� �͵� ������ str�� ������� �ʴ´�.
 */

/* 6-20 -> ������ �ݸ� ���� ����. �ϴ� for���� �ݺ�ũ�⸦ arr.length�� �ι谡 �ƴ� �׳� arr.lengthó���߰�
ù������ if������ �Է¹��� arr�� ���� ó���� ���� ���ߴ�.
class Exercise6_20{
	public static int[] shuffle(int[] arr){
		if(arr==null || arr.length==0)
			return arr;
			
	for(int x=0; x<arr.length*2; x++){
		int i = (int)(Math.random()*arr.length);
		int j = (int)(Math.random()*arr.length);
		
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	return arr;
}
 */

/* 6-21
void turnOnOff(){
	isPowerOn = !ispowerOn;
}
void volumeUp(){
	if(volume < MAX_VOLUME)
		volume++;
}
void VolumeDown(){
	if(volume > MIN_VOLUME)
		volume--;
}
void channelUp(){
	if(channel == MAX_CHANNEL)
		channel = MIN_CHANNEL;
	else
		channel++;
}
void channelDown(){
	if(channel == MIN_CHANNEL)
		channel = MAX_CHANNEL;
	else
		channel--;
}
 */

/* 6-22 -> ���������� �Է¹��� str�� ���� �Է�ó���� ���� ����.
boolean isNumber(String str){
	if(str==null || str.equals(""))
		return false;
	
	for(int i=0; i<str.length(); i++){
		char ch = str.charAt(i); // str���� �ϳ��� ���ڷ� ����.
		
		if(ch < '0' || ch > '9'){
			return false;
		}
	}
	return true;
}
 */

/* 6-23
int max(int[] arr){
	int max = 0;
	
	if(arr==null || arr.length==0)
		return -999999;
	
	for(int i=0; i<arr.length; i++){
		if(a[i] > max)
			max = a[i];
		}
	return max;	
}
*/

/* 6-24
int abs(int value){
	if(value>0)
		return value;
	else
		return -value;
} // return value >=0 ? value : -value; �� �ص��ȴ�.
*/

