public class ArrayEx15 {
	public static void main(String[] args) {
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.", "-..", ".",
				"..-.", "--.", "....", "..", ".---",
				"-.-", ".-..", "--", "-.", "---",
				".--.", "--.-", ".-.", "...", "-",
				"..-", "...-", ".--", "-..-", "-.--", "--.."};

		String result = "";

		for(int i=0; i<source.length(); i++) {
			result +=morse[source.charAt(i)-'A']; // morse 배열의 인덱스를 source의 값으로 넣는다.
		}
		System.out.println("source:"+ source);
		System.out.println("morse:"+result);
	}
}

