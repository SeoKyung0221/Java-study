public class ArrayEx16 {
	public static void main(String[] args) {
		System.out.println("�Ű������� ����:"+args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = \""+ args[i]+"\"");
		}
	}
}
// Ŀ�ǵ������ ���� �Է��� �޴� �ڵ��ε� ��°������ �� �۵����� �ʴ´�. �ñ��Ѱ� Scanner Ŭ������ ������� �ʾƵ�
// �۵��� �ϴ°��� �𸣰ڴ�. �ϴ� å�� ������ ������ ���� �Ǿ��ְ� �̿� ���� �Ű������� ������ 0���̴�.