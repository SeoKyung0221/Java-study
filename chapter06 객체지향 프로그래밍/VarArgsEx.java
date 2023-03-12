public class VarArgsEx {
	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		int x = 1;
		int y = 2;
		int z = 3;
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] {"1","2","3"}));
		System.out.println("["+concatenate(",", new String[0])+"]");
		System.out.println("["+concatenate(",")+"]");
		System.out.println( x+=y+z);
	}
	static String concatenate(String delim, String...args) {
		String result = "";
		for(String str : args) {
			result+=str+delim; // str+delim을 먼저 진행하고 result와 연산.
		}
		return result;
	}
	/*
	static String concatenate(String...args){
		return concatenate("", args);
	*/
}// class
