public class ArrayEx16 {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = \""+ args[i]+"\"");
		}
	}
}
// 커맨드라인을 통해 입력을 받는 코드인데 어째서인지 잘 작동하지 않는다. 궁금한건 Scanner 클래스를 사용하지 않아도
// 작동을 하는건지 모르겠다. 일단 책의 예제는 다음과 같이 되어있고 이에 따라 매개변수의 개수는 0개이다.