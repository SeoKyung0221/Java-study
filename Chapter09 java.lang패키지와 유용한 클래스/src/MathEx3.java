import static java.lang.Math.*;
import static java.lang.System.*;

class MathEx3{
	public static void main(String args[]) {
		int x1 = 1, y1 = 1; // (1,1)
		int x2 = 2, y2 = 2; // (2,2)
		
		double c = sqrt(pow(x2-x1, 2) + pow(y2-y1, 2));
		double a = c * sin(PI/4); // PI/4 rad = 45 degree �� 4/���̴� 45��. ������ ���
		double b = c * cos(PI/4);
		//double b = c* cos(toRadians(45)); // 45���� toRadians �� ȣ�������� �ٲپ��� �� ����/4�� �Ի��ϴ°�.
		
		out.printf("a=%f%n",  a);
		out.printf("b=%f%n", b);
		out.printf("c=%f%n",  c);
		out.printf("angle=%f rad%n" , atan2(a,b)); // arctan ��ũ ź��Ʈ. ź��Ʈ ���Լ�
		out.printf("angle=%f degree%n%n",  atan2(a,b) * 180 / PI);
		//out.printf("angle=%f degree%n%n", toDegrees(atna2(a,b)));
		out.printf("24 * log10(2, args)=%f%n", 24 * log10(2)); // 7.224720 ����� log10(2)�� ���� 10, ������ 2�� ���̴�. ��, 2^24�� ���� ���α� ���!
		out.printf("53 * log10(2, args)=%f%n%n", 53 * log10(2)); // 15.954590 ���α� ������꿡 ���� ���ڸ� �������� ���° �Ҽ����������� Ȯ�ΰ���!
		// ����� ���⼭ 2^24�� 2^53�� ���� ��ġ ë�°�? �ٷ� float�� double�̴�! ��Ȯ���� ���� 7, 15�ΰ� �� �� �ִ�! (23+1), (52+1) ����ȭ�� ���� 1�� �ڸ� Ȯ������.
	}
}